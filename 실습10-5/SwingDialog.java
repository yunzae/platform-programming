import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SwingDialog extends JDialog {
    JTextField textField = new JTextField(10);
    JButton enter = new JButton("Enter");
    JButton cancel = new JButton("cancel");

    public SwingDialog(JFrame frame,String title) {
        super(frame,title);
        setLayout(new FlowLayout());
        add(textField,BorderLayout.NORTH);
        add(enter,BorderLayout.WEST);
        add(cancel,BorderLayout.EAST);
        setSize(200,100);

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(textField.getText(),"Hello"))
                    setVisible(false);
            }
        });

    }
}
