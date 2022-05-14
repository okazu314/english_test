import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class CheskedAnswer {
    
    QuationsPanel qp=new QuationsPanel();

    public CheskedAnswer(QuationsPanel qp){
        this.qp=qp;

    } 

    public void check(String a){
        
        System.out.println("Cheack answers");
        qp.answer(a);

    }
}
