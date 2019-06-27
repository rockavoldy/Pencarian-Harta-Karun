import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class creatorGUI {
    private static btnHandler btnHandler = new btnHandler();
    public static JLabel createStringLabel(String nama, Font font, Color warna) {
        JLabel stringLabel = new JLabel(nama);
        stringLabel.setText(nama);
        stringLabel.setFont(font);
        stringLabel.setForeground(warna);

        return stringLabel;
    }

    public static JTextArea createStoryText(String story) {
        JTextArea textArea = new JTextArea();
        textArea.append(story);
        textArea.setBounds(100, 100, 600, 250);
        textArea.setEditable(false);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        return textArea;
    }

//    public static JLabel createImageLabel(String location) throws IOException {
//        BufferedImage image;
//        image = ImageIO.read(new File("/Users/fuu/assets/title.png"));
//        JLabel image = new JLabel(new ImageIcon(img));
//        imagee.add(image);
//
//        return imagee;
//    }

    public static JButton createBtn(String nama, Font font, String cmdName) {
        JButton btn = new JButton(nama);
        btn.setText(nama);
        btn.setFont(font);
        btn.addActionListener(btnHandler);
        btn.setActionCommand(cmdName);

        return btn;
    }
}
