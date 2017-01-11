package com.imie.javaSwingExe;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MonButton extends JButton implements MouseListener {
	private String name;
	public MonButton(String label){
		super(label);
		this.name = label;
		addMouseListener(this);
		
	}
	public void paintComponent(Graphics g){
	       
	    g.setColor(Color.BLUE);
	    g.fillRect()
	
	}     

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
