package universitymanagement;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class TeacherDetails extends JFrame implements ActionListener {

    Choice crollnum;
    JTable table;
    JButton search, print, update, add, cancel;

    TeacherDetails() {
        setSize(900, 700);
        setLocation(250, 18);
        setTitle("View Employees' Details");
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/info.png"));
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        JLabel tabletop = new JLabel("Search By Employee ID");

        tabletop.setBounds(50, 44, 190, 30);
        tabletop.setFont(new Font("serif", Font.BOLD, 17));
        add(tabletop);
        crollnum = new Choice();
        crollnum.setBounds(260, 50, 130, 30);
        crollnum.setBackground(Color.WHITE);
        add(crollnum);

        try {
            Conn c = new Conn();
            ResultSet rs = c.sta.executeQuery("SELECT * FROM `teacher_record`");
            while (rs.next()) {
                crollnum.add(rs.getString("emp_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.sta.executeQuery("SELECT * FROM `teacher_record`");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 120, 900, 700);
        add(jsp);

        search = new JButton("Search");
        search.setBounds(20, 90, 80, 20);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);
        revalidate();
        repaint();

        print = new JButton("Print");
        print.setBounds(120, 90, 80, 20);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        add(print);
        revalidate();
        repaint();

        add = new JButton("Add");
        add.setBounds(220, 90, 80, 20);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        revalidate();
        repaint();

        update = new JButton("Update");
        update.setBounds(320, 90, 80, 20);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        revalidate();
        repaint();

        cancel = new JButton("Cancel");
        cancel.setBounds(420, 90, 80, 20);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        revalidate();
        repaint();

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "SELECT * FROM `teacher_record` WHERE emp_id = '" + crollnum.getSelectedItem() + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.sta.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == add) {
            new AddTeacher();
        } else if (ae.getSource() == update) {
            new UpdateStudent();
        }
        else if (ae.getSource() == cancel) {
            this.dispose();
        }
    }

    public static void main(String[] args) {

        new TeacherDetails();
    }

}
