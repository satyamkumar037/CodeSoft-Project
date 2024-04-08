package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PinChange extends JFrame implements ActionListener
{
    JButton confirm , back;
   JPasswordField pintf , newpintf;
    JLabel pin , newpin ,text ;
    String pinno;
    PinChange(String pinno)
    {
        this.pinno = pinno; 
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 , 900 , 900);
        add(image);
        
        text = new JLabel("Change Your Pin");
        text.setBounds(250 , 280 , 500 , 30);
        text.setFont(new Font("raleway" , Font.BOLD , 22));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        pin = new JLabel("Enter New pin");
        pin.setBounds(165 , 320 , 180 , 25);
        pin.setFont(new Font("raleway" , Font.BOLD , 22));
        pin.setForeground(Color.WHITE);
        image.add(pin);
        
        pintf = new JPasswordField();
        pintf.setBounds(350 , 320 , 150 , 30);
        pintf.setFont(new Font("raleway" , Font.BOLD , 22));
        image.add(pintf);
        
        newpin = new JLabel("Reenter New pin");
        newpin.setBounds(165 , 355 , 180 , 25);
        newpin.setFont(new Font("raleway" , Font.BOLD , 22));
        newpin.setForeground(Color.WHITE);
        image.add(newpin);
        
        newpintf = new JPasswordField();
        newpintf.setBounds(350 , 355 , 150 , 30);
        newpintf.setFont(new Font("raleway" , Font.BOLD , 22));
        image.add(newpintf);
        
        confirm = new JButton("Confirm");
        confirm.setBounds(160 , 455 , 150 , 30);
        confirm.setFont(new Font("raleway" , Font.BOLD , 22));
        confirm.setBackground(Color.BLUE);
        confirm.setForeground(Color.WHITE);
        confirm.addActionListener(this);
        image.add(confirm);
        
        back = new JButton("Back");
        back.setBounds(350 , 455 , 150 , 30);
        back.setFont(new Font("raleway" , Font.BOLD , 22));
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900 , 900);
        setLocation(300 , 0);
        setUndecorated(true);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == confirm)
        {
         try
         {
             String npin = pintf.getText();
             String rpin = newpintf.getText();
             if(!npin.equals(rpin))
             {
                 JOptionPane.showMessageDialog(null,"pin and re-entered pin are not same");
                 return;
             }
             if(npin.equals(""))
             {
                 JOptionPane.showMessageDialog(null, "pin cannot be empty");
                 return;
             }
             if(rpin.equals(""))
             {
                 JOptionPane.showMessageDialog(null, "re-entered pin box cannot be empty");
                 return;
             }
             Conn c = new Conn();
             String query1 = "update bank set pin = '"+npin+"' where pin = '"+pinno+"'";
             String query2 = "update login set pin = '"+npin+"' where pin = '"+pinno+"'";
             String query3 = "update signupthree set pinno = '"+npin+"' where pinno = '"+pinno+"'";
             c.s.executeUpdate(query1);
             c.s.executeUpdate(query2);
             c.s.executeUpdate(query3);
             JOptionPane.showMessageDialog(null, "Pin change Successfully");
             setVisible(false);
             new Transactions(pinno).setVisible(true);
         }
          catch(Exception ae)
          {
              System.out.println(ae);
          }
        }
        else
        {
            setVisible(false);
            new Transactions(pinno).setVisible(true);
        }
    }
    public static void main(String args[]) 
    {
        new PinChange("").setVisible(true);
    }
}
