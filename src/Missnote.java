import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;


public class Missnote {

    private ArrayList<MissWords> m_list;
    private String file_name="missnote.txt";
    String word;
    String mean;
    Integer i=0;
    Integer count=0;


    public Missnote(){
        //m_list.clear();
        m_list=new ArrayList<MissWords>();

    }

    public void makeMissnote(String str1,String str2){
        
        System.out.println(str1);
        System.out.println(str2);

        MissWords mw=new MissWords(str1,str2);
        System.out.println(mw.word);
        System.out.println(mw.answer);

        m_list.add(mw);

    }

    public void addCount(){
        
        count++;
        System.out.println(count);
    }

    public void getText(){
        System.out.println(i);

        word=m_list.get(i).word;
        mean=m_list.get(i).answer;

    }

    public void output(){
        i=0;
        try{
            PrintWriter pw=new PrintWriter((file_name),"utf-8");
            for(int j=0;j<count;j++){
                getText();
                pw.println(word+" "+mean);
                i++;
            }
            pw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
    
}
