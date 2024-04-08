package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class MiniStatement extends JFrame
{
    String pinno;
    MiniStatement(String pinno)
    {
        this.pinno = pinno;
        setTitle("Mini Statement");
        setLayout(null);
        JLabel text = new JLabel();
        add(text);
        
        JLabel mini = new JLabel();
        add(mini);
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150 , 20 , 100 , 20);
        bank.setFont(new Font("raleway" , Font.BOLD , 14));
        bank.setBackground(Color.WHITE);
        bank.setForeground(Color.BLACK);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20 , 80 , 300 , 20);
        add(card);
        
        JLabel balance = new JLabel();
        balance.setBounds(20 , 400 , 300 , 20);
        add(balance);
        
        
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinno+"'");
            while(rs.next())
            {
                card.setText("Card Number " + rs.getString("cardno").substring(0 , 4) + "-XXXX-XXXX-" + rs.getString("cardno").substring(12));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try 
        {
            Conn c = new Conn();
            int bal = 0;
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinno+"'");
            while(rs.next())
            {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") +  "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("deposit"))
                    {
                        bal += Integer.parseInt(rs.getString("amount"));
                    }
                    else
                    {
                        bal -= Integer.parseInt(rs.getString("amount"));
                    }
            }
            balance.setText("Your current balance is Rs :" + bal);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
        mini.setBounds(20 , 140 , 400 , 200);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(400 , 600);
        setLocation( 20 , 20);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new MiniStatement("");
    }
}
