import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadGUI extends Thread {
    private static Container gameContainer;
    public static Player objectPlayer;
    private static JFrame frameGUI = new JFrame("Pencarian Harta Kartun");
    private static statusPanel gameStatusPanel = new statusPanel();
    private static storyPanel gameStoryPanel = new storyPanel();
    private static btnHandler btnHandler = new btnHandler();
    private static startHandler startHandler = new startHandler();
    private static JPanel startTitlePanel, startBtnPanel;

    public ThreadGUI() {
        createGUI();
    }

    private void createGUI() {
        frameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGUI.setLayout(null);

        // halaman awal
        startTitlePanel();
        JLabel titleLabel = createTitleLabel();
        startBtnPanel();
        JButton titleBtn = createTitleBtn();
        startTitlePanel.add(titleLabel);
        startBtnPanel.add(titleBtn);

        frameGUI.add(startTitlePanel);
        frameGUI.add(startBtnPanel);

        frameGUI.pack();

        frameGUI.setSize(800,600);
        frameGUI.setVisible(true);

//        Timer timer = new Timer(100, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                refresh();
//                run();
//            }
//        });
//        timer.start();
    }

    private static void startTitlePanel() {
        startTitlePanel = new JPanel();
        startTitlePanel.setBounds(100, 100, 600, 150);
    }

    private static JLabel createTitleLabel() {
        JLabel stringLabel = new JLabel("Pencarian Harta Karun");
        stringLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 36));

        return stringLabel;
    }

    private static void startBtnPanel() {
        startBtnPanel = new JPanel();
        startBtnPanel.setBounds(300, 400, 200, 200);
    }

    private static JButton createTitleBtn() {

        JButton btn = new JButton("Mulai");
        btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 28));
        btn.addActionListener(startHandler);

        return btn;
    }

    public static void createIntroScreen() {
        startTitlePanel.setVisible(false);
        startBtnPanel.setVisible(false);

        // panel status player
        JLabel Hugo = createStringLabel("Hugo", new Font(Font.SANS_SERIF, Font.BOLD, 15), Color.RED);
        JLabel HP = createStringLabel("Health Point :", new Font(Font.MONOSPACED, Font.BOLD, 15), Color.GREEN);
        JLabel MP = createStringLabel("Mana Point   :", new Font(Font.MONOSPACED, Font.BOLD, 15), Color.BLUE);
        JLabel Senjata = createStringLabel("Senjata      :", new Font(Font.MONOSPACED, Font.BOLD, 15), Color.BLACK);
        gameStatusPanel.add(Hugo);
        gameStatusPanel.add(HP);
        gameStatusPanel.add(MP);
        gameStatusPanel.add(Senjata);

        frameGUI.add(gameStatusPanel);

        // panel main text
        String hmm = "Perkenalkan Hugo, seorang pemuda yang saat ini berumur 21 tahun, tidak mempunyai pekerjaan, sangat kesepian, dan tak mempunyai teman.\n\n" +
                "Pemuda itu pergi ke minimarket karena stok makanan di rumahnya sudah habis. Dia hanya bisa membeli beberapa bungkus mie instan karena jatahnya bulan itu sudah hampir habis dan masih ada 7 hari sampai dia dikirim uang oleh orang tuanya. Dia keluar dari minimarket dengan terburu-buru, terlihat seperti sedang menahan untuk buang air. ";

        timer = new Timer(60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (charIndex < hmm.length()) {
                    gameStoryPanel.removeAll();
                    newStory += hmm.charAt(charIndex);
                    JTextArea story = createStoryText(newStory);
                    gameStoryPanel.add(story);
                    refreshStoryPanel();
                    charIndex++;
                } else {
                    stopTimer();
                }
            }
        });
//        frameGUI.add(gameStoryPanel);
        timer.start();
    }

    private static String newStory = "";
    private static int charIndex = 0;
    private static Timer timer;

    private static JLabel createStringLabel(String nama, Font font, Color warna) {
        JLabel stringLabel = new JLabel(nama);
        stringLabel.setText(nama);
        stringLabel.setFont(font);
        stringLabel.setForeground(warna);

        return stringLabel;
    }

    private static JTextArea createStoryText(String story) {

        JTextArea textArea = new JTextArea();
        textArea.append(story);
        textArea.setBounds(100, 100, 600, 250);
        textArea.setEditable(false);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        return textArea;
    }

    private static JButton createBtn(String nama, Font font, Color warna, Color warnaBg, String cmdNama) {

        JButton btn = new JButton(nama);
        btn.setText(nama);
        btn.setFont(font);
        btn.setForeground(warna);
        btn.setBackground(warnaBg);
        btn.addActionListener(btnHandler);
        btn.setActionCommand(cmdNama);

        return btn;
    }

    public static void stopTimer() {
        timer.stop();
    }

    public static void refreshStoryPanel() {
        frameGUI.getContentPane().remove(gameStoryPanel);
        frameGUI.getContentPane().invalidate();
        frameGUI.getContentPane().add(gameStoryPanel);
        frameGUI.getContentPane().revalidate();
        frameGUI.getContentPane().repaint();
    }

    public void run() {

    }
}
