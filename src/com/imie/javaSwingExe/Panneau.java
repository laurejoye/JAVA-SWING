package com.imie.javaSwingExe;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


// class pour tester l'encapsulation : elle est instancier via fenetre : this.setContentPane(new Panneau)
public class Panneau extends JPanel{
	
	//** variable
	private int i = 0;
	

	
	//** methode
	public void paintComponent(Graphics g){
		System.out.println("Execution numéro :"+(i++));
	}
	

}
