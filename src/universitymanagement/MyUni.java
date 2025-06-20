package universitymanagement;

import javax.swing.*;
import java.awt.*;

public class MyUni extends JFrame {

    MyUni() {
        setTitle("University Management System");
        setLayout(null);
        setLocation(0, 0);
        setResizable(false);
        //Favicon
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Images/logo.png"));
        setIconImage(icon.getImage());
        //Background
        ImageIcon Bg = new ImageIcon(ClassLoader.getSystemResource("Images/MyBg.jpg"));
        Image ImgLab1 = Bg.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon Imgcon = new ImageIcon(ImgLab1);
        JLabel jlab = new JLabel(Imgcon);
        jlab.setBounds(0,0,1200,700);
        add(jlab);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        try{
        Thread.sleep(20);
        setLocation(100, 10);
        setSize(1200, 700);
        
    }
        catch(Exception e){
                System.out.println(e);
                }
        

    }

    public static void main(String args[]) {
        new MyUni();

    }
}
