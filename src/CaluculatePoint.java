import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;


public class CaluculatePoint {
    public Double count=0.0;
    public Double clear=0.0;
    Double rate;

    public CaluculatePoint(){

    }

    public void getCount(){
        count=count+1.0;
        //System.out.println(count);
    }

    public void getpoint(){
        clear=clear+1.0;
        //System.out.println(clear);
    }

    public Double outputCount(){
        
        return count;

    } 

    public  Double outputClear(){

        return clear;

    }
/*
    public Double caluculateClear(){
        System.out.println(count+"count");
        System.out.println(clear+"clear");
        rate=clear/count;
        //System.out.println(rate+"1");
        rate=rate*100;
        //System.out.println(rate+"2");
        return rate;

    }
*/    
}
