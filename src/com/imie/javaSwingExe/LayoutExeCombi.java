package com.imie.javaSwingExe;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutExeCombi extends JFrame{

	public LayoutExeCombi(){
	this.setTitle("Layout combine");
	this.setSize(300, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	
//** premiere panel	
		JPanel b1 = new JPanel();
		b1.setLayout(new BoxLayout(b1,BoxLayout.LINE_AXIS));
		b1.add(new JButton("1"));
		
//** deuxieme panel	
		JPanel b2 = new JPanel();
		b2.setLayout(new BoxLayout(b2,BoxLayout.LINE_AXIS));
		b2.add(new JButton("2"));
				
//** troisieme panel	
		JPanel b3 = new JPanel();
		b3.setLayout(new BoxLayout(b3,BoxLayout.LINE_AXIS));
		b3.add(new JButton("3"));
	
//** 4e+5e range
		GridLayout gl = new GridLayout(2, 3);
		
			this.getContentPane().add(new JButton("4"));
			this.getContentPane().add(new JButton("5"));
			this.getContentPane().add(new JButton("6"));
			this.getContentPane().add(new JButton("7"));
			this.getContentPane().add(new JButton("8"));
			
			this.setLayout(gl);

FlowLayout fl = new FlowLayout();
fl.add(b1);



	this.setVisible(true);

}
}


