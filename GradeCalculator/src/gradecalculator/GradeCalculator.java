package gradecalculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class GradeCalculator extends JFrame implements ActionListener
{
    JButton done , check ;
    double num1 , num2 , num3 , num4 , num5 , totalval;
    double percentageval;
    JTextField fm, fm2, fm3 , fm4 ,fm5;
    JLabel percentage , grade , Total , status;
    GradeCalculator()
    {
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.BLACK);
        p1.setBounds(0, 0,500, 200);
        p1.setLayout(null);
        add(p1);
        
        JPanel p2 = new JPanel();
        p2.setBounds(0 ,205 , 500 , 480);
        p2.setBackground(Color.BLACK);
        p2.setLayout(null);
        add(p2);
        
        JLabel title = new JLabel("             Grade Calculator");
        title.setOpaque(true);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setBounds(100 , 0 , 300  ,30);
        title.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p1.add(title);
        
        setTitle("Grade Calculator");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("gradeimage/gradebg.png"));
        Image i2 = i1.getImage().getScaledInstance(300 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(100,35,300,160);
        p1.add(back);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("gradeimage/arrow.jpg"));
        Image i5 = i4.getImage().getScaledInstance(25 , 25 , Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel exit = new JLabel(i6);
        exit.setBounds(5,20,25,25);
        p1.add(exit);
        exit.addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mouseClicked(MouseEvent ae)
                    {
                        System.exit(0);
                    }
                });
        
        /*ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("gradeimage/bg2.png"));
        Image i8 = i7.getImage().getScaledInstance(450 , 450 , Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel bg = new JLabel(i9);
        bg.setBounds(20,205,450,450);
        add(bg);*/
        
        JLabel f1 = new JLabel(" enter marks of first sub");
        f1.setOpaque(true);
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setBounds(5 , 5 , 300  ,30);
        f1.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(f1);
        
        fm = new JTextField();
        fm.setBounds(350 , 5 , 100 , 30 );
        fm.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(fm);
        
        JLabel f2 = new JLabel(" enter marks of second sub");
        f2.setOpaque(true);
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.WHITE);
        f2.setBounds(5 , 45 , 300  ,30);
        f2.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(f2);
        
        fm2 = new JTextField();
        fm2.setBounds(350 , 45 , 100 , 30 );
        fm2.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(fm2);
        
        JLabel f3 = new JLabel(" enter marks of third sub");
        f3.setOpaque(true);
        f3.setBackground(Color.BLACK);
        f3.setForeground(Color.WHITE);
        f3.setBounds(5 , 85 , 300  ,30);
        f3.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(f3);
        
        fm3 = new JTextField();
        fm3.setBounds(350 , 85 , 100 , 30 );
        fm3.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(fm3);
        
        JLabel f4 = new JLabel(" enter marks of fourth sub");
        f4.setOpaque(true);
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.WHITE);
        f4.setBounds(5 , 125 , 300  ,30);
        f4.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(f4);
        
        fm4 = new JTextField();
        fm4.setBounds(350 , 125 , 100 , 30 );
        fm4.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(fm4);
        
        JLabel f5 = new JLabel(" enter marks of fifth sub");
        f5.setOpaque(true);
        f5.setBackground(Color.BLACK);
        f5.setForeground(Color.WHITE);
        f5.setBounds(5 , 165 , 300  ,30);
        f5.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(f5);
        
        fm5 = new JTextField();
        fm5.setBounds(350 ,165 , 100 , 30 );
        fm5.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(fm5);
        
        
        Total  = new JLabel("Your Total is :");
        Total.setOpaque(true);
        Total.setBackground(Color.BLUE);
        Total.setForeground(Color.WHITE);
        Total.setBounds(5 , 205 , 250  ,30);
        Total.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(Total);
        
        JLabel Average  = new JLabel("Total is : 500");
        Average.setOpaque(true);
        Average.setBackground(Color.BLUE);
        Average.setForeground(Color.WHITE);
        Average.setBounds(300 , 205 , 250  ,30);
        Average.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(Average);
        
        status  = new JLabel("status");
        status.setOpaque(true);
        status.setBackground(Color.BLACK);
        status.setForeground(Color.WHITE);
        status.setBounds(210 , 245 , 100  ,50);
        status.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(status);
        
        percentage  = new JLabel("        percentage");
        percentage.setOpaque(true);
        percentage.setBackground(Color.BLACK);
        percentage.setForeground(Color.WHITE);
        percentage.setBounds(150 , 305 , 280  ,30);
        percentage.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(percentage);
        
        grade  = new JLabel("           Grade");
        grade.setOpaque(true);
        grade.setBackground(Color.BLACK);
        grade.setForeground(Color.WHITE);
        grade.setBounds(150 , 370 , 200  ,30);
        grade.setFont(new Font("RALEWAY" , Font.BOLD , 20));
        p2.add(grade);
        
        done = new JButton("Done");
        done.setBounds(380 , 420 , 100  , 50);
        done.addActionListener(this);
        p2.add(done);
        
        check = new JButton("check");
        check.setBounds(20 , 420 , 100  , 50);
        check.addActionListener(this);
        p2.add(check);
        
        
        setSize(500 , 700);
        setUndecorated(true);
        setLocation(500 , 30);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == done)
        {
            System.exit(0);
        }
        if(e.getSource() == check)
        {
            try
            {
                num1 = Integer.parseInt(fm.getText());
                if(num1>100)
                {
                    JOptionPane.showMessageDialog(null, "value Should not be greater than 100");
                }
                num2 = Integer.parseInt(fm2.getText());
                if(num2>100)
                {
                    JOptionPane.showMessageDialog(null, "value Should not be greater than 100");
                }
                num3 = Integer.parseInt(fm3.getText());
                if(num3>100)
                {
                    JOptionPane.showMessageDialog(null, "value Should not be greater than 100");
                }
                num4 = Integer.parseInt(fm4.getText());
                if(num4>100)
                {
                    JOptionPane.showMessageDialog(null, "value Should not be greater than 100");
                }
                num5 = Integer.parseInt(fm5.getText());
                if(num5>100)
                {
                    JOptionPane.showMessageDialog(null, "value Should not be greater than 100");
                }
                totalval = num1+num2+num3+num4+num5;
                Total.setText("your total marks :"+totalval);
                percentageval =(totalval/500)*100;
                percentage.setText("Overall Percentage = " + String.format("%.2f", percentageval));
               if(percentageval <=33)
               {
                   status.setText("   Fail");
                   status.setBackground(Color.red);
               }
               else
               {
                   status.setText("    Pass");
                   status.setBackground(Color.green);
               }
               if(percentageval >= 90)
               {
                   grade.setText("        Grade A+");
                   grade.setBackground(Color.green);
               }
               else if(percentageval <90 && percentageval >=80)
               {
                   grade.setText("        Grade A");
                   grade.setBackground(Color.green);
               }
               else if(percentageval <80 && percentageval >=60)
               {
                   grade.setText("        Grade B");
                   grade.setBackground(Color.YELLOW);
               }
               else if(percentageval <60 && percentageval >=40)
               {
                   grade.setText("        Grade C");
                   grade.setBackground(Color.ORANGE);
               }
               else
               {        
                   grade.setText("        Grade D");
                   grade.setBackground(Color.red);
               }
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        }
    }
    
    public static void main(String[] args) 
    {
        new GradeCalculator();
    }
    
}
