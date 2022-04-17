package trial;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import trial.connect4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fenetre implements ActionListener {
JFrame frame ;
Container con ;
JPanel title , button ;
JLabel label ;
Font titlef = new Font("Times New Roman", Font.PLAIN , 50);
JButton start ;
Font startFont = new Font("Times New Roman", Font.PLAIN , 30);
public fenetre() {
frame = new JFrame();
frame.setSize(800, 700);
frame.setTitle("CONNECT_FOUR");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setBackground(Color.LIGHT_GRAY);
frame.setLayout(null);
frame.setVisible(true);
con = frame.getContentPane();
title = new JPanel();
title.setBounds(100, 100, 600, 100);
title.setBackground(Color.LIGHT_GRAY);
label = new JLabel("CONNECT FOUR GAME");
label.setForeground(Color.blue);
title.add(label);
label.setFont(titlef);
con.add(title);
button = new JPanel();
button.setBounds(300, 300, 200, 80);
button.setBackground(Color.LIGHT_GRAY);
con.add(button );
start = new JButton("START");
start.setBackground(Color.black);
start.setForeground(Color.WHITE);
button.add(start);
start.setFont(startFont);
start.addActionListener(this);
start.addMouseListener(new mouseinput());

if (mouseinput.test==true) {
	frame.dispose();
}}
public void createScreen() {
label.setVisible(false);
start.setVisible(false);
JPanel text = new JPanel();
text.setVisible(true);
text.setBounds(100, 100, 600, 100);
text.setBackground(Color.black);
JLabel titre = new JLabel("WELCOME");
titre.setForeground(Color.blue);
titre.setFont(titlef);
text.add(titre);
//titre.setVisible(true);
//text.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
createScreen() ;
}
}