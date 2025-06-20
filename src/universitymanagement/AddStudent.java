package universitymanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class AddStudent extends JFrame implements ActionListener {

    JDateChooser stdob;
    JTextField stnf, stfnf, stadd, stdphn, stem, stdxpm, stxxm, stdcni;
    JLabel rollno;
    Random rollra = new Random();
    long first4 = Math.abs((rollra.nextLong() % 9000L + 1000L));
    JComboBox ccombo, cocombo;
    JButton btn, btnc;
   
    AddStudent() {
        setSize(900, 700);
        setLocation(250, 18);
        setTitle("New Student Registration");
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/stdrecord.png"));
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        JLabel head = new JLabel("New Student Record");
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
        JLabel stroll = new JLabel("Roll #");
        stroll.setBounds(50, 200, 60, 26);
        stroll.setFont(new Font("serif", Font.BOLD, 18));
        add(stroll);

        rollno = new JLabel("BSITS0722" + first4);
        add(rollno);
        rollno.setBounds(150, 200, 200, 26);
        rollno.setFont(new Font("serif", Font.BOLD, 18));

        //4th 
        JLabel stldob = new JLabel("Date of Birth");
        add(stldob);
        stldob.setBounds(410, 200, 120, 26);
        stldob.setFont(new Font("serif", Font.BOLD, 18));
        stdob = new JDateChooser();
        stdob.setBounds(540, 200, 200, 26);
        add(stdob);

        //5th
        JLabel stad = new JLabel("Address");
        stad.setBounds(50, 270, 80, 26);
        stad.setFont(new Font("serif", Font.BOLD, 18));
        add(stad);
        stadd = new JTextField();
        stadd.setBounds(150, 270, 200, 26);
        add(stadd);
        //6th
        JLabel stdph = new JLabel("Phone");
        add(stdph);
        stdph.setBounds(410, 270, 120, 26);
        stdph.setFont(new Font("serif", Font.BOLD, 18));
        stdphn = new JTextField();
        stdphn.setBounds(540, 270, 200, 26);
        add(stdphn);
        //7th
        JLabel stdem = new JLabel("Email Id");
        stdem.setBounds(50, 340, 80, 26);
        stdem.setFont(new Font("serif", Font.BOLD, 18));
        add(stdem);
        stem = new JTextField();
        stem.setBounds(150, 340, 200, 26);
        add(stem);
        //8th
        JLabel stdxm = new JLabel("Matric Marks");
        add(stdxm);
        stdxm.setBounds(410, 340, 120, 26);
        stdxm.setFont(new Font("serif", Font.BOLD, 18));
        stdxpm = new JTextField();
        stdxpm.setBounds(540, 340, 200, 26);
        add(stdxpm);
        //9th
        JLabel stdxxm = new JLabel("Inter Marks");
        stdxxm.setBounds(50, 410, 120, 26);
        stdxxm.setFont(new Font("serif", Font.BOLD, 18));
        add(stdxxm);
        stxxm = new JTextField();
        stxxm.setBounds(150, 410, 200, 26);
        add(stxxm);
        //10th
        JLabel stdcnic = new JLabel("CNIC");
        add(stdcnic);
        stdcnic.setBounds(410, 410, 120, 26);
        stdcnic.setFont(new Font("serif", Font.BOLD, 18));
        stdcni = new JTextField();
        stdcni.setBounds(540, 410, 200, 26);
        add(stdcni);
        //11th
        JLabel courses = new JLabel("Course");
        courses.setBounds(50, 480, 200, 26);
        courses.setFont(new Font("serif", Font.BOLD, 18));
        add(courses);

        String coursecombo[] = {"ADP", "Bsc", "BA", "BS", "MA", "MS", "Msc", "Phd"};
        ccombo = new JComboBox(coursecombo);
        ccombo.setBounds(150, 480, 200, 26);
        ccombo.setBackground(Color.WHITE);
        add(ccombo);
        //12th
        JLabel branches = new JLabel("Branch");
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
            String rolnum = rollno.getText();
            String dob = ((JTextField) stdob.getDateEditor().getUiComponent()).getText();
            String address = stadd.getText();
            String phone = stdphn.getText();
            
            String email = stem.getText();
            String marksmatric = stdxpm.getText();
            String marksinter = stxxm.getText();
            String cnic = stdcni.getText();
            String course = (String) ccombo.getSelectedItem();
            String branch = (String) cocombo.getSelectedItem();
            try {


                String query = "INSERT INTO `student_record`(`std_name`, `father_name`, `roll_number`, `date_birth`, `address`, `phone`, `email_id`, `matric_marks`, `inter_marks`, `cnic_id`, `course`, `branch`) "
                        + "VALUES ('" + name + "','" + fname + "','" + rolnum + "','" + dob + "','" + address + "','" + phone + "','" + email + "','" + marksmatric + "','" + marksinter + "','" + cnic + "','" + course + "','" + branch + "')";
                Conn con = new Conn();
                con.sta.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Great! Student Record Added Successfully. ");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == btnc) {
            this.dispose();
        }

    }

    public static void main(String args[]) {

        new AddStudent();
    }

}
