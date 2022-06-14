
/*  Ques 27:-
            Write a program to demonstrate different mouse handling events like mouseClicked(), 
            mouseEntered(), mouseExited(), mousePressed, mouseReleased() and mouseDragged()
    solution:-

*/
import java.awt.*;
import java.awt.event.*;

public class MouseHandling extends Frame implements MouseListener {
    Label l;

    MouseHandling() {
        addMouseListener(this);

        l = new Label();
        l.setBounds(20, 50, 200, 20);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse is Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse has Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse has Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse is Pressed and hold");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse is Released");
    }

    public static void main(String[] args) {
        new MouseHandling();
    }
}
