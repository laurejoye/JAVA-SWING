package com.imie.javaSwingExe;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreBoxLayout extends JFrame{

	public FenetreBoxLayout(){
	this.setTitle("BoxLayout");
	this.setSize(300, 120);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	
//** construction d'un layout a trois panel du type BoxLayout contenant un panel contenant un bouton  	
	
//** premiere panel	
	JPanel b1 = new JPanel();
	b1.setLayout(new BoxLayout(b1,BoxLayout.LINE_AXIS));
	b1.add(new JButton("Bouton 1"));
	
//** deuxieme panel	
	JPanel b2 = new JPanel();
	b2.setLayout(new BoxLayout(b2,BoxLayout.LINE_AXIS));
	b2.add(new JButton("Bouton 2"));
	b2.add(new JButton("Bouton 3"));

	
//** troisieme panel	
	JPanel b3 = new JPanel();
	b3.setLayout(new BoxLayout(b3,BoxLayout.LINE_AXIS));
	b3.add(new JButton("Bouton 4"));
	b3.add(new JButton("Bouton 5"));
	b3.add(new JButton("Bouton 6"));

	

    //On positionne maintenant ces trois lignes en colonne

	JPanel b4 = new JPanel();
	b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
    b4.add(b1);
    b4.add(b2);
    b4.add(b3);

   this.getContentPane().add(b4);
   this.setVisible(true);
	
	
	}
}
