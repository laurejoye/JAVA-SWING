package com.imie.javaSwingExe;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame; 

public class FenetreBorderLayout extends JFrame{
	
	public FenetreBorderLayout(){
	this.setTitle("BorderLayout");
	this.setSize(300, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	
//On définit le layout à utiliser sur le content pane
	this.setLayout(new BorderLayout());
	
//On ajoute le bouton au content pane de la JFrame
		  
 //Au centre
	this.getContentPane().add(new JButton("centre"), BorderLayout.CENTER);
	//Au nord
	this.getContentPane().add(new JButton("nord"), BorderLayout.NORTH);
	//Au sud
	this.getContentPane().add(new JButton("sud"), BorderLayout.SOUTH);
	//À l'ouest
	this.getContentPane().add(new JButton("oest"), BorderLayout.WEST);
	//À l'est
	this.getContentPane().add(new JButton("est"), BorderLayout.EAST);
	this.setVisible(true);
 }      
}
