package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UserInfo  extends JFrame implements ActionListener
{
    JLabel name , nameshow, address , addressshow, DOB , DOBshow , gender , ifsc ,ifscshow , email , gendershow;
    JButton check;
    JTextField emailshow;
    UserInfo()
    {
        setLayout(null);
        setTitle("USER INFORMATION");
        
        email = new JLabel("Enter Email");
        email.setBounds(70 , 10 , 100 , 30);
        email.setBackground(Color.WHITE);
        add(email);
        
        emailshow = new JTextField();
        emailshow.setBounds(200 , 10 , 200 , 30);
        emailshow.setBackground(Color.WHITE);
        add(emailshow);
        
        check = new JButton("Check");
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(410 , 10 , 100 , 30);
        check.addActionListener(this);
        add(check);
        
        name = new JLabel("Name");
        name.setBounds(70 , 50 , 100 , 30);//200 , 210 , 100 , 30
        name.setBackground(Color.WHITE);
        add(name);
        
        
        nameshow = new JLabel();
        nameshow.setBounds(200 , 50 , 100 , 30);
        nameshow.setBackground(Color.WHITE);
        add(nameshow);
        
        DOB = new JLabel("DOB");
        DOB.setBounds(70 , 90 , 100 , 30);
        DOB.setBackground(Color.WHITE);
        add(DOB);
           
        DOBshow = new JLabel();
        DOBshow.setBounds(200 , 90 , 100 , 30);
        DOBshow.setBackground(Color.WHITE);
        add(DOBshow);  
        
        gender = new JLabel("Gender:");
        gender.setBounds(70 , 130 , 100 , 30);
        gender.setBackground(Color.WHITE);
        add(gender);
          
        gendershow = new JLabel();
        gendershow.setBounds(200 , 130 , 100 , 30);
        gendershow.setBackground(Color.WHITE);
        add(gendershow);
         
        ifsc = new JLabel("ifsc code");
        ifsc.setBounds(70 , 170 , 100 , 30);
        ifsc.setBackground(Color.WHITE);
        add(ifsc);
           
        ifscshow = new JLabel("INDI0000012");
        ifscshow.setBounds(200 , 170 , 100 , 30);
        ifscshow.setBackground(Color.WHITE);
        add(ifscshow);
        
        address = new JLabel("Address");
        address.setBounds(70 , 210 , 100 , 30);
        address.setBackground(Color.WHITE);
        add(address);   
        
        addressshow = new JLabel();
        addressshow.setBounds(200 , 210 , 100 , 30);
        addressshow.setBackground(Color.WHITE);
        add(addressshow);   
        
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(600 , 400 );
        setVisible(true);
        setLocation(300 , 100);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == check)
        {
            String email = emailshow.getText();
            
            try
            {
                Conn c = new Conn();
                String query = "select * from signup where email = '"+email+"'";
                ResultSet rs = c.s.executeQuery(query);
                 while(rs.next())
                 {
                    nameshow.setText(rs.getString("name"));
                    DOBshow.setText(rs.getString("dob"));
                    gendershow.setText(rs.getString("gender"));
                    addressshow.setText(rs.getString("address"));
                 }
            }
            catch(Exception ae)
            {
                ae.printStackTrace();
            }
        }
    }
    public static void main(String args[])
    {
        new UserInfo();
    }
}
