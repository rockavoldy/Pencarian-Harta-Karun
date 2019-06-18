import javax.swing.*;
import java.awt.*;

public class ThreadGUI extends Thread {
    public static Player objectPlayer;
    public static JFrame frameGUI = new JFrame("Pencarian Harta Kartun");
    private static JPanel startTitlePanel, startBtnPanel;

    public ThreadGUI() {
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
        JButton titleBtn = creatorGUI.createBtn("Mulai", new Font(Font.SANS_SERIF, Font.BOLD, 28), "start");
        startTitlePanel.add(titleLabel);
        startBtnPanel.add(titleBtn);

        frameGUI.add(startTitlePanel);
        frameGUI.add(startBtnPanel);

        frameGUI.pack();

        frameGUI.setSize(800,600);
        frameGUI.setVisible(true);
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

    public static void createIntroScreen() {
        startTitlePanel.setVisible(false);
        startBtnPanel.setVisible(false);
        Player.chapterAktif = 1;
        storyPanel.addStory("Perkenalkan Hugo, seorang pemuda yang saat ini berumur 21 tahun, tidak mempunyai pekerjaan, sangat kesepian, dan tak mempunyai teman.\n\nPemuda itu pergi ke minimarket karena stok makanan di rumahnya sudah habis. Dia hanya bisa membeli beberapa bungkus mie instan karena jatahnya bulan itu sudah hampir habis dan masih ada 7 hari sampai dia dikirim uang oleh orang tuanya. Dia keluar dari minimarket dengan terburu-buru, terlihat seperti sedang menahan untuk buang air.");
    }

    public static void createChapter2Screen() {
        frameGUI.getContentPane().removeAll();
        Player.chapterAktif = 2;
        storyPanel.chapterIni = 2;
        storyPanel.tahapStory = 1;
        storyPanel.addStory("Hugo terbangun di sebuah padang rumput luas yang dihuni banyak hewan. Ia melihat keatas langit dan cuaca sedikit mendung. Hugo sedang mencoba untuk melihat sekitar...");
    }
}
