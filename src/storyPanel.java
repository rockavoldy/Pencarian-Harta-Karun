import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class storyPanel extends JPanel {
    private static Timer timer, delay;
    private static int charIndex;
    private static String newStory;
    private static JPanel sp;
    public static int tahapStory = 1;
    public static int chapterIni = 1;

    public storyPanel() {
        setBounds(15, 415, 770, 150);
        setLayout(new GridLayout(1,1));
        charIndex = 0;
        newStory = "";
    }

    public static void addStory(String story) {
        if (charIndex != 0) {
            cleanUp();
        }
        statusPanel.addComponent();
        sp = new storyPanel();
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (charIndex < story.length()) {
                    sp.removeAll();
                    newStory += story.charAt(charIndex);
                    JTextArea story = creatorGUI.createStoryText(newStory);
                    sp.add(story);
                    refresh();
                    charIndex++;
                } else {
                    stopTimer();
                    refresh();
                }
            }
        });
        timer.start();
    }

    private static void cleanUp() {
        ThreadGUI.frameGUI.getContentPane().removeAll();
        ThreadGUI.frameGUI.getContentPane().revalidate();
        ThreadGUI.frameGUI.getContentPane().repaint();
    }

    private static void stopTimer() {
        timer.stop();
        if (!Player.isGameOver()) {
            if (chapterIni == 1) {
                if (tahapStory < 4) {
                    chapter("Next", null, null, null);
                }

                if (tahapStory == 4) {
                    chapter(null,"Menunggu", "Dihidupkan kembali", null);
                }

                if (tahapStory == 5) {
                    chapter(null,"Kekuatan Fisik", "Kekuatan Sihir", null);
                }

                if (tahapStory == 6) {
                    chapter("Next", null, null, null);
                }

                if (tahapStory == 7) {
                    delay = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            cleanUp();
                            delay.stop();
                            ThreadGUI.createChapter2Screen();
                        }
                    });
                    delay.start();
                }
            }

            if (chapterIni == 2) {
                switch (tahapStory) {
                    case 1:
                        chapter("Utara", "Barat", "Timur", "Selatan");
                        break;
                    case 2:
                        chapter("Pergi ke gua", null, null, null);
                        break;
                    case 3:
                        chapter("Next", null, null, null);

                        System.out.println("hello");
                        break;
                    case 4:
                        chapter("Masuk menyusuri gua", null, null, null);
                        break;
                    case 5:
                        chapter("\"\'Trainer\'? apa maksudnya itu?\"", null, null, null);
                        break;
                    case 6:
                        chapter("Serang untuk mencoba kekuatan ini", "Sepertinya ini bohongan", null, null);
                        break;
                    case 7:
                        chapter("Next", null, null, null);
                        break;
                    case 8:
                        chapter("Next", null, null, null);
                        break;
                    case 9:
                        chapter("Next", null, null, null);
                        break;
                    case 10:
                        chapter("Lanjut menuju cahaya", "Membuka pintu", null, null);
                        break;
                    case 11:
                        chapter("Next", null, null, null);
                        break;
                    case 12:
                        chapter("Lampung", "Sumedang", "Bandung", "Aku tak mengerti");
                        break;
                    case 13:
                        chapter(null, null, null, "Kembali");
                        break;
                    case 14:
                        chapter(null, null, null, "Next");
                    case 15:
                        chapter("Lampung", "Sumedang", "Bandung", null);
                        break;
                    case 16:
                        chapter("Kembali ke pintu kayu", null, null, null);
                        break;
                    case 17:
                        chapter("Gunakan kunci perak", null, null, null);
                        break;
                    case 18:
                        delay = new Timer(2000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                cleanUp();
                                delay.stop();
                                ThreadGUI.createChapter3Screen();
                            }
                        });
                        delay.start();
                }
            }

            if (chapterIni == 3) {
                switch (tahapStory) {
                    case 1:
                        chapter("Menunggu, terlalu berisiko", "Mencari jalan keluar lain", null, null);
                        break;
                    case 2:
                        chapter("kiri", "kanan", null, null);
                        break;
                    case 3:
                        chapter("Ambil", "Tidak perlu", null, null);
                        break;
                    case 4:
                        chapter("kiri", "kanan", null, null);
                        break;
                    case 5:
                        chapter("lemparkan obor", "lari", null, null);
                }
            }
        } else {
            if (ThreadGUI.objectPlayer.getChapter() == chapterIni && tahapStory == 5) {
                ThreadGUI.frameGUI.getContentPane().revalidate();
                ThreadGUI.frameGUI.getContentPane().repaint();
            }
        }
        tahapStory++;
    }

    private static void chapter(String btn1, String btn2, String btn3, String btn4) {
        if (ThreadGUI.objectPlayer.getChapter() == chapterIni) {
            btnPanel.addComponent(btn1, btn2, btn3, btn4);
        }
    }

    private static void refresh() {
        ThreadGUI.frameGUI.getContentPane().remove(sp);
        ThreadGUI.frameGUI.getContentPane().invalidate();
        ThreadGUI.frameGUI.getContentPane().add(sp);
        ThreadGUI.frameGUI.getContentPane().revalidate();
        ThreadGUI.frameGUI.getContentPane().repaint();
    }
}
