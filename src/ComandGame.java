import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComandGame extends JFrame implements WindowListener{
    
    private SelectPanel sp; 
    private QuationsPanel qp;
    private Missnote mn=new Missnote();

    public ComandGame(){
        super("ComandGame SP9");
        setSize(600,500);
        setLocation(100,100);
        addWindowListener(this);
        JPanel p=new JPanel();
        sp=new SelectPanel();
        p.setLayout(new BorderLayout());
        p.add(sp,BorderLayout.SOUTH);
        qp=new QuationsPanel();
        qp.getquations();
        qp.gettext();
        p.add(qp,BorderLayout.NORTH);
        add(p);
        System.out.println("init");
    }

    public void windowOpened(WindowEvent ev) {
    }

    public void windowClosing(WindowEvent ev) {
        //mn.output();
        dispose();
    }

    public void windowClosed(WindowEvent ev) {
    }

    public void windowActivated(WindowEvent ev) {
    }

    public void windowDeactivated(WindowEvent ev) {
    }

    public void windowIconified( WindowEvent ev) {
    }

    public void windowDeiconified(WindowEvent ev) {
    }

    public static void main(String[] args) {
        (new ComandGame()).setVisible(true);
    }
}
