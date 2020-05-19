/* === WELCOME TO THE CODE ===
 *
 *    DATE : 15 mai 2020  - TIME : 22:20:34 - PACKAGE : prairie.td1 - FILE : Exercice1.java                                                                                           
 *
 *     ██████╗ ██████╗ ██████╗ ██╗████████╗    ████████╗██╗   ██╗██████╗ ███╗   ██╗███████╗██████╗ 
 *    ██╔═══██╗██╔══██╗██╔══██╗██║╚══██╔══╝    ╚══██╔══╝██║   ██║██╔══██╗████╗  ██║██╔════╝██╔══██╗
 *    ██║   ██║██████╔╝██████╔╝██║   ██║          ██║   ██║   ██║██████╔╝██╔██╗ ██║█████╗  ██████╔╝
 *    ██║   ██║██╔══██╗██╔══██╗██║   ██║          ██║   ██║   ██║██╔══██╗██║╚██╗██║██╔══╝  ██╔══██╗
 *    ╚██████╔╝██║  ██║██████╔╝██║   ██║          ██║   ╚██████╔╝██║  ██║██║ ╚████║███████╗██║  ██║
 *     ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚═╝   ╚═╝          ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝
 */

package prairie.td1;

import java.util.Scanner;

/**
 * ENONCE Ecrire un programme qui saisit deux entiers a et b, calcule et affiche
 * le quotient entier, le reste de la division et le ratio (quotient réel).
 */
public class Exercice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a, b;
		Scanner picker = new Scanner(System.in);

		// Retrieving user input
		do {
			try {
				System.out.println("Veuillez donner deux nombres entier posi: ");
				System.out.println("Nombre a : ");
				a = picker.nextInt();
				System.out.println("Nombre b : ");
				b = picker.nextInt();
			} catch (Exception e) {
				a = 0;
				b = 0;
				System.out.println("\n !!! VEUILLEZ SAISIR UN NOMBRE ENTIER VALIDE !!!\n");
				picker.next();
			}
		} while (b == 0);
		picker.close();

		// CALCULATIONS AND DISPLAYS OF RESULTS
		System.out.println("=====| DIVISIONS |=====");
		System.out.println("\n-> Le Quotient ENTIER est : " + a / b);
		System.out.println("\n-> Le RESTE de la division est : " + a % b);
		System.out.println("\n-> Le Quotient Réel de la division est : " + (float)a / (float)b);
	}

}
