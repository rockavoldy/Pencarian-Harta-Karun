import javax.swing.*;
import java.awt.*;

public class btnPanel extends JPanel {
    public btnPanel() {
        setBounds(15, 350, 770, 50);
        setLayout(new GridLayout(1,3));
    }

    public static void addComponent(String btnNama1, String btnNama2, String btnNama3, String btnNama4) {
        JPanel bp = new btnPanel();
        // panel button player
        if (btnNama1 != null) {
            JButton btn1 = creatorGUI.createBtn(btnNama1, new Font(Font.SANS_SERIF, Font.BOLD, 14), "next");
            bp.add(btn1);
        }
        if (btnNama2 != null) {
            JButton btn2 = creatorGUI.createBtn(btnNama2, new Font(Font.SANS_SERIF, Font.BOLD, 14), "a");
            bp.add(btn2);
        }
        if (btnNama3 != null) {
            JButton btn3 = creatorGUI.createBtn(btnNama3, new Font(Font.SANS_SERIF, Font.BOLD, 14), "b");
            bp.add(btn3);
        }
        if (btnNama4 != null) {
            JButton btn4 = creatorGUI.createBtn(btnNama4, new Font(Font.SANS_SERIF, Font.BOLD, 14), "c");
            bp.add(btn4);
        }

        ThreadGUI.addFrameGUI(bp);
    }
}
