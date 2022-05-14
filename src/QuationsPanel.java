import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class QuationsPanel extends JPanel implements ActionListener{
    JTextArea label1;
    Integer i=0;
    Integer c=0;
    Integer flag=0;
    Integer number=3;
    Double count=3.0;
    Double clear=3.0;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str10;
    String str11;
    private ArrayList<Quetions> q_list;
    Answertext at;
    CaluculatePoint cp=new CaluculatePoint();
    Caluculaterate cr=new Caluculaterate();
    Double result;
    Missnote mn=new Missnote();
    
    //private Timer timer;
     

    private String file_name="quetions.csv";

    public QuationsPanel(){
        label1 = new JTextArea(5,50);
        q_list=new ArrayList<Quetions>();
        fileget();
        add(label1);
        JButton b1=new JButton("next");
        b1.addActionListener(this);
        add(b1,BorderLayout.EAST);
        //timer =new Timer(1000,answer);
    }

    public void getquations(){
        str1=q_list.get(i).getQuetions();
        str2=q_list.get(i).getChoices1();
        str3=q_list.get(i).getChoices2();
        str4=q_list.get(i).getChoices3();
        str5=q_list.get(i).getChoices4();
        str6=q_list.get(i).getAnswer();
    }

    public void gettext(){
        
        //System.out.println(str1);
        label1.setText(str1);
        label1.append("\n");
        label1.append(str2);
        label1.append("\n");
        label1.append(str3);
        label1.append("\n");
        label1.append(str4);
        label1.append("\n");
        label1.append(str5);
        //validate();
        //repaint();
        //System.out.println(str6);

    }

    public void getT(Integer x){
        str1=q_list.get(x).getQuetions();
        str2=q_list.get(x).getChoices1();
        str3=q_list.get(x).getChoices2();
        str4=q_list.get(x).getChoices3();
        str5=q_list.get(x).getChoices4();
        str6=q_list.get(x).getAnswer();
    }

    public Answertext answer(String a){
        
        //timer.stop();
        //System.out.println(a);
        //System.out.println(str6);
        getT(c);
        //cp=new CaluculatePoint();

        if(str6.equals(a)){

            str7="Corect";
            str8=str6;
            switch(str6){
                case("a"):str9=str2;break;
                case("b"):str9=str3;break;
                case("c"):str9=str4;break;
                case("d"):str9=str5;break;
            }

            if(flag==0){

                cp.getCount();
                cp.getpoint();
                flag=1;
            }

        }else{

            str7="Discorect";
            str8=str6;
 
            switch(str6){
                case("a"):str9=str2;break;
                case("b"):str9=str3;break;
                case("c"):str9=str4;break;
                case("d"):str9=str5;break;
            }

            if(flag==0){

                cp.getCount();
                flag=1;

            }
            str10=str1;
            str11=str9;
            System.out.println(str10);
            System.out.println(str11);

            mn.makeMissnote(str10, str11);
            mn.addCount();
            mn.output();


        }
        //i++;
        //getquations();
        //gettext();
        //add(label1);
        //revalidate();
        //timer.start();
        count=cp.outputCount();
        clear=cp.outputClear();
        System.out.println(count);
        System.out.println(clear);
        flag=0;
        c++;
        //caluculate();
        at=new Answertext();
        at.Quation=str1;
        at.result=str7;
        at.answer=str8;
        at.meaning=str9;
        return(at);
    }

    public Double caluculate(){
        //count=cp.count;
        //clear=cp.clear;
        result=cr.caluculateClear(count,clear);
        return result;
    }

    public void changeflag(){
        flag=0;
    }

    public void actionPerformed(ActionEvent e){
        i++;
        //flag--;
        changeflag();
        //getquations();
        if(i>=number){
            str1="finish";
            str2="Your correct answer rate is";
            //count=cp.outputCount();
            //clear=cp.outputClear();
            //System.out.println(count);
            //System.out.println(clear);
            //result=cr.caluculateClear(count,clear);
            //System.out.println(result);
            //caluculate();
            str3=String.valueOf(caluculate());
            str4=null;
            str5=null;
        }
        else{
            getquations();
        }
        gettext();
        
    }
    
    

    public void fileget(){
        try{
            q_list.clear();
            final BufferedReader br = new BufferedReader (new InputStreamReader(new FileInputStream(file_name),"UTF-8"));
          //  int n=Integer.parseInt(br.readLine());
            for(int i=0;i<number;i++){
                String strf=br.readLine();
                Quetions qs=new Quetions(strf);
                q_list.add(qs);
            }
            br.close();
        }catch(IOException e){
            System.err.println(e);
        }catch(ParseException e){
            System.err.println(e);
        }
    }
}
