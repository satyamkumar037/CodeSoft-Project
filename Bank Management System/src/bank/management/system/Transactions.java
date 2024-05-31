package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener
{
    JButton deposit , withdrawl , fastcash , ministatement , pinchange , balance , exit , userinfo;
    String pinno;
    Transactions(String pinno)
    {
        this.pinno = pinno;
        setLayout(null); 
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 , 900 , 900);
        add(image);
        
        JLabel text = new JLabel("please select your transaction");
        text.setBounds(215 , 300 , 700 , 30);
        text.setFont(new Font("raleway" , Font.BOLD , 16));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        deposit = new JButton("Deposite");
        deposit.setBounds(170 , 415 , 150 , 30 );
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl .setBounds(355, 415 , 150 , 30 );
        withdrawl .setBackground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl );
        
        fastcash = new JButton("Fast Cash");
        fastcash .setBounds(170, 450 , 150 , 30 );
        fastcash .setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash );
        
        ministatement = new JButton("Mini Statement");
        ministatement .setBounds(355, 450 , 150 , 30 );
        ministatement .setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement );
        
        pinchange = new JButton("Pin Change");
        pinchange .setBounds(170, 485 , 150 , 30 );
        pinchange .setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange );
        
        balance = new JButton("Balance Enquiry");
        balance .setBounds(355, 485 , 150 , 30 );
        balance .setBackground(Color.WHITE);
        balance.addActionListener(this);
        image.add(balance );
        
        userinfo = new JButton("User Information");
        userinfo .setBounds(170 , 520 , 150 , 30 );
        userinfo .setBackground(Color.WHITE);
        userinfo.addActionListener(this);
        image.add(userinfo );
        
        exit = new JButton("Exit");
        exit .setBounds(355, 520 , 150 , 30 );
        exit .setBackground(Color.WHITE);
        exit.addActionListener(this);
        image.add(exit );
        
        setSize(900 , 900);
        setLocation(300 , 0);
        setUndecorated(true); 
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== exit)
        {
            System.exit(0);
        }
        else if(e.getSource() == deposit)
        {
            setVisible(false);
            new Deposit(pinno).setVisible(true);
        }
        else if(e.getSource() == withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinno).setVisible(true);
        }
        else if(e.getSource() == fastcash)
        {
            setVisible(false);
            new FastCash(pinno).setVisible(true);
        }
        else if(e.getSource() == pinchange)
        {
            setVisible(false);
            new PinChange(pinno).setVisible(true);
        }
        else if(e.getSource()== balance)
        {
            setVisible(false);
            new BalanceEnquiry(pinno).setVisible(true);
        }
        else if(e.getSource() == ministatement)
        {
           // setVisible(false);
            new MiniStatement(pinno).setVisible(true);
        }
         else if(e.getSource() == userinfo)
        {
           // setVisible(false);
            new UserInfo().setVisible(true);
        }
    }

    public static void main(String args[]) 
    {
        new Transactions("");
    }
}
