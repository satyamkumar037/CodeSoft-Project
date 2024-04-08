package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener
{
    JButton deposit , withdrawl , fastcash , ministatement , pinchange , balance , exit;
    String pinno;
    FastCash(String pinno)
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
        
        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(215 , 300 , 700 , 30);
        text.setFont(new Font("raleway" , Font.BOLD , 16));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(170 , 415 , 150 , 30 );
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Rs 500");
        withdrawl .setBounds(355, 415 , 150 , 30 );
        withdrawl .setBackground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl );
        
        fastcash = new JButton("Rs 1000");
        fastcash .setBounds(170, 450 , 150 , 30 );
        fastcash .setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash );
        
        ministatement = new JButton("Rs 2000");
        ministatement .setBounds(355, 450 , 150 , 30 );
        ministatement .setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement );
        
        pinchange = new JButton("RS 5000");
        pinchange .setBounds(170, 485 , 150 , 30 );
        pinchange .setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange );
        
        balance = new JButton("Rs 10000");
        balance .setBounds(355, 485 , 150 , 30 );
        balance .setBackground(Color.WHITE);
        balance.addActionListener(this);
        image.add(balance );
        
        exit = new JButton("Back");
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
            setVisible(false);
            new Transactions(pinno).setVisible(true);
        }
        else
        {
            String amount = ((JButton)e.getSource()).getText().substring(3);
            Conn c = new Conn();
            try
            {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinno+"'");
                int balance = 0;
                while(rs.next())
                {
                    if(rs.getString("type").equals("deposit"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(e.getSource() != exit && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinno+"' , '"+date+"' , 'Withdrawl' , '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited sucessfully");
                
                setVisible(false);
                new Transactions(pinno).setVisible(true);
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        }
    }

    public static void main(String args[]) 
    {
        new FastCash("");
    }
}

