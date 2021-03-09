/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author kuda
 */
public class buttonPanel1 extends JPanel {
    JButton CE;
    JButton C;
    JButton D;
    buttonPanel1(){
 
// This is RGB calue of the “windows button color”
Color buttons_color = new Color(241,237,222);
/* The string passed in to constructor is the label that
appears on the Jbutton */
CE = new JButton("CE");
C = new JButton("C");
D = new JButton("Backspace");

// This bit sets the button text to be red.
CE.setForeground(Color.red);
C.setForeground(Color.green);
D.setForeground(Color.blue);
// This sets the background color to be the color above
CE.setBackground(buttons_color);
C.setBackground(buttons_color);
D.setBackground(buttons_color);
/* This sets the borders, we'll be talking about this in
a second */
CE.setMargin(new Insets(6,29,6,29));
C.setMargin(new Insets(6,29,6,29));
D.setMargin(new Insets(6,29,6,29));
// Then add it to buttonPanel1
add(CE); 
add(C);
add(D);
}
}
