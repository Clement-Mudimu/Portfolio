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
public class textPanel extends JPanel {
JTextField output;
textPanel()
{
// set size, initial text, font and text alignment
output = new JTextField("0.",28);
output.setFont(new Font("Courier", Font.PLAIN, 16));
output.setHorizontalAlignment(4);
//add to panel
this.add(output);
// change background color to be that gray color
Color background_color = new Color(241,237,222);
this.setBackground(background_color);
}

}
