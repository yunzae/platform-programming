import javax.swing.*;
import java.awt.*;

public class HelloSwingWorldView extends JFrame {
    public HelloSwingWorldView() {
        JLabel label = new JLabel("Hello, World");
        this.getContentPane().add(label);
    }
}
