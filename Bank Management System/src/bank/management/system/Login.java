package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login,signup,clear;
    JTextField cardtextfield;
    JPasswordField pintextfield;
    Login()
    {
        setLayout(null); 
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel label = new JLabel(i3);
        label.setBounds(70 , 10 , 100 , 100);
        add(label);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        JLabel text = new JLabel("welcome to ATM");
        text.setFont(new Font("OSWARD" , Font.BOLD , 38));
        text.setBounds(200 , 40 , 400 , 40);
        add(text);
        
        JLabel cardno = new JLabel("Card No");
        cardno.setFont(new Font("RALEWAY" , Font.BOLD , 28));
        cardno.setBounds(120 , 150 , 400 , 30);
        add(cardno);
        
        cardtextfield = new JTextField();
        cardtextfield.setBounds(300 , 150 , 230 ,30);
        cardtextfield.setFont(new Font("Arial" ,Font.BOLD , 14));
        add(cardtextfield);
        
        JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("RALEWAY" , Font.BOLD , 28));
        pin.setBounds(120 , 220 , 250 , 30);
        add(pin);
        
        pintextfield = new JPasswordField();
        pintextfield.setBounds(300 , 220 , 230 ,30);
       add(pintextfield);
        
        setSize(800 , 480 );
        setVisible(true);
        setLocation(300 , 100);
        
        login = new JButton("LOGIN");
        login.setBounds(300 , 300 , 100 , 30);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430 , 300 , 100 , 30);
        clear.setBackground(Color.BLUE);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGNUP");
        signup.setBounds(300 , 350 , 230 , 30);
        signup.setBackground(Color.BLUE);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) { 
        if(e.getSource()== clear)
        {
            cardtextfield.setText("");
            pintextfield.setText("");
        }
        else if(e.getSource()==login)
        {
            Conn conn = new Conn();  
            String cardno = cardtextfield.getText();
            String pinno = pintextfield.getText();
            String query = "select * from login where cardno = '"+cardno+"' and pin ='"+pinno+"'"; 
            try 
            {
             ResultSet rs = conn.s.executeQuery(query);
             if(rs.next())
             {
                 setVisible(false);
                 new Transactions(pinno).setVisible(true);
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Please recheck your card no and password");
             }
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        }
        else if(e.getSource()== signup)
        {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String args[]) {
         new Login();
        
    }

}

