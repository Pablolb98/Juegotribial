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
		
		System.out.println("PREGUNTA 1" + "\n¿Cuantos lados tiene un cuadrado?: " + "\n1) 1"
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
		
		System.out.println("PREGUNTA 2" + "¿Cuantos lados tiene un Triangulo?: " + "\n1) 1"
		+ "\n2) 2"
		+ "\n3) 3"
		+ "\n4) 4");
		
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
					System.out.println("Intentelo de nuevo");
					total += puntos;
					aciertos ++;
					break;
					
				case 4: 
					System.out.println("Intentelo de nuevo");
					total -= puntos;
					fallos ++;
					break;
			}
	}
}