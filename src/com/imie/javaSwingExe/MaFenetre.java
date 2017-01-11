package com.imie.javaSwingExe;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaFenetre extends JFrame implements MouseListener{

	public MaFenetre(){
		super("une fenetre qui traite les evement souris");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//la fenetre appel a son propre ecouteur d'evenement - celui de la signature : SINON RIEN NE VA
		addMouseListener(this);
	}
	
		
	
	// l'argument e est l objet evenement generer dans la fenetre lors d'un clic souris.
	// nous allons utiliser les info associées.
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		// coordonnees du cursuer
		System.out.println("le clic dans la fenetre a lieu aux coordonnees x : "+x+" et y : "+y);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("La souris est entrer dans la fenetre aux coordonnes : "+x+" / "+y);
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
