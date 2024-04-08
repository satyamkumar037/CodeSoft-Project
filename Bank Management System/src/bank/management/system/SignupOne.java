package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fName,emailtext,addresstf,citytf,statetf,pincodetf;
    JButton next;
    JRadioButton other,male,female,married,single;
    JDateChooser dateChooser;
    SignupOne()
    {
        Random ran = new Random();
        random = (Math.abs(ran.nextLong()% 9000L)+1000L);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        JLabel formno = new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("raleway" , Font.BOLD , 38));
        formno.setBounds(140 , 10 , 600 , 40);
        add(formno);
        
        JLabel personaldetail = new JLabel("PAGE 1 : PERSONAL DETAILS");
        personaldetail.setFont(new Font("raleway" , Font.BOLD , 22));
        personaldetail.setBounds(250 , 60 , 400 , 30); 
        add(personaldetail);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("raleway" , Font.BOLD , 22));
        name.setBounds(100 , 100 , 100 , 30); 
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("raleway" , Font.BOLD , 14));
        nameTextField.setBounds(400 , 100 , 300 , 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("raleway" , Font.BOLD , 22));
        fname.setBounds(100 , 150 , 250 , 30); 
        add(fname);
        
        fName = new JTextField();
        fName.setFont(new Font("raleway" , Font.BOLD , 14));
        fName.setBounds(400 , 150 , 300 , 30);
        add(fName);
        
        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("raleway" , Font.BOLD , 22));
        dob.setBounds(100 , 190 , 250 , 30); 
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(400 , 190 , 300 , 30);
        dateChooser.setFont(new Font("raleway" , Font.BOLD , 14));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("raleway" , Font.BOLD , 22));
        gender.setBounds(100 , 230 , 250 , 30); 
        add(gender);
        
        male = new JRadioButton("MALE");
        male.setBounds(400 , 230 , 60 , 30);
        male.setBackground(Color.LIGHT_GRAY);
        add(male);
        
        female = new JRadioButton("FEMALE");
        female.setBounds(480 , 230 , 80 , 30);
        female.setBackground(Color.LIGHT_GRAY);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email :");
        email.setFont(new Font("raleway" , Font.BOLD , 22));
        email.setBounds(100 , 270 , 250 , 30); 
        add(email);
        
        emailtext = new JTextField();
        emailtext.setFont(new Font("raleway" , Font.BOLD , 14));
        emailtext.setBounds(400 , 270 , 300 , 30);
        add(emailtext);
        
        JLabel martial = new JLabel("Marital Status:");
        martial.setFont(new Font("raleway" , Font.BOLD , 22));
        martial.setBounds(100 , 310 , 250 , 30); 
        add(martial);
        
        married = new JRadioButton("MARIED");
        married.setBounds(400 , 310 , 80 , 30);
        married.setBackground(Color.LIGHT_GRAY);
        add(married);
        
        single = new JRadioButton("SINGLE");
        single.setBounds(500 , 310 , 80 , 30);
        single.setBackground(Color.LIGHT_GRAY);
        add(single);
        
        other = new JRadioButton("OTHER");
        other.setBounds(600 , 310 , 80 ,30);
        other.setBackground(Color.LIGHT_GRAY);
        add(other);
        
        ButtonGroup marritalstatus = new ButtonGroup();
        marritalstatus.add(married);
        marritalstatus.add(single);
        marritalstatus.add(other);
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("raleway" , Font.BOLD , 22));
        address.setBounds(100 , 350 , 250 , 30); 
        add(address);
        
        addresstf = new JTextField();
        addresstf.setBounds(400 , 350 , 300 , 30);
        addresstf.setFont(new Font("raleway" , Font.BOLD , 14));
        add(addresstf);
        
        JLabel city = new JLabel("City");
        city.setFont(new Font("raleway" , Font.BOLD , 22));
        city.setBounds(100 , 390 , 250 , 30); 
        add(city);
        
        citytf = new JTextField();
        citytf.setBounds(400 , 390 ,300 , 30);
        citytf.setFont(new Font("raleway" , Font.BOLD , 14));
        add(citytf);
        
        JLabel state = new JLabel("State :");
        state.setFont(new Font("raleway" , Font.BOLD , 22));
        state.setBounds(100 , 430 , 250 , 30); 
        add(state);
        
        statetf = new JTextField();
        statetf.setBounds(400 , 430 , 300 , 30);
        statetf.setFont(new Font("raleway" , Font.BOLD , 14));
        add(statetf);
        
        JLabel pincode = new JLabel("Pin code:");
        pincode.setFont(new Font("raleway" , Font.BOLD , 22));
        pincode.setBounds(100 , 470 , 250 , 30); 
        add(pincode);
        
        pincodetf = new JTextField();
        pincodetf.setBounds(400 , 470 , 300 , 30);
        pincodetf.setFont(new Font("raleway" , Font.BOLD , 14));
        add(pincodetf);
        
        next = new JButton("NEXT");
        next.setBackground(Color.blue);
        next.setForeground(Color.WHITE);
        next.setBounds(620 , 550 , 80 , 30);
        next.addActionListener(this);
        add(next);
        
        
        setSize(850 , 800);
        setLocation(350 , 10);
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent e) { 
    String formno ="" + random;
    String name = nameTextField.getText();
    String fname = fName.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if(male.isSelected())
    {
        gender = "MALE";
    }
    else if(female.isSelected())
    {
        gender = "FEMALE";
    }
    String email = emailtext.getText();
    String marrital =null;
    if(married.isSelected())
    {
        marrital = "MARRIED";
    }
    else if(single.isSelected())
    {
        marrital = "SINGLE";
    }
    else if(other.isSelected())
    {
        marrital = "OTHER";
    }
    String address = addresstf.getText();
    String city = citytf.getText();
    String state = statetf.getText();
    String pin = pincodetf.getText();
    try
    {
        if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "name field cannot be empty");
        }
        else if(fname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "father's name cannot be empty");
        }
        else if(dob.equals(""))
        {
            JOptionPane.showMessageDialog(null, "DOB cannot be empty");
        }
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "email field cannot be empty");
        }
        else if(address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "address field cannot be empty");
        }
        else if(state.equals(""))
        {
            JOptionPane.showMessageDialog(null, "state field cannot be empty");
        }
        else if(pin.equals(""))
        {
            JOptionPane.showMessageDialog(null, "pincode field cannot be empty");
        }
        else if(city.equals(""))
        {
            JOptionPane.showMessageDialog(null, "city field cannot be empty");
        }
        else
        {
            Conn c = new Conn();
            String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marrital+"','"+address+"', '"+city+"','"+state+"','"+pin+"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
             
        }
        
    }
    catch(Exception ae)
    {
        System.out.println(ae);
    }
            
    }

    public static void main(String args[]) {
        new SignupOne();
    }

}
