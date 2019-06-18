import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btnHandler implements ActionListener {
    Chapter chapter1 = new Chapter(1);
    Chapter chapter2 = new Chapter(2);
    public void actionPerformed(ActionEvent event) {
        String kodeBtn = event.getActionCommand();
        switch (kodeBtn) {
            case "start":
                ThreadGUI.createIntroScreen();
                break;
            case "next":
                switch (Player.chapterAktif) {
                    case 1:
                        chapter1.aksi("next", storyPanel.tahapStory);
                        break;
                    case 2:
                        chapter2.aksi("next", storyPanel.tahapStory);
                        break;
                }
                break;
            case "a":
                switch (Player.chapterAktif) {
                    case 1:
                        chapter1.aksi("a", storyPanel.tahapStory);
                        break;
                    case 2:
                        chapter2.aksi("a", storyPanel.tahapStory);
                        break;
                }
                break;
            case "b":
                switch (Player.chapterAktif) {
                    case 1:
                        chapter1.aksi("b", storyPanel.tahapStory);
                        break;
                    case 2:
                        chapter2.aksi("b", storyPanel.tahapStory);
                        break;
                }
                break;
            case "c":
                switch (Player.chapterAktif) {
                    case 1:
                        chapter1.aksi("c", storyPanel.tahapStory);
                        break;
                    case 2:
                        chapter2.aksi("c", storyPanel.tahapStory);
                        break;
                }
                break;
        }
    }
}
