package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    JLabel accountdetail ,religion , catogary ,income , edu , qual , occup , pan ,adhar , senior , exhisting;
    JComboBox religiontf , catogaryb , incomec , eduqual , occuc;
    JTextField adhartf , pantf;
    JRadioButton yes , no , y , n;
    JButton next;
    String formno;
    long r;
    SignupTwo(String s)
    {
        setLayout(null);
        
         getContentPane().setBackground(Color.LIGHT_GRAY);
         
        setTitle("NEW ACCOUNT OPENING FORM PAGE - 2");
        
        accountdetail = new JLabel("PAGE-2 ADDITIONAL DETAIL");
        accountdetail.setFont(new Font("raleway" , Font.BOLD , 32));
        accountdetail.setBounds(180 , 10 , 600 , 40);
        add(accountdetail);
        
        religion = new JLabel("Religion");
        religion.setBounds(100 , 100 ,100 ,30);
        religion.setFont(new Font("raleway" , Font.BOLD , 22));
        add(religion);
        
        String val[] = {"select" ,"Hindu" , "Muslim" , "Sikh" , "Christian" , "other"};
        religiontf = new JComboBox(val);
        religiontf.setFont(new Font("raleway" , Font.BOLD , 14));
        religiontf.setBounds(400 , 100 , 300 , 30);
        add(religiontf);
        
        catogary = new JLabel("Catogary");
        catogary.setBounds(100 , 150 , 100 , 30);
        catogary.setFont(new Font("raleway" , Font.BOLD , 22));
        add(catogary);
        
        String catog[]={"select","general" , "SC" , "ST", "OBC"};
        catogaryb = new JComboBox(catog);
        catogaryb.setBounds(400 ,150 , 300 , 30);
        catogary.setFont(new Font("raleway" , Font.BOLD , 22));
        add(catogaryb);
        
        income = new JLabel("Income");
        income.setBounds(100 , 200 , 100 , 30);
        income.setFont(new Font("raleway" , Font.BOLD , 22));
        add(income);
        
        String inc[]={"select","null" , "<1,50,000" , "<2,50,000", "<5,00,000" , "upto 10,00,000"};
        incomec = new JComboBox(inc);
        incomec.setBounds(400 ,200 , 300 , 30);
        incomec.setFont(new Font("raleway" , Font.BOLD , 22));
        add(incomec);
        
        edu = new JLabel("Educational");
        edu.setBounds(100 , 250 , 200 ,30 );
        edu.setFont(new Font("raleway" , Font.BOLD , 22));
        add(edu);
        
        qual = new JLabel("Qualification");
        qual.setBounds(100 , 270 ,200 ,30);
        qual.setFont(new Font("raleway" , Font.BOLD , 22));
        add(qual);
        
        String edq[] = {"select" , "non graduate" , "Graduate" , "Post Graduate" , "other"};
        eduqual = new JComboBox(edq);
        eduqual.setBounds(400 , 270 , 300 ,30 );
        eduqual.setFont(new Font("raleway" , Font.BOLD , 14));
        add(eduqual);
        
        occup = new JLabel("Occupation");
        occup.setBounds(100 ,320 , 200 , 30 );
        occup.setFont(new Font("raleway" , Font.BOLD , 22));
        add(occup);
        
        String occ[] = {"select" , "Salaried" , "Self-emplyed" , "Businessman" , "Other"};
        occuc = new JComboBox(occ);
        occuc.setBounds(400 , 320 , 300 ,30);
        occuc.setFont(new Font("raleway" , Font.BOLD , 14));
        add(occuc);
        
        pan = new JLabel("PAN Number");
        pan.setBounds(100 , 370 , 300 , 30);
        pan.setFont(new Font("raleway" , Font.BOLD , 22));
        add(pan);
        
        pantf = new JTextField();
        pantf.setBounds(400 , 370 , 300 , 30);
        pantf.setFont(new Font("raleway" , Font.BOLD , 14));
        add(pantf);
        
        adhar =new JLabel("Aadhar number");
        adhar.setBounds(100 , 430 , 300 ,30);
        adhar.setFont(new Font("raleway" , Font.BOLD , 22));
        add(adhar);
        
        adhartf = new JTextField();
        adhartf.setBounds(400 , 430 , 300 ,30);
        adhartf.setFont(new Font("raleway" , Font.BOLD , 14));
        add(adhartf);
        
        senior = new JLabel("Senior Citizen");
        senior.setBounds(100 , 470 , 300 , 30);
        senior.setFont(new Font("raleway" , Font.BOLD , 22));
        add(senior);
        
        yes = new JRadioButton("yes");
        yes.setBackground(Color.LIGHT_GRAY);
        yes.setBounds(400 , 470 , 60 , 30);
        add(yes);
        
        no = new JRadioButton("No");
        no.setBackground(Color.LIGHT_GRAY);
        no.setBounds(480 , 470 , 60 , 30);
        add(no);
        
        ButtonGroup seniorcit = new ButtonGroup();
        seniorcit.add(yes);
        seniorcit.add(no);
        
        exhisting = new JLabel("Exhisting Costumer");
        exhisting.setBounds(100 , 520 , 300 , 30);
        exhisting.setFont(new Font("raleway" , Font.BOLD , 22));
        add(exhisting);
        
        y = new JRadioButton("Yes");
        y.setBackground(Color.LIGHT_GRAY);
        y.setBounds(400 , 520 , 60 , 30);
        add(y);
        
        n = new JRadioButton("No");
        n.setBackground(Color.LIGHT_GRAY);
        n.setBounds(480 , 520 , 60 , 30);
        add(n);
        
        ButtonGroup exhistingcos = new ButtonGroup();
        exhistingcos.add(y);
        exhistingcos.add(n);
        
        next = new JButton("Next");
        next.setBounds(600 , 580 , 80 , 30);
        next.setBackground(Color.BLUE);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
        setSize(850 , 800);
        setLocation(350 , 10);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String sreligion = (String)religiontf.getSelectedItem();
        String cattogary =(String) catogaryb.getSelectedItem();
        String incomes = (String)incomec.getSelectedItem();
        String eduq=(String) eduqual.getSelectedItem();
        String oc=(String)occuc.getSelectedItem();
        String scitizen = null;
        if(yes.isSelected())
        {
            scitizen= "Yes";
        }
        else if(no.isSelected())
        {
            scitizen= "No";
        }
        String ecust = null;
        if(y.isSelected())
        {
            ecust = "Yes";
        }
        else if(n.isSelected())
        {
            ecust = "No";
        }
        String panno = pantf.getText();
        String adhno = adhartf.getText();
        try
        {
        
        
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+cattogary+"','"+incomes+"','"+eduq+"','"+oc+"','"+scitizen+"','"+ecust+"', '"+panno+"','"+adhno+"')";
            c.s.executeUpdate(query);
             setVisible(false);
            new SignupThree(formno).setVisible(true);
            
        }
        catch(Exception ae)
       {
        System.out.println(ae);
       }
    }

    public void main(String args[]) {
           new SignupTwo("");
    }

}
