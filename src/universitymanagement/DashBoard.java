package universitymanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener {

    DashBoard() {
        setSize(900, 700);
        setBounds(240, 10, 900, 700);
        setTitle("University DashBoard");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/logo.png"));
        setIconImage(icon.getImage());

        JLabel head = new JLabel("Welcome to University of Lahore");
        head.setBounds(180, 200, 570, 50);
        head.setForeground(Color.WHITE);
        head.setFont(new Font("serif", Font.BOLD, 38));
        add(head);
        JLabel head2 = new JLabel("The University of Lahore, abbreviated as UOL,is");
        head2.setBounds(220, 240, 900, 50);
        head2.setForeground(Color.WHITE);
        head2.setFont(new Font("serif", Font.BOLD, 24));
        add(head2);
        JLabel head3 = new JLabel(" private university located in Lahore, Punjab, Pakistan.");
        head3.setBounds(220, 270, 900, 50);
        head3.setForeground(Color.WHITE);
        head3.setFont(new Font("serif", Font.BOLD, 24));
        add(head3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/uol.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        add(image);
        JMenuBar mb = new JMenuBar();
        //Menu 1
        JMenu newinfo = new JMenu("New Information");
        mb.add(newinfo);
        JMenuItem finfo = new JMenuItem("New Faculty Information");
        finfo.addActionListener(this);
        finfo.setForeground(Color.darkGray);
        newinfo.add(finfo);
        JMenuItem stdinfo = new JMenuItem("New Student Information");
        stdinfo.addActionListener(this);
        stdinfo.setForeground(Color.darkGray);
        newinfo.add(stdinfo);
        //Menu 2
        JMenu details = new JMenu("View Details");
        mb.add(details);
        JMenuItem fdet = new JMenuItem("Faculty Details");
        fdet.addActionListener(this);
        fdet.setForeground(Color.darkGray);
        details.add(fdet);
        JMenuItem stddet = new JMenuItem("Student Details");
        stddet.addActionListener(this);
        stddet.setForeground(Color.darkGray);
        details.add(stddet);
        //Leaves
        JMenu leave = new JMenu("Apply Leaves");
        mb.add(leave);
        JMenuItem fleave = new JMenuItem("Faculty Leaves");
        fleave.addActionListener(this);
        fleave.setForeground(Color.darkGray);
        leave.add(fleave);
        JMenuItem stdleave = new JMenuItem("Student Leaves");
        stdleave.addActionListener(this);
        stdleave.setForeground(Color.darkGray);
        leave.add(stdleave);
        //Leaves Details
        JMenu leavedt = new JMenu("Leaves Details");
        mb.add(leavedt);
        JMenuItem fleavedt = new JMenuItem("Faculty Leaves Detail");
        fleavedt.addActionListener(this);
        fleavedt.setForeground(Color.darkGray);
        leavedt.add(fleavedt);
        JMenuItem stdleavedt = new JMenuItem("Student Leaves Detail");
        stdleavedt.addActionListener(this);
        stdleavedt.setForeground(Color.darkGray);
        leavedt.add(stdleavedt);
        //Exams
        JMenu exams = new JMenu("Examination");
        mb.add(exams);
        JMenuItem examsdt = new JMenuItem("Results");
        examsdt.addActionListener(this);
        examsdt.setForeground(Color.darkGray);
        exams.add(examsdt);
        JMenuItem marks = new JMenuItem("Marks Entry");
        marks.addActionListener(this);
        marks.setForeground(Color.darkGray);
        exams.add(marks);
        //Updatinfo
        JMenu uinfo = new JMenu("Update Details");
        mb.add(uinfo);
        JMenuItem ufdt = new JMenuItem("Update Faculty Details");
        ufdt.addActionListener(this);
        ufdt.setForeground(Color.darkGray);
        uinfo.add(ufdt);
        JMenuItem ustddt = new JMenuItem("Update Student Details");
        ustddt.addActionListener(this);
        ustddt.setForeground(Color.darkGray);
        uinfo.add(ustddt);
        //Fees
        JMenu fee = new JMenu("Fee Details");
        mb.add(fee);
        JMenuItem fest = new JMenuItem("Fee Structure");
        fest.addActionListener(this);
        fest.setForeground(Color.darkGray);
        fee.add(fest);
        JMenuItem fedt = new JMenuItem("Student Fee Form");
        fedt.addActionListener(this);
        fedt.setForeground(Color.darkGray);
        fee.add(fedt);

        //Utility
        JMenu ut = new JMenu("Utility");
        mb.add(ut);
        JMenuItem ntp = new JMenuItem("Notepad");
        ntp.addActionListener(this);
        ntp.setForeground(Color.darkGray);
        ut.add(ntp);
        JMenuItem cal = new JMenuItem("Calculator");
        cal.addActionListener(this);
        cal.setForeground(Color.darkGray);
        ut.add(cal);
        //about
        JMenu abt = new JMenu("About");
        mb.add(abt);
        JMenuItem ab = new JMenuItem("About");
        ab.addActionListener(this);
        ab.setForeground(Color.darkGray);
        abt.add(ab);
        //Exit
        JMenu exit = new JMenu("Exit");
        mb.add(exit);
        JMenuItem ex = new JMenuItem("Exit");
        ex.addActionListener(this);
        ex.setForeground(Color.darkGray);
        exit.add(ex);
        setJMenuBar(mb);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String chk = ae.getActionCommand();
        if (chk.equals("Exit")) {
            this.dispose();
        } else if (chk.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exec");
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (chk.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exec");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (chk.equals("New Faculty Information")) {

            new AddTeacher();

        } else if (chk.equals("New Student Information")) {
            new AddStudent();
        } else if (chk.equals("Faculty Details")) {
            new TeacherDetails();
        } else if (chk.equals("Student Details")) {
            new StudentDetails();
        } else if (chk.equals("Faculty Leaves")) {
            new TeacherLeave();
        } else if (chk.equals("Student Leaves")) {
            new StudentLeave();
        } else if (chk.equals("Faculty Leaves Detail")) {
            new TeacherLeaveDetails();
        } else if (chk.equals("Student Leaves Detail")) {
            new StudentLeaveDetails();
        } else if (chk.equals("Results")) {
            new ExaminationDetails();
        } else if (chk.equals("Marks Entry")) {
            new EnterMarks();
        } else if (chk.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (chk.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (chk.equals("Fee Structure")) {
            new FeeStructure();
        } else if (chk.equals("Student Fee Form")) {
            new FeeStructure();
        } else if (chk.equals("About")) {
            new About();
        }

    }

    public static void main(String args[]) {
        new DashBoard();
    }

}
