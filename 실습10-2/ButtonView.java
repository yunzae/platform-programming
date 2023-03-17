import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonView extends JFrame {

    public ButtonView() {
        JButton button1 = new JButton("Disable middle button");
        JButton button2 = new JButton("Middle button");
        JButton button3 = new JButton("Enable middle button");

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(true);
            }
        });
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "dialog", "Message", JOptionPane.WARNING_MESSAGE);
            }
        });
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(false);
            }
        });
        add(button1, BorderLayout.WEST);
        add(button2, BorderLayout.CENTER);
        add(button3, BorderLayout.EAST);
        button3.setEnabled(false);



    }
}
