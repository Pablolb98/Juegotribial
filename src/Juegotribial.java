import java.util.Scanner;

import javax.swing.JOptionPane;

public class Juegotribial {

	public static void main(String[] args) {
		
		System.out.println("  ____  _                           _     _                               _   _____      _                       _______   _       _       _ \r\n"
				+ " |  _ \\(_)                         (_)   | |                             (_) |  __ \\    (_)                     |__   __| (_)     (_)     | |\r\n"
				+ " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___  ___    __ _   _ __ ___  _  | |__) | __ _ _ __ ___   ___ _ __     | |_ __ ___   ___  __ _| |\r\n"
				+ " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\/ __|  / _` | | '_ ` _ \\| | |  ___/ '__| | '_ ` _ \\ / _ \\ '__|    | | '__| \\ \\ / / |/ _` | |\r\n"
				+ " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) \\__ \\ | (_| | | | | | | | | | |   | |  | | | | | | |  __/ |       | | |  | |\\ V /| | (_| | |\r\n"
				+ " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/|___/  \\__,_| |_| |_| |_|_| |_|   |_|  |_|_| |_| |_|\\___|_|       |_|_|  |_| \\_/ |_|\\__,_|_|\r\n"
				+ "                                                                                                                                            ");
		
		
		int num, puntos = 10, total = 0, aciertos = 0, fallos = 0;
		
		System.out.println("PREGUNTA 1" + "\n�Cuantos lados tiene un cuadrado?: " + "\n1) 1"
				+ "\n2) 2"
				+ "\n3) 3"
				+ "\n4) 4"
				+ "\nRespuesta:");
		
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
		
		
		switch (num) {
			case 1:
				System.out.println("Has fallado");
				total -= puntos;
				fallos ++;
				break;
			case 2:	
				System.out.println("Has fallado");
				total -= puntos;
				fallos ++;
				break;
			case 3:
				System.out.println("Has fallado");
				total -= puntos;
				fallos ++;
				break;
			case 4:
				System.out.println("Has acertado, pasa a la siguiente pregunta ^^");
				total += puntos;
				aciertos ++;
				break;
			}
		
		System.out.println("\nPREGUNTA 2 " + "\n�Cuantos lados tiene un Triangulo?: " + "\n1) 1"
		+ "\n2) 2"
		+ "\n3) 3"
		+ "\n4) 4"
		+ "\nRespuesta: ");
		
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("Intentelo de nuevo");
					total -= puntos;
					fallos ++;
					break;
					
				case 2:
					System.out.println("Intentelo de nuevo");
					total -= puntos;
					fallos ++;
					break;
					
				case 3: 
					System.out.println("Has acertado, pasas a la siguiente pregunta");
					total += puntos;
					aciertos ++;
					break;
					
				case 4: 
					System.out.println("Intentelo de nuevo");
					total -= puntos;
					fallos ++;
					break;
			}
			System.out.println("\nPREGUNTA 3: " + "\n�Cuantos kilometros hay entre Aguilar y Lucena? " + "\n1) 20"
					+ "\n2) 25"
					+ "\n3) 30"
					+ "\n4) 15"
					+ "\nRespuesta: ");
			
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("Enhorabuena! Has acertado, pasas a la siguiente pregunta ^-^");
					total += puntos;
					aciertos ++;
					break;
				case 2:
					System.out.println("Has fallado, vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
				case 3:
					System.out.println("Has fallado, vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
				case 4:
					System.out.println("Has fallado, vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
			}
			
			System.out.println("\nPREGUNTA 4: " + "\n�Cuanto mide la torre Eifel? " + "\n1) 50m" + "\n2) 100m"
					+ "\n3) 300m"
					+ "\n4) 400m");
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			
			switch (num) {
				case 1:
					System.out.println("Intentalo de nuevo");
					total -= puntos;
					fallos ++;
					break;
				case 2:
					System.out.println("Intentalo de nuevo");
					total -= puntos;
					fallos ++;
					break;
				case 3:
					System.out.println("Enhorabuena! Has acertado");
					total += puntos;
					aciertos ++;
					break;
				case 4:
					System.out.println("Has fallado");
					total -= puntos;
					fallos ++;
					break;
			}
			
			System.out.println("\nPREGUNTA 5: " + "\nDe que color el caballo blanco de Santiago: " + " \n1) Blanco"
					+ " \n2) Negro"
					+ " \n3) Marron"
					+ " \n4) Gris"
					+ "\nRespuesta: ");
			
			sc = new Scanner(System.in);
			num = sc.nextInt();

			switch (num) {
				case 1: 
					System.out.println("Enhorabuena! Has acertado");
					total += puntos;
					aciertos ++;
					break;
				case 2:
					System.out.println("Vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
				case 3:
					System.out.println("Vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
				case 4:
					System.out.println("Vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
			}
			
			System.out.println("\nPREGUNTA 6: " + "\n�Cuantas peliculas de Harry Potter existen?: " + " \n1) 8"
					+ " \n2) 7"
					+ " \n3) 6"
					+ " \nRespuesta: ");
			
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			switch (num) {
			case 1: 
				System.out.println("Enhorabuena! Has acertado; Tiene 8 peliculas ya que la septima est� dividida en 2 partes");
				total += puntos;
				aciertos ++;
				break;
			case 2:
				System.out.println("Incorrecto, vuelve a intentarlo");
				total -= puntos;
				fallos ++;
				break;
			case 3:
				System.out.println("Incorrecto, vuelve a intentarlo");
				total -= puntos;
				fallos ++;
				break;
			case 4:
				System.out.println("Incorrecto, vuelve a intentarlo");
				total -= puntos;
				fallos ++;
				break;
		}
			System.out.println("\nPREGUNTA 7: " + "\n�En que a�o sacaron la ps4?: " + " \n1) 2015"
					+ " \n2) 2012"
					+ " \n3) 2013"
					+ " \nRespuesta: ");
			
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("Incorrecto, vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
					
				case 2: 
					System.out.println("Incorrecto, vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
				case 3: 
					System.out.println("Has acetado, pasa a la siguiente pregunta");
					total += puntos;
					aciertos ++;
					break;
			}
			System.out.println("\nPREGUNTA 8: " + "\n�Juego mas jugado de PC?: " + " \n1) WOW"
					+ " \n2) LOL"
					+ " \n3) Fortnite"
					+ " \nRespuesta: ");
			
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("Nop, vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
				case 2:
					System.out.println("Has acertado, el LOL juego mas jugado de todos");
					total += puntos;
					aciertos ++;
					break;
				case 3: 
					System.out.println("Nop, vuelve a intentarlo");
					total -= puntos;
					fallos ++;
					break;
					}
			System.out.println("\nPREGUNTA 9: " + "\n�Quien es el Rubius?: " + " \n1) Un presentador"
					+ " \n2) Un informatico"
					+ " \n3) Un youtuber"
					+ " \nRespuesta: ");
			
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("Incorrecto");
					total -= puntos;
					fallos ++;
					break;
				case 2:
					System.out.println("Incorrecto");
					total -= puntos;
					fallos ++;
					break;
				case 3: 	
					System.out.println("Enhorabuena, has acertado");
					total += puntos;
					aciertos ++;
					break;
					}
			
			System.out.println("\nPREGUNTA 10: " + "\n�Quien es el mejor maestro de DAW?: " + " \n1) Rafa"
					+ " \n2) Fran"
					+ " \n3) Joaquin"
					+ " \nRespuesta: ");
			
			sc = new Scanner(System.in);
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("Incorrecto");
					total -= puntos;
					fallos ++;
					break;
				case 2: 
					System.out.println("El mejor master es Fran :PP");
					total += puntos;
					aciertos ++;
					break;
				case 3:
					System.out.println("Incorrecto");
					total -= puntos;
					fallos ++;
					break;
			}
			System.out.println("Has acumulado un total de " + total + " puntos");
	}
}