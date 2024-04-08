package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{
    JLabel title, accdetail , cno , info ,cnotf , pin , pind , pintf , ser;
    JRadioButton sacc , cacc ,racc , fdacc;
    JCheckBox atm , intban , mban , eands , chec , estat , conf;
    JButton submit , cancel;
    String formno;
    String acctype , facility = "";
    SignupThree(String formno)
    {
        formno = this.formno;
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setTitle("NEW ACCOUNT DETIL FORM - 3");
        
        title = new JLabel("PAGE-3 ACCOUNT DETAIL");
        title.setBounds(300 , 10 , 400 ,30);
        title.setFont(new Font("raleway" , Font.BOLD, 22));
        add(title);
        
        accdetail = new JLabel("Account type");
        accdetail.setBounds(100 , 60 , 200 , 30);
        accdetail.setFont(new Font("raleway" , Font.BOLD, 22));
        add(accdetail);
        
        sacc = new JRadioButton("Saving account");
        sacc.setBackground(Color.LIGHT_GRAY);
        sacc.setBounds(100 , 110 , 200 , 30);
        add(sacc);
        
        cacc = new JRadioButton("Current account");
        cacc.setBackground(Color.LIGHT_GRAY);
        cacc.setBounds(400 , 110 , 200 , 30);
        add(cacc);
        
        racc = new JRadioButton("Reccuring account");
        racc.setBackground(Color.LIGHT_GRAY);
        racc.setBounds(100 , 160 , 200 , 30);
        add(racc);
        
        fdacc = new JRadioButton("Fixed Deposit account");
        fdacc.setBackground(Color.LIGHT_GRAY);
        fdacc.setBounds(400 , 160 , 300 , 30);
        add(fdacc);
        
        ButtonGroup Accdet = new ButtonGroup();
        Accdet.add(cacc);
        Accdet.add(sacc);
        Accdet.add(racc);
        Accdet.add(fdacc);
        
        cno = new JLabel("Card Number");
        cno.setBounds(100 , 250 , 300 , 30);
        cno.setFont(new Font("raleaway" , Font.BOLD , 22));
        add(cno);
        
        info = new JLabel("Your 15 Digit Card Number");
        info.setBounds(100 , 270 , 300 , 30);
        info.setFont(new Font("raleaway" , Font.ITALIC , 10));
        add(info);
        
        cnotf = new JLabel("XXXX-XXXX-XXXX-6324");
        cnotf.setBounds(400 , 265 , 300 , 30);
        cnotf.setFont(new Font("raleaway" , Font.BOLD , 22));
        add(cnotf);
        
        pin = new JLabel("PIN");
        pin.setBounds(100 , 310 , 300 , 30);
        pin.setFont(new Font("raleaway" , Font.BOLD , 22));
        add(pin);
        
        pind = new JLabel("Your 4 Digit Password");
        pind.setBounds(100 , 325 , 300 , 30);
        pind.setFont(new Font("raleaway" , Font.ITALIC , 10));
        add(pind);
        
        pintf = new JLabel("XXXX");
        pintf.setBounds(400 , 320 , 300 , 30);
        pintf.setFont(new Font("raleway" , Font.BOLD , 22));
        add(pintf);
        
        ser = new JLabel("Service Recuired");
        ser.setBounds(100 , 380 , 300 , 30);
        ser.setFont(new Font("raleway" , Font.BOLD , 22));
        add(ser);
        
        atm = new JCheckBox("ATM Card");
        atm.setBounds(100 , 430 , 300 , 30);
        atm.setFont(new Font("raleway" , Font.BOLD , 22));
        atm.setBackground(Color.LIGHT_GRAY);
        add(atm);
        
        intban = new JCheckBox("Internet Banking");
        intban.setBounds(400 , 430 , 300 , 30);
        intban.setFont(new Font("raleway" , Font.BOLD , 22));
        intban.setBackground(Color.LIGHT_GRAY);
        add(intban);
        
        mban = new JCheckBox("Mobile Banking");
        mban.setBounds(100 , 480 , 300 , 30);
        mban.setFont(new Font("raleway" , Font.BOLD , 22));
        mban.setBackground(Color.LIGHT_GRAY);
        add(mban);
        
        eands = new JCheckBox("E-mail and SMS alert");
        eands.setBounds(400 , 480 , 300 , 30);
        eands.setFont(new Font("raleway" , Font.BOLD , 22));
        eands.setBackground(Color.LIGHT_GRAY);
        add(eands);
        
        chec = new JCheckBox("Checkbook");
        chec.setBounds(100 , 530 , 300 , 30);
        chec.setFont(new Font("raleway" , Font.BOLD , 22));
        chec.setBackground(Color.LIGHT_GRAY);
        add(chec);
        
        estat = new JCheckBox("E-statement");
        estat.setBounds(400 ,530 , 300 , 30);
        estat.setFont(new Font("raleway" , Font.BOLD , 22));
        estat.setBackground(Color.LIGHT_GRAY);
        add(estat);
        
        conf = new JCheckBox("All the information given by me is correct");
        conf.setBounds(100 , 580 , 650 ,30 );
        conf.setFont(new Font("raleway" , Font.BOLD , 22));
        conf.setBackground(Color.WHITE);
        conf.setForeground(Color.BLACK);
        add(conf);
        
        submit = new JButton("Submit");
        submit.setBounds(100 , 630 , 200 , 30);
        submit.setFont(new Font("raleway" , Font.BOLD , 22));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(400 , 630 , 300 , 30);
        cancel.setFont(new Font("raleway" , Font.BOLD , 22));
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
        
        setSize(850 ,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== submit)
        {
            if(sacc.isSelected())
            {
                acctype = "Saving Account";
            }
            else if(cacc.isSelected())
            {
                acctype = "Current Account";
            }
            else if(racc.isSelected())
            {
                acctype = "Reccurin Account";
            }
            else if(fdacc.isSelected())
            {
                acctype = "Fixed Deposite Account";
            }
        }
        else if(e.getSource() == cancel)
                {
                setVisible(false);
                new Login().setVisible(true);
                }
        Random random = new Random();
        String  cardno = "" + Math.abs((random.nextLong()) % 90000000L + 5010025360000000L); 
        String pinno = "" + Math.abs((random.nextLong()) % 9000L + 1000L);
        if(atm.isSelected())
        {
            facility = facility+ " ATM Card";
        }
        else if(intban.isSelected())
        {
            facility = facility + " Internet Banking";
        }
        else if(mban.isSelected())
        {
            facility = facility + " Mobile Banking";
        }
        else if(eands.isSelected())
        {
            facility = facility + " E-mail and SMS";
        }
        else if(chec.isSelected())
        {
            facility = facility + " Checkbook";
        }
        else if(estat.isSelected())
        {
            facility = facility + " E-statement";
        }
        
        try
        {
            if(acctype.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Account type cannot be empty ");
            }
            else if(facility.equals(""))
            {
                JOptionPane.showMessageDialog(null, "you have to select at lest one facility");
            }
            else
            {
             Conn c = new Conn();
            String query = "insert into signupthree values('"+formno+"','"+acctype+"','"+cardno+"','"+pinno+"','"+facility+"')";
            String query1 =  "insert into login values ('"+formno+"','"+cardno+"','"+pinno+"')";
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query); 
            JOptionPane.showMessageDialog(null, "card no :" + cardno + "/n Pin no : " + pinno); 
            setVisible(false);
            new Deposit(pinno).setVisible(true);
            } 
            
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
    public static void main(String args[]) 
    {
        new SignupThree("");
        
    }
}
