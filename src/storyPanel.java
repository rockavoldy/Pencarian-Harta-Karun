import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class storyPanel extends JPanel {
    private static Timer timer, delay;
    private static int charIndex;
    private static String newStory;
    public static JPanel sp;
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

    public static void cleanUp() {
        ThreadGUI.frameGUI.getContentPane().removeAll();
        ThreadGUI.frameGUI.getContentPane().revalidate();
        ThreadGUI.frameGUI.getContentPane().repaint();
    }

    public static void stopTimer() {
        timer.stop();
        if (Player.isGameOver() == false) {
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
                if (tahapStory == 1) {
                    chapter("Utara", "Barat", "Timur", "Selatan");
                }

                if (tahapStory == 2) {
                    chapter("Pergi ke gua", null, null, null);
                }

                if (tahapStory == 3) {
                    chapter("Next", null, null, null);
                }

                if (tahapStory == 4) {
                    chapter("Masuk menyusuri gua", null, null, null);
                }

                if (tahapStory == 5) {
                    chapter("\"\'Trainer\'? apa maksudnya itu?\"", null, null, null);
                }

                if (tahapStory == 6) {
                    chapter("Serang untuk mencoba kekuatan ini", "Sepertinya ini bohongan", null, null);
                }
            }
        } else {
            if (Player.chapterAktif == chapterIni && tahapStory == 5) {
                ThreadGUI.frameGUI.getContentPane().revalidate();
                ThreadGUI.frameGUI.getContentPane().repaint();
            }
        }
        tahapStory++;
    }

    private static void chapter(String btn1, String btn2, String btn3, String btn4) {
        if (Player.chapterAktif == chapterIni) {
            btnPanel.addComponent(btn1, btn2, btn3, btn4);
        }
    }

    public static void refresh() {
        ThreadGUI.frameGUI.getContentPane().remove(sp);
        ThreadGUI.frameGUI.getContentPane().invalidate();
        ThreadGUI.frameGUI.getContentPane().add(sp);
        ThreadGUI.frameGUI.getContentPane().revalidate();
        ThreadGUI.frameGUI.getContentPane().repaint();
    }
}
