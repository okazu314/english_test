import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;


public class Caluculaterate {

    Double rate;
    
    public Caluculaterate(){

    }

    public Double caluculateClear(Double count,Double clear){
        //System.out.println(count+"count");
        //System.out.println(clear+"clear");
        rate=clear/count;
        //System.out.println(rate+"1");
        rate=rate*100;
        //System.out.println(rate+"2");
        return rate;

    }
}
