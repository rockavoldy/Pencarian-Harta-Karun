import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class ThreadGUI extends Thread {
    public static Player objectPlayer;
    public static JFrame frameGUI = new JFrame("Isekai-isekai-an");
    private static JPanel startTitlePanel, startBtnPanel;
    private Senjata sapuLidi = new SenjataFisik("lidi", "Sapu Lidi", 6);
    public static Timer delay;

    public ThreadGUI() {
        int[] stats = {5,5,5};
        objectPlayer = new Player(stats, sapuLidi, 0);
        createGUI();
    }

    public static void addFrameGUI(JPanel jp) {
        frameGUI.add(jp);
    }

    private void createGUI() {
        frameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGUI.setLayout(null);

        // halaman awal
        startTitlePanel();
        JLabel titleLabel = createTitleLabel();
        startBtnPanel();
        JButton titleBtn = creatorGUI.createBtn("Mulai", new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.BOLD, 28), "start");
        startTitlePanel.add(titleLabel);
        startBtnPanel.add(titleBtn);

        frameGUI.add(startTitlePanel);
        frameGUI.add(startBtnPanel);
//        frameGUI.add(new ImagePanel());

        frameGUI.pack();

        frameGUI.setSize(800,600);
        frameGUI.setVisible(true);
    }

    private static void startTitlePanel() {
        startTitlePanel = new JPanel();
        startTitlePanel.setBounds(100, 100, 600, 150);
    }

    private static JLabel createTitleLabel() {
        JLabel stringLabel = new JLabel("Isekai-Isekai-an");
        stringLabel.setFont(new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.BOLD, 36));

        return stringLabel;
    }

    private static void startBtnPanel() {
        startBtnPanel = new JPanel();
        startBtnPanel.setBounds(300, 400, 200, 200);
    }

    public static void createIntroScreen() {
        startTitlePanel.setVisible(false);
        startBtnPanel.setVisible(false);
        objectPlayer.incChapter();
        storyPanel.addStory("Perkenalkan Hugo, seorang pemuda yang saat ini berumur 21 tahun, tidak mempunyai pekerjaan, sangat kesepian, dan tak mempunyai teman.\n\nPemuda itu pergi ke minimarket karena stok makanan di rumahnya sudah habis. Dia hanya bisa membeli beberapa bungkus mie instan karena jatahnya bulan itu sudah hampir habis dan masih ada 7 hari sampai dia dikirim uang oleh orang tuanya. Dia keluar dari minimarket dengan terburu-buru, terlihat seperti sedang menahan untuk buang air.");
    }

    public static void createChapter2Screen() {
        frameGUI.getContentPane().removeAll();
        objectPlayer.incChapter();
        storyPanel.chapterIni = 2;
        storyPanel.tahapStory = 1;
        storyPanel.addStory("Hugo terbangun di sebuah padang rumput luas yang dihuni banyak hewan. Ia melihat keatas langit dan cuaca sedikit mendung. Hugo sedang mencoba untuk melihat sekitar...");
    }

    public static void createChapter3Screen() {
        frameGUI.getContentPane().removeAll();
        objectPlayer.incChapter();
        storyPanel.chapterIni = 3;
        storyPanel.tahapStory = 1;
        storyPanel.addStory("pelan-pelan ia memasuki pintu itu, pintu tertutup dan terkunci dengan sendirinya tetapi kunci perak tadi ada di sksk satunya\n" +
                "Hugo: \"Sial, aku meninggalkan kuncinya disana...\"\n" +
                "Saat ini yang ia lihat hanya lorong gelap tak berujung dengan dinding penuh lumut, dan disebelah kiri pintu ada sebuah obor.. dan sebuah korek di sebelah kanan pintu.");
    }

    public static void createGameOverScreen() {
        delay = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameGUI.getContentPane().removeAll();
                frameGUI.getContentPane().invalidate();
                JPanel gameOver = new JPanel();
                gameOver.setBounds(100, 200, 600, 150);

                JLabel gameOverLabel = new JLabel("Game Over");
                gameOverLabel.setFont(new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.BOLD, 48));
                delay.stop();
                gameOver.add(gameOverLabel);
                frameGUI.getContentPane().add(gameOver);
                frameGUI.getContentPane().revalidate();
                frameGUI.getContentPane().repaint();
            }
        });
        delay.start();

    }

//    class ImagePanel extends JPanel {
//        private BufferedImage image;
//        private String lokasi = "/Users/fuu/assets/title.png";
//        public ImagePanel() {
//            setBorder(BorderFactory.createLineBorder(Color.BLACK));
//            try {
//                image = ImageIO.read(new File(lokasi));
//            } catch (IOException e) {
//                System.out.println("Error");
//            }
//        }
//
//        public Dimension getPreferredSize() {
//            return new Dimension(150, 150);
//        }
//
//        public void paintComponent(Graphics g) {
//            g.drawImage(image, 100, 150, 150, 150, this);
//        }
//    }
}
