/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
/**
 *
 * @author kuda
 */
public class CalcFrame extends JFrame {
textPanel tp;
buttonPanel1 bp1;
buttonPanel2 bp2;

JMenuBar jmb;
JMenu jmi1,jmi2,jmi3;

CalcFrame() throws IOException
{ 
    super("Calculator");
    try
{
// This line sets the look and feel
UIManager.setLookAndFeel
("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
}
catch(Exception cnfe) // you have to catch the exceptions
{
System.out.println("Error changing look and feel");
}
// This line tells the application to update itself
SwingUtilities.updateComponentTreeUI(getContentPane());

BufferedImage bf = ImageIO.read(new File("first.png"));

this.setContentPane(new backImage(bf));
 // set title to Calculator
Container cp = getContentPane(); // we saw this already
cp.setLayout(new FlowLayout()); // we have to use flow
cp.setBackground(new Color(241,237,222) );
tp = new textPanel(); // create our three components
bp1 = new buttonPanel1();
bp2 = new buttonPanel2();

cp.add(tp);
cp.add(bp1);// and add them
cp.add(bp2);// in order


this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setSize(340,320); // I worked out the size afterward
setVisible(true);
setResizable(false);
}
}