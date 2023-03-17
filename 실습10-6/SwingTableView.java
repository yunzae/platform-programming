import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTableView  extends JFrame {
    JButton info = new JButton("info");


    public SwingTableView(DefaultTableModel model){
        PersonTableModel newmodel = (PersonTableModel)model;
        this.add(newmodel.getScrollPane());
        info.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int row = newmodel.getTable().getSelectedRow();
                TableModel data = newmodel.getTable().getModel();
                String FirstName = (String)data.getValueAt(row,0);
                String LastName = (String)data.getValueAt(row,1);
                String Sport = (String)data.getValueAt(row,2);
                String Year = (String)data.getValueAt(row,3);
                String Vegetarian = (String)data.getValueAt(row,4);
                String msg= Integer.toString(row) +"   "+ FirstName+"\t"+LastName+"\t"+Sport+"\t"+Year+"\t"+Vegetarian+"\t"+"\n";
                System.out.println(msg);
            }

        });


        this.add(info,BorderLayout.SOUTH);
    }

}
