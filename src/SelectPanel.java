import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;


public class SelectPanel extends JPanel implements ActionListener{
    
    
    QuationsPanel qp=new QuationsPanel();
    CheskedAnswer CA;
    Answertext at;
    String str1;
    String str2;
    String str3;
    String str4;
    JTextArea label1= new JTextArea(10,50);;

    public SelectPanel(){
        JPanel p=new JPanel();
        
        //p.setLayout(new BorderLayout());
        //label1 = new JTextArea(10,50);
        p.add(label1,BorderLayout.NORTH);
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(2,2));
        JButton b1=new JButton("a");
        JButton b2=new JButton("b");
        JButton b3=new JButton("c");
        JButton b4=new JButton("d");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        add(p, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e){
        final JButton btn = (JButton) e.getSource();
        final String func = btn.getText();
        at=new Answertext();

        if(func.equals("a")){

            //System.out.println("select a");
            //CA=new CheskedAnswer(qp);
            //CA.check("a");
            at=qp.answer("a");

        }

        if(func.equals("b")){

            //System.out.println("select b");
            //CA=new CheskedAnswer(qp);
            //CA.check("b");
            at=qp.answer("b");

        }

        if(func.equals("c")){

            System.out.println("select c");
            //CA=new CheskedAnswer(qp);
            //CA.check("c");
            at= qp.answer("c");

        }
        
        if(func.equals("d")){

            //System.out.println("select d");
            //CA=new CheskedAnswer(qp);
            //CA.check("d");
            at=qp.answer("d");

        }
        //qp.repaint();
        str1=at.result;
        str2=at.answer;
        str3=at.meaning;
        str4=at.Quation;
        label1.setText(str1);
        label1.append("\nThis quations's answer is "+str2+",and this meaning is "+str3);

    }
    
}
