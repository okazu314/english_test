import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;


public class Quetions {
  //  private int quetionsnumber;
    private String quetion;
    private String choices1;
    private String choices2;
    private String choices3;
    private String choices4;
    private String answer;

    public Quetions (String Q,String C1,String C2,String C3,String C4,String A) throws ParseException{
      //  quetionsnumber=n;
        quetion=Q;
        choices1=C1;
        choices2=C2;
        choices3=C3;
        choices4=C4;
        answer=A;


    }

    public Quetions (String csv) throws ParseException{
        fromcsv(csv);
    }

    public void fromcsv(String csv) throws ParseException{
        String[] tok=csv.split(",");
 //       quetionsnumber=tok[0];
        quetion=tok[0];
        choices1=tok[1];
        choices2=tok[2];
        choices3=tok[3];
        choices4=tok[4];
        answer=tok[5];
        

    }

    public String getQuetions(){
        return quetion;
    }

    public String getChoices1(){
        return choices1;
    }

    public String getChoices2(){
        return choices2;
    }

    public String getChoices3(){
        return choices3;
    }

    public String getChoices4(){
        return choices4;
    }

    public String getAnswer(){
        return answer;
    }

    
}
