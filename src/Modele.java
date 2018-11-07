import java.sql.*;
import java.util.ArrayList;

public class Modele {

	/* ATTRIBUT PRIVEE STATIC */
	private static Connection connexion;
	private static Statement st;
	private static ResultSet rs;
	private static PreparedStatement statement;
	
	
	/* METHODES STATIQUES */
	
	//Connexion BDD
	public static void connexionBD(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Modele.connexion = DriverManager.getConnection("jdbc:mysql://localhost/bdd_mcv", "root", "");
		}
		catch(ClassNotFoundException erreur){
			System.out.println("Erreur avec le pilote. " + erreur);
		}
		catch(SQLException erreur){
			System.out.println("Connexion impossible avec la base de données " + erreur);
		}
	}
	
	
	//Deconnexion BDD
	public static void doconnexionBD(){
		try{
			Modele.connexion.close();
		}
		catch(SQLException erreur){
			System.out.println("Déconnection Echoué !!" + erreur);
		}
	}
	
	//Requete de connexion 1
	System.out.println("Salut !!");

}