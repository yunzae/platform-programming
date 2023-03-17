import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDialogView extends JFrame {

    public SwingDialogView() {
        JButton button2 = new JButton("show");
        JDialog dialog = new SwingDialog(this,"TableView");
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dialog.setVisible(true);
            }
        });

   ;
        this.add(button2, BorderLayout.CENTER);




    }
}
