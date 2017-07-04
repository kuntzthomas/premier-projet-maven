package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String titre = ResourceBundle.getBundle("application").getString("titre");
		String asciiArt = FigletFont.convertOneLine(titre);
		System.out.println(asciiArt);

		// Affichage de l'environnement
		String environnement = ResourceBundle.getBundle("application").getString("environnement");
		System.out.println("environnement : " + environnement);
		
	}
}
