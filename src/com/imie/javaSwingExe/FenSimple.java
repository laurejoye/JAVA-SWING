package com.imie.javaSwingExe;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FenSimple extends JFrame {
	private JPanel pan = new JPanel();
		
	public FenSimple(){
		this.setTitle("Ma premiere fenetre");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan.setBackground(Color.WHITE);
	
		this.setContentPane(new PanGraph());
	
		this.setVisible(true);
		
	}
	
}
