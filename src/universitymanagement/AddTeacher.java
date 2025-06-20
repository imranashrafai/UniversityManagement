package universitymanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class AddTeacher extends JFrame implements ActionListener {

    JDateChooser empob;
    JTextField stnf, stfnf, stadd, empphn, stem, empxpm, stxxm, empcni;
    JLabel rollno;
    Random rollra = new Random();
    long first4 = Math.abs((rollra.nextLong() % 9000L + 1000L));
    JComboBox ccombo, cocombo;
    JButton btn, btnc;

    AddTeacher() {
        setSize(900, 700);
        setLocation(250, 18);
        setTitle("New Employee Registration");
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/teacherrecord.png"));
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        JLabel head = new JLabel("New Employee Record");
        head.setBounds(300, 20, 500, 50);
        head.setFont(new Font("serif", Font.BOLD, 30));
        add(head);

        //forms
        //1st
        JLabel stln = new JLabel("Name");
        stln.setBounds(50, 130, 60, 26);
        stln.setFont(new Font("serif", Font.BOLD, 18));
        add(stln);
        stnf = new JTextField();
        add(stnf);
        stnf.setBounds(150, 130, 200, 26);
        //2nd
        JLabel stlfn = new JLabel("Father's Name");
        add(stlfn);
        stlfn.setBounds(410, 130, 120, 26);
        stlfn.setFont(new Font("serif", Font.BOLD, 18));

        stfnf = new JTextField();
        add(stfnf);
        stfnf.setBounds(540, 130, 200, 26);
        //3rd
        JLabel stroll = new JLabel("Employee Id");
        stroll.setBounds(48, 200, 100, 26);
        stroll.setFont(new Font("serif", Font.BOLD, 18));
        add(stroll);

        rollno = new JLabel("BCS48911" + first4);
        add(rollno);
        rollno.setBounds(170, 200, 200, 26);
        rollno.setFont(new Font("serif", Font.BOLD, 18));

        //4th 
        JLabel stldob = new JLabel("Date of Birth");
        add(stldob);
        stldob.setBounds(410, 200, 120, 26);
        stldob.setFont(new Font("serif", Font.BOLD, 18));
        empob = new JDateChooser();
        empob.setBounds(540, 200, 200, 26);
        add(empob);

        //5th
        JLabel stad = new JLabel("Address");
        stad.setBounds(50, 270, 80, 26);
        stad.setFont(new Font("serif", Font.BOLD, 18));
        add(stad);
        stadd = new JTextField();
        stadd.setBounds(150, 270, 200, 26);
        add(stadd);
        //6th
        JLabel empph = new JLabel("Phone");
        add(empph);
        empph.setBounds(410, 270, 120, 26);
        empph.setFont(new Font("serif", Font.BOLD, 18));
        empphn = new JTextField();
        empphn.setBounds(540, 270, 200, 26);
        add(empphn);
        //7th
        JLabel empem = new JLabel("Email Id");
        empem.setBounds(50, 340, 80, 26);
        empem.setFont(new Font("serif", Font.BOLD, 18));
        add(empem);
        stem = new JTextField();
        stem.setBounds(150, 340, 200, 26);
        add(stem);
        //8th
        JLabel empxm = new JLabel("Matric Marks");
        add(empxm);
        empxm.setBounds(410, 340, 120, 26);
        empxm.setFont(new Font("serif", Font.BOLD, 18));
        empxpm = new JTextField();
        empxpm.setBounds(540, 340, 200, 26);
        add(empxpm);
        //9th
        JLabel empxxm = new JLabel("Inter Marks");
        empxxm.setBounds(50, 410, 120, 26);
        empxxm.setFont(new Font("serif", Font.BOLD, 18));
        add(empxxm);
        stxxm = new JTextField();
        stxxm.setBounds(150, 410, 200, 26);
        add(stxxm);
        //10th
        JLabel empcnic = new JLabel("CNIC");
        add(empcnic);
        empcnic.setBounds(410, 410, 120, 26);
        empcnic.setFont(new Font("serif", Font.BOLD, 18));
        empcni = new JTextField();
        empcni.setBounds(540, 410, 200, 26);
        add(empcni);
        //11th
        JLabel courses = new JLabel("Qualification");
        courses.setBounds(50, 480, 260, 26);
        courses.setFont(new Font("serif", Font.BOLD, 18));
        add(courses);

        String coursecombo[] = {"ADP", "Bsc", "BA", "BS", "MA", "MS", "Msc", "Phd"};
        ccombo = new JComboBox(coursecombo);
        ccombo.setBounds(160, 480, 190, 26);
        ccombo.setBackground(Color.WHITE);
        add(ccombo);
        //12th
        JLabel branches = new JLabel("Department");
        branches.setBounds(410, 480, 120, 26);
        branches.setFont(new Font("serif", Font.BOLD, 18));
        add(branches);

        String branchcombo[] = {"Computer Science", "Artificial Intelligence", "Information Technology", "Cyber Security", "Software Engineering"};
        cocombo = new JComboBox(branchcombo);
        cocombo.setBounds(540, 480, 200, 26);
        cocombo.setBackground(Color.WHITE);
        add(cocombo);
        //Submit Button
        btn = new JButton("Submit");
        add(btn);
        btn.addActionListener(this);
        btn.setBounds(310, 570, 90, 35);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.white);
        btn.setFont(new Font("Tohema", Font.BOLD, 15));
        //cancel Button
        btnc = new JButton("Cancel");
        add(btnc);
        btnc.addActionListener(this);
        btnc.setBounds(430, 570, 90, 35);
        btnc.setBackground(Color.BLACK);
        btnc.setForeground(Color.white);
        btnc.setFont(new Font("Tohema", Font.BOLD, 15));

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn) {
            String name = stnf.getText();
            String fname = stfnf.getText();
            String emp_id = rollno.getText();
            String dob = ((JTextField) empob.getDateEditor().getUiComponent()).getText();
            String address = stadd.getText();
            String phone = empphn.getText();

            String email = stem.getText();
            String marksmatric = empxpm.getText();
            String marksinter = stxxm.getText();
            String cnic = empcni.getText();
            String quali = (String) ccombo.getSelectedItem();
            String depar = (String) cocombo.getSelectedItem();
            try {

                String query = "INSERT INTO `teacher_record`(`emp_name`, `father_name`, `emp_id`, `date_birth`, `address`, `phone`, `email_id`, `matric_marks`, `inter_marks`, `cnic_id`, `quali_emp`, `department`) "
                        + "VALUES ('" + name + "','" + fname + "','" + emp_id + "','" + dob + "','" + address + "','" + phone + "','" + email + "','" + marksmatric + "','" + marksinter + "','" + cnic + "','" + quali + "','" + depar + "')";
                Conn con = new Conn();
                con.sta.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Great! Employee Record Added Successfully. ");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == btnc) {
            //Last Lab Mam said perform many action with a single click Example is here ..
            this.dispose();
            new DashBoard();
        }

    }

    public static void main(String args[]) {

        new AddTeacher();
    }

}
