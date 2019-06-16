import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {

        ThreadGUI.createIntroScreen();
    }
}
