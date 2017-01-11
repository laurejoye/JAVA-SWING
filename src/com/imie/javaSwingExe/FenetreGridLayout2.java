package com.imie.javaSwingExe;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetreGridLayout2 extends JFrame{

	public FenetreGridLayout2(){
	this.setTitle("GridLayout2");
	this.setSize(300, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);

//On définit le layout à utiliser sur le content pane
	GridLayout gl = new GridLayout();
	
	gl.setColumns(2);
	gl.setRows(3);
	gl.setHgap(5);
	gl.setVgap(5);
	
	this.getContentPane().add(new JButton("1"));
	this.getContentPane().add(new JButton("2"));
	this.getContentPane().add(new JButton("3"));
	this.getContentPane().add(new JButton("4"));
	this.getContentPane().add(new JButton("5"));

	this.setLayout(gl);

	this.setVisible(true);

}
}