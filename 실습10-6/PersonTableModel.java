import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PersonTableModel extends DefaultTableModel {
    private JTable table;
    private JScrollPane scrollPane;

    public PersonTableModel() {
        String header[]={"First Name","Last Name","Sport","# of Years","Vegetarian"};
        String contents[][]={
                {"Kathy","Smith","Snowboarding","5","false"},
                {"John","Doe","Rowing","3","true"},
                {"Sue","Black","Knitting","2","false"},
                {"Jane","White","Speed reading","20","true"},
                {"Joe","Brown","Pool","10","false"}};
        this.table = new JTable(contents,header);
        this.scrollPane = new JScrollPane(table);
    }

    public JScrollPane getScrollPane(){
        return this.scrollPane;
    }
    public JTable getTable(){
        return this.table;
    }

}
