package universitymanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton btn, btnc;
    JTextField ufield;
    JPasswordField pfield;
    

    Login() {
        setTitle("Login");
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setSize(600, 300);
        setLocation(400, 250);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/login.png"));
        setIconImage(icon.getImage());
        //user Labels
        JLabel ulab = new JLabel("User Name");
        add(ulab);
        ulab.setBounds(40, 30, 100, 25);
        //user Fields
         ufield = new JTextField();
        add(ufield);
        ufield.setBounds(130, 30, 140, 25);
        //Pas Labels
        JLabel plab = new JLabel("Password");
        add(plab);
        plab.setBounds(40, 80, 140, 25);
        //Pas Fields
         pfield = new JPasswordField();
        add(pfield);
        pfield.setBounds(130, 80, 140, 25);
        //Submit Button
        btn = new JButton("Submit");
        add(btn);
        btn.addActionListener(this);
        btn.setBounds(70, 140, 90, 30);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.white);
        btn.setFont(new Font("Tohema", Font.BOLD, 15));
        //cancel Button
        btnc = new JButton("Cancel");
        add(btnc);
        btnc.addActionListener(this);

        btnc.setBounds(170, 140, 90, 30);
        btnc.setBackground(Color.BLACK);
        btnc.setForeground(Color.white);
        btnc.setFont(new Font("Tohema", Font.BOLD, 15));
        //Right Img
        ImageIcon uicon = new ImageIcon(ClassLoader.getSystemResource("Images/Rlog.png"));
        Image imglog = uicon.getImage().getScaledInstance(120, 140, Image.SCALE_DEFAULT);
        ImageIcon fimg = new ImageIcon(imglog);
        JLabel imglab = new JLabel(fimg);
        add(imglab);

        imglab.setBounds(390, 25, 120, 140);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnc) {
            this.dispose();
        }
        else if(ae.getSource()==btn){
            String username=ufield.getText();
            String password = new String(pfield.getPassword());
            String query = "SELECT * FROM `login` WHERE `username`='" + username + "' AND `psw`='" + password + "'";

            try{
                Conn c = new Conn();
                ResultSet st=c.sta.executeQuery(query);
                if(st.next()){
                    this.dispose();
                    new DashBoard();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid username and password!");
                }
                c.sta.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
           
        }

    }

    public static void main(String args[]) {
        new Login();
    }

}
