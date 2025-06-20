package universitymanagement;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class TeacherLeave extends JFrame implements ActionListener {

    Choice ops, durationle;
    JDateChooser leavedt;
    JButton btns, btnca;

    TeacherLeave() {
        setSize(560, 560);
        setLocation(350, 38);
//        getContentPane().setBackground(Color.WHITE);
        setTitle("Employee Leave");
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/leave.png"));
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        JLabel lab = new JLabel("Apply Leave (Employee)");
        lab.setBounds(150, 40, 330, 30);
        lab.setFont(new Font("serif", Font.BOLD, 26));
        add(lab);
        JLabel labcap = new JLabel("Search By ID");
        labcap.setBounds(190, 100, 180, 30);
        labcap.setFont(new Font("serif", Font.BOLD, 14));
        add(labcap);
        ops = new Choice();
        ops.setBounds(190, 140, 190, 30);

        ops.setBackground(Color.WHITE);
        add(ops);

        try {
            Conn con = new Conn();
            ResultSet rs = con.sta.executeQuery("SELECT * FROM `teacher_record`");
            while (rs.next()) {
                ops.add(rs.getString("emp_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        JLabel stldob = new JLabel("Date");
        stldob.setBounds(190, 180, 120, 26);
        add(stldob);
        stldob.setFont(new Font("serif", Font.BOLD, 18));

        leavedt = new JDateChooser();
        leavedt.setBounds(190, 210, 190, 26);
        add(leavedt);
        leavedt.setBackground(Color.WHITE);

        JLabel leadu = new JLabel("Duration");
        leadu.setBounds(190, 260, 120, 26);
        leadu.setFont(new Font("serif", Font.BOLD, 18));

        add(leadu);
        leadu.setFont(new Font("serif", Font.BOLD, 18));

        durationle = new Choice();
        durationle.setBounds(190, 290, 190, 30);
        durationle.setBackground(Color.WHITE);
        durationle.add("Half Day");
        durationle.add("Full Day");

        add(durationle);
        //Submit Button
        btns = new JButton("Submit");
        btns.addActionListener(this);
        btns.setBounds(180, 360, 90, 35);
        btns.setBackground(Color.BLACK);
        btns.setForeground(Color.white);
        btns.setFont(new Font("Tohema", Font.BOLD, 15));
        add(btns);
        revalidate();
        repaint();

        //cancel Button
        btnca = new JButton("Cancel");
        btnca.addActionListener(this);
        btnca.setBounds(290, 360, 90, 35);
        btnca.setBackground(Color.BLACK);
        btnca.setForeground(Color.white);
        btnca.setFont(new Font("Tohema", Font.BOLD, 15));
        add(btnca);
        revalidate();
        repaint();

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btns) {
            String empId = ops.getSelectedItem();
            String duration = durationle.getSelectedItem();
            String date = ((JTextField) leavedt.getDateEditor().getUiComponent()).getText();

            try {
                Conn con = new Conn();
                String query = "INSERT INTO `teacher_leave`(`emp_id`,`date`,`duration`)" + " VALUES ('" + empId + "','" + duration + "','" + date + "')";
                con.sta.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Great! Employee Leave Added Successfully. ");
            }catch(Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource() == btnca) {
            this.dispose();
        }

    }

    public static void main(String[] args) {
        new TeacherLeave();

    }

}

