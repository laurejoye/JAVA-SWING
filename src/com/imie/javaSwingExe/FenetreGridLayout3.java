package com.imie.javaSwingExe;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetreGridLayout3 extends JFrame{

		public FenetreGridLayout3(){
		this.setTitle("GridLayout3");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

//** ligne, colonne, hgap, vgap		
		GridLayout gl = new GridLayout(3, 2, 5, 5);

//On ajoute le bouton au content pane de la JFrame
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		
		this.setLayout(gl);
		this.setVisible(true);
	}
}
