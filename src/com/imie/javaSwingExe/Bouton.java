import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bouton extends JFrame{
	//** VARIABLE
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");

	//** CONSTRUCTEUR
	public Bouton(){
    this.setTitle("Animation");
    this.setSize(300, 150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    //Ajout du bouton à notre content pane

    pan.add(bouton);

    this.setContentPane(pan);

    this.setVisible(true);

  }       

}