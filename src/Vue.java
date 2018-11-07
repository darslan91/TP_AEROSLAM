import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Vue extends JFrame{
	
	/* ATTRIBUTS */
	//Panels
	private JPanel panelGlobal;
	private JPanel panelConnexion;
	
	//Buttons
	private JButton btnConnexion;
	private JButton btnAnnuler;
	
	//Labels
	private JLabel lblMessage;
	private JLabel lblLogin;
	private JLabel lblMdp;
	
	//Champs
	private JTextField jtfLogin;
	private JPasswordField jpfMdp;
	
	
	/* CONSTRUCTEUR FENETRE */
	public Vue(){
		
		/*INFOS FENETRE */
		this.setTitle("AEROSLAM");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		
		/*CONTENUES FENETRE */
		//Police
		Font font = new Font("Calibri", Font.BOLD,20);
		
		//Panels
		this.panelGlobal = new JPanel();
		this.panelConnexion = new JPanel();
		
		//GridBagLayout
		this.panelConnexion.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//Labels
		this.lblMessage = new JLabel ("Connexion Administrateur AEROSLAM");
		this.lblMessage.setFont(font);
		this.lblLogin = new JLabel("Login : ");
		this.lblMdp = new JLabel("Password : ");
		
		//Champs
		this.jtfLogin = new JTextField();
		this.jtfLogin.setPreferredSize(new Dimension(150, 25));
		this.jpfMdp = new JPasswordField();
		this.jpfMdp.setPreferredSize(new Dimension(150, 25));
		
		//this.jpfMdp.setEchoChar('*');
		
		//Buttons
		this.btnConnexion = new JButton("Valider");
		this.btnAnnuler = new JButton("Annuler");
		
		
		/* AJOUT AU PANEL CONNEXION */
		c.gridx = 0;
		c.gridy = 0;
		this.panelConnexion.add(lblMessage, c);
		
		c.gridx = 0;
		c.gridy = 1;
		this.panelConnexion.add(lblLogin, c);
		
		c.gridx = 0;
		c.gridy = 2;
		this.panelConnexion.add(jtfLogin, c);
		this.panelConnexion.add(lblMdp);
		this.panelConnexion.add(jpfMdp);
		this.panelConnexion.add(btnConnexion);
		this.panelConnexion.add(btnAnnuler);
		
		/* AJOUT AU PANEL GLOBAL */
		this.panelGlobal.add(panelConnexion);
		
		/*GET CONTENT PANE */
		this.getContentPane().add(panelGlobal);
		
		this.setVisible(true);
		
		/* 1 ER COMMIT CHANGEMENT */
		
		
	}
}
