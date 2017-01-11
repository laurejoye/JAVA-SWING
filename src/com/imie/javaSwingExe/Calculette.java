package com.imie.javaSwingExe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 

public class Calculette extends JFrame{
	//** variables
	private JPanel all = new JPanel();
	private JPanel chiffres = new JPanel();
	private JPanel op = new JPanel();
	private JPanel ecran = new JPanel();
	
	
	//** constructeur
	
		public Calculette(){
		this.setTitle("Calculette");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);


	    
	 //** dans les panel j'utilise une organisation grid : utilise tout l'espace   
	    GridLayout grl1 = new GridLayout(4, 3, 5, 5);
		chiffres.setLayout(grl1);
				
		chiffres.add(new JButton("1"));
		chiffres.add(new JButton("2"));
		chiffres.add(new JButton("3"));
		chiffres.add(new JButton("4"));
		chiffres.add(new JButton("5"));
		chiffres.add(new JButton("6"));
		chiffres.add(new JButton("7"));
		chiffres.add(new JButton("8"));
		chiffres.add(new JButton("9"));
		chiffres.add(new JButton("0"));
		chiffres.add(new JButton(""));
		chiffres.add(new JButton("="));


		GridLayout grl2 = new GridLayout(5, 1, 5, 5);
		op.setLayout(grl2);
		
		op.add(new JButton("C"));
	  	op.add(new JButton("+"));
	  	op.add(new JButton("-"));
	  	op.add(new JButton("*"));
	  	op.add(new JButton("/"));
	  	
//** pour l'ecran j'utilise un Label
	  	JLabel ecran = new JLabel();
	  	ecran.setPreferredSize(new Dimension (300, 50));
	  	ecran.setBackground(Color.GRAY);
	  	ecran.setOpaque(true);
	  	ecran.setText("Ecran");
	  	ecran.setHorizontalAlignment(JLabel.RIGHT);
	  	

//*pour tout reunire on utilise un BorderLayout
	    all.setLayout(new BorderLayout());
	    
	    this.getContentPane().add(chiffres, BorderLayout.CENTER);
		this.getContentPane().add(ecran, BorderLayout.NORTH);
		this.getContentPane().add(op, BorderLayout.EAST);
		
	  
	    this.setVisible(true);
	    }
	  

}
