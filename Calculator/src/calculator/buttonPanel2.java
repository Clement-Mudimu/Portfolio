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
public class buttonPanel2 extends JPanel {
    JButton a;
    JButton b;
    JButton c;
    JButton d;
    JButton e;
    JButton f;
    JButton g;
    JButton h;
    JButton i;
    JButton j;
    JButton k;
    JButton l;
    JButton m;
    JButton n;
    JButton o;
    JButton p;
    JButton q;
    JButton r;
    buttonPanel2(){
        Color buttons_color = new Color(241,237,222);
/* The string passed in to constructor is the label that
appears on the Jbutton */
a = new JButton("9");
b = new JButton("8");
c = new JButton("7");
d = new JButton("6");
e = new JButton("5");
f = new JButton("4");
g = new JButton("3");
h = new JButton("2");
i = new JButton("1");
j = new JButton("0");
k = new JButton("+");
l = new JButton("-");
m = new JButton("/");
n = new JButton("*");
o = new JButton("=");
p = new JButton("sqrt");
q = new JButton("1/x");
r = new JButton("%");

a.setForeground(Color.black);
b.setForeground(Color.black);
c.setForeground(Color.black);
d.setForeground(Color.black);
e.setForeground(Color.black);
f.setForeground(Color.black);
g.setForeground(Color.black);
h.setForeground(Color.black);
i.setForeground(Color.black);
j.setForeground(Color.black);
k.setForeground(Color.black);
l.setForeground(Color.black);
m.setForeground(Color.black);
n.setForeground(Color.black);
o.setForeground(Color.black);
p.setForeground(Color.black);
q.setForeground(Color.black);
r.setForeground(Color.black);

a.setBackground(buttons_color);
b.setBackground(buttons_color);
c.setBackground(buttons_color);
d.setBackground(buttons_color);
e.setBackground(buttons_color);
f.setBackground(buttons_color);
g.setBackground(buttons_color);
h.setBackground(buttons_color);
i.setBackground(buttons_color);
j.setBackground(buttons_color);
k.setBackground(buttons_color);
l.setBackground(buttons_color);
m.setBackground(buttons_color);
n.setBackground(buttons_color);
o.setBackground(buttons_color);
p.setBackground(buttons_color);
q.setBackground(buttons_color);
r.setBackground(buttons_color);

a.setMargin(new Insets(5,1,5,1));
b.setMargin(new Insets(5,1,5,1));
c.setMargin(new Insets(5,1,5,1));
d.setMargin(new Insets(5,1,5,1));
e.setMargin(new Insets(5,1,5,1));
f.setMargin(new Insets(5,1,5,1));
g.setMargin(new Insets(5,1,5,1));
h.setMargin(new Insets(5,1,5,1));
i.setMargin(new Insets(5,1,5,1));
j.setMargin(new Insets(5,1,5,1));
k.setMargin(new Insets(5,1,5,1));
l.setMargin(new Insets(5,1,5,1));
m.setMargin(new Insets(5,1,5,1));
n.setMargin(new Insets(5,1,5,1));
o.setMargin(new Insets(5,1,5,1));
p.setMargin(new Insets(5,1,5,1));
q.setMargin(new Insets(5,1,5,1));
r.setMargin(new Insets(5,1,5,1));
// Then add it to buttonPanel1
add(a);
add(b);
add(c);
add(d);
add(e);
add(f);
add(g);
add(h);
add(i);
add(j);
add(k);
add(l);
add(m);
add(n);
add(o);
add(p);
add(q);
add(r);

setLayout(new GridLayout(4,6,5,5));
    }
}
