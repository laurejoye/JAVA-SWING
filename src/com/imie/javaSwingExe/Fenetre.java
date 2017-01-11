package com.imie.javaSwingExe;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Fenetre extends JFrame {
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	private JCheckBox cocher1 = new JCheckBox("1");
	private JCheckBox cocher2 = new JCheckBox("2");
	private JRadioButton rouge = new JRadioButton("rouge");
	private JRadioButton bleu = new JRadioButton("bleu");
	private JRadioButton vert = new JRadioButton("vert");
	private ButtonGroup group = new ButtonGroup();
	private JLabel la = new JLabel("Mon etiquette");
	private JTextField txt = new JTextField(10);
	private JComboBox combo = new JComboBox();
	
	public Fenetre(){
		this.setTitle("Ma premiere fenetre");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//**this.setVisible(true);
		//**this.setBackground(Color.GREEN);**//
		//**this.getContentPane().setBackground(Color.BLUE);
		//*this.getContentPane().setVisible(false);**//
	
		//**JPanel pan = new JPanel();
		//*this.setContentPane(pan);
		pan.setBackground(Color.GRAY);
		
		
 //Ajout du bouton à notre content pane

		//**pan.add(bouton);
		
		// pour instancier le panneau : new Panneau ()
		//*this.setContentPane(new Panneau());
		
		
//Ajout des cases a cocher		
		
		pan.add(cocher1);
		pan.add(cocher2);
		
		
//Ajout radiobutton
		group.add(rouge);
		group.add(bleu);
		group.add(vert);
		pan.add(rouge);
		pan.add(bleu);
		pan.add(vert);
		
//Ajout etiquette
		la.setBackground(Color.WHITE);
		la.setOpaque(true);
		pan.add(la);
		
//Ajout champ pour texte :
		pan.add(txt);
		
//Ajout combobox, drop-down menu :
		pan.add(combo);
		combo.setPreferredSize(new Dimension(100, 20));
		combo.addItem("rouge");
		combo.addItem("bleu");
		
		
		
		// desactive donc tous les boutons ne sernt pas instancier
		this.setContentPane(pan);
		this.setVisible(true);
		
	}
	
}
