package randomnumbergame;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class RandomNumberGame extends JFrame implements ActionListener
{
    JButton exit;
    int random , choosennumber , count=0;
    JTextField numberchoosen;
    JButton check , clear;
    String guess , non;
    JLabel show , countl , standard ,nonumber;
    JPanel p2;
    RandomNumberGame()
    {
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.BLACK);
        p1.setBounds(0, 0, 600, 200);
        p1.setLayout(null);
        add(p1);
        
        p2 = new JPanel();
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(0, 205, 600, 480);
        p2.setLayout(null);
        add(p2);
        
        setTitle("Random Number Game");
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(500, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel BackGround = new JLabel(i6);
        BackGround.setBounds(80 , 10 , 400 , 200);
        p1.add(BackGround);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25 , 25 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5,20,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mouseClicked(MouseEvent ae)
                    {
                        System.exit(0);
                    }
                });
         Random rand = new Random();
        random = rand.nextInt(100);
        System.out.println(random);
       
        JLabel choose = new JLabel("Guess The Number ");
        choose.setOpaque(true);
        choose.setBackground(Color.BLACK);
        choose.setForeground(Color.WHITE);
        choose.setFont(new Font("RALEWAY" , Font.BOLD , 22));
        choose.setBounds(20 , 10 , 250 , 30);
        p2.add(choose);
        
        JLabel choose1 = new JLabel("between 1 to 100 ");
        choose1.setOpaque(true);
        choose1.setBackground(Color.BLACK);
        choose1.setForeground(Color.WHITE);
        choose1.setFont(new Font("RALEWAY" , Font.BOLD , 18));
        choose1.setBounds(20 , 38 , 250 , 30);
        p2.add(choose1);
        
        numberchoosen = new JTextField();
        numberchoosen.setFont(new Font("raleway" , Font.BOLD , 14));
        numberchoosen.setBounds(300 , 30 , 200 , 30);
        p2.add(numberchoosen);
        
        show = new JLabel("Number is");
        show.setFont(new Font("RALEWAY" , Font.BOLD , 28));
        show.setBounds(20 , 100 , 300 , 40);
        show.setOpaque(true);
        show.setBackground(Color.black);
        show.setForeground(Color.WHITE);
        p2.add(show);
        
        countl = new JLabel("no of guess :");
        countl.setFont(new Font("RALEWAY" , Font.BOLD , 28));
        countl.setBounds(350 , 100 , 300 , 40);
        countl.setOpaque(true);
        countl.setBackground(Color.black);
        countl.setForeground(Color.WHITE);
        p2.add(countl);
        
        standard = new JLabel("your guesing level is :");
        standard.setFont(new Font("RALEWAY" , Font.BOLD , 28));
        standard.setBounds(50 , 200 , 480 , 40);
        standard.setOpaque(true);
        standard.setBackground(Color.black);
        standard.setForeground(Color.WHITE);
        p2.add(standard);
        
        nonumber = new JLabel("");
        nonumber.setBounds(50, 280,480 , 40);
        nonumber.setFont(new Font("raleway" , Font.BOLD , 28));
        nonumber.setOpaque(true);
        nonumber.setBackground(Color.LIGHT_GRAY);
        nonumber.setForeground(Color.BLACK);
        p2.add(nonumber);
        
        check = new JButton("check");
        check.setBounds(250,350 , 120 , 40);
        check.setBackground(Color.CYAN);
        check.addActionListener(this);
        check.setFont(new Font("SAN_SERIf" , Font.PLAIN , 18));
        check.setForeground(Color.BLACK);
        p2.add(check);
        
        clear = new JButton("clear");
        clear.setBounds(510, 30, 80, 30);
        clear.setBackground(Color.WHITE);
        clear.addActionListener(this);
        clear.setFont(new Font("SAN_SERIf" , Font.PLAIN , 18));
        clear.setForeground(Color.BLACK);
        p2.add(clear);
        
        setSize(600,700);
        setLocation(400 , 50);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==check)
        {
            try 
            {
                non = "";
            while(true)
            {
                count++;
                choosennumber = Integer.parseInt(numberchoosen.getText());
                  if(choosennumber ==random)
                  {
                   guess = "correct guess";
                   show.setOpaque(true);
                   show.setBackground(Color.green);
                   show.setForeground(Color.WHITE);
                   show.setText(guess);
                   countl.setText("no of guess =" +count);
                   break;
                  }
                  else if(random > choosennumber)
                  {
                   guess="the number is higher";
                   show.setText(guess);
                   countl.setText("no of guess =" +count);
                   break;
                  }
                  else
                  {
                   guess ="the number is lower";
                   show.setText(guess);
                   countl.setText("no of guess =" +count);
                    break;
                  }
                }
            } 
         catch (NumberFormatException ex) 
         { 
             non = "                     Not a number";
             nonumber.setOpaque(true);
             nonumber.setBackground(Color.red);
             nonumber.setText(non);
         }
            if(choosennumber == random)
            {
            if(count<=3)
            {
                standard.setText("your guessing level is Awesome");
                standard.setOpaque(true);
                standard.setBackground(Color.GREEN);
                standard.setForeground(Color.WHITE);
            }
            else if(count>3 && count<=6)
            {
                standard.setText("your guessing level is Good");
                standard.setOpaque(true);
                standard.setBackground(Color.BLUE);
                standard.setForeground(Color.WHITE);
            }
            else if(count >6 && count<=9)
            {
                standard.setText("your guessing level is Average");
                standard.setOpaque(true);
                standard.setBackground(Color.BLACK);
                standard.setForeground(Color.WHITE);
            }
            else
            {
                standard.setText("your guessing level is Bad");
                standard.setOpaque(true);
                standard.setBackground(Color.YELLOW);
                standard.setForeground(Color.WHITE);
            }
            }  
        }
        if(e.getSource() == clear)
        {
            numberchoosen.setText("");
        }
    }
    public static void main(String[] args) 
    {
        new RandomNumberGame();
    }   
}
