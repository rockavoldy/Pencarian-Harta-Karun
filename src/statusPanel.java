import javax.swing.*;
import java.awt.*;

public class statusPanel extends JPanel {
    private static JFrame frame = new JFrame();
    public statusPanel() {
        setBounds(15, 15, 770, 100);
        setLayout(new GridLayout(4,1));
    }

    public static void addComponent() {
        JPanel sp = new statusPanel();
        // panel status player
        JLabel Hugo = creatorGUI.createStringLabel("Hugo", new Font(Font.SANS_SERIF, Font.BOLD, 15), Color.RED);
        JLabel HP = creatorGUI.createStringLabel(String.format("%s %d / %d", "Health Point :", ThreadGUI.objectPlayer.getStatus("HP"), ThreadGUI.objectPlayer.getMaxStatus("HP")), new Font(Font.MONOSPACED, Font.BOLD, 15), Color.GREEN);
        JLabel MP = creatorGUI.createStringLabel(String.format("%s %d / %d", "Mana Point   :", ThreadGUI.objectPlayer.getStatus("MP"), ThreadGUI.objectPlayer.getMaxStatus("MP")), new Font(Font.MONOSPACED, Font.BOLD, 15), Color.BLUE);
        JLabel Senjata = creatorGUI.createStringLabel(String.format("%s %s (%d)", "Senjata      :", ThreadGUI.objectPlayer.getUsedSenjata(), ThreadGUI.objectPlayer.getAttack()), new Font(Font.MONOSPACED, Font.BOLD, 15), Color.BLACK);
        sp.add(Hugo);
        sp.add(HP);
        sp.add(MP);
        sp.add(Senjata);

        ThreadGUI.addFrameGUI(sp);
    }
}
