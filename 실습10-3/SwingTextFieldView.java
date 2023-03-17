import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTextFieldView extends JFrame {

    public SwingTextFieldView() {

        JTextField textfield = new JTextField("",25);
        JButton button = new JButton("Enter");
        TextArea textArea = new TextArea(7,25);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textfield.getText()+"\n");
            }
        });



        this.add(textfield,BorderLayout.WEST);
        this.add(button,BorderLayout.EAST);
        this.add(textArea,BorderLayout.SOUTH);



        this.setVisible(true);
    }
}
