//Ceci importe toutes les classes du package java.util
import java.util.*;
import java.lang.Math;

public class Polynome {
	public static void main(String[] args)
	{
		Scanner keyb= new Scanner(System.in);
		System.out.println("Le polynome est ax^2+bx+c");
		//Ask a
		System.out.println("Veuillez saisir a :");
		int a = keyb.nextInt();
		//Ask b
		System.out.println("Veuillez saisir b :");
		int b = keyb.nextInt();
		//Ask c
		System.out.println("Veuillez saisir c :");
		int c = keyb.nextInt();;
		System.out.println("Le polynome est " + a +"x^2+" + b + "x+" + c);
		int delta = (b*b - 4 * a * c);
		if (delta==0) {
			int x0 = (-b)/(2*a);
			System.out.println("La racine est " + x0);
		}
		if (delta>0) {
			double x1 = (-b-Math.sqrt(delta))/(2*a);
			double x2 = (-b+Math.sqrt(delta))/(2*a);
			System.out.println("Les racines sont " + x1 + " et " + x2 + " dans R");
		}
		if (delta<0) {
			String x1 = (-b/(2*a))  + "-i*sqrt(" + (-delta) + ")" + "/" + (2*a);
			String x2 = (-b/(2*a)) + "+i*sqrt(" + (-delta) + ")" + "/" + (2*a);
			System.out.println("Les racines sont " + x1 + " et " + x2 + " dans C (pas de racines dans R)");
		}
	}
}
