package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Deposit extends JFrame implements ActionListener
{
    JButton deposit , back;
    JTextField amount;
    String pinno;
    Deposit(String pinno)
    {
        this.pinno = pinno;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 , 900 , 900);
        add(image);
        
        JLabel text = new JLabel("enter the amount you want to deposit");
        text.setBounds(200 , 300 , 400 , 20);
        text.setForeground(Color.WHITE);
        text.setBackground(Color.BLACK);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("raleway" , Font.BOLD , 22));
        amount.setBounds(180 , 330 , 320 , 30);
        image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355 , 485 , 150 , 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(355 , 520 , 150 , 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900 , 900);
        setLocation(300 , 0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == deposit)
        {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null, "please enter amount to  deposit");
            }
            else
            {
                try
                {
                Conn c = new Conn();
                String query = "insert into bank values('"+pinno+"' , '"+date+"' , 'deposit' , '"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs"+ number + " deposited succesfully");
                setVisible(false);
                new Transactions(pinno).setVisible(true);
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        }
        else if(e.getSource() == back)
        {
            setVisible(false);
            new Transactions(pinno).setVisible(true);
        }
    }
    public static void main(String args[]) 
    {
        new Deposit("");
    }
}
