package Grundlagen;

import java.util.Scanner;

public class Uebersicht {
	static int zahl4 = 0;
	final static float pi = 3.14f;
	
	public static void main(String[] args) {
		// sichtbarkeit(2);
		// arrayRechnungen();
		// fors();
	}
	
	public static void sichtbarkeit(int zahl5) {
		int zahl1 = 0;
		int zahl3 = 0;
		for (int i = 0; i <= 20; i++) {
			zahl1 = 0;
			zahl1 += i;
			int zahl2 = 0;
			zahl2 += i;
			zahl3 = zahl2;
		}
		System.out.println(zahl1);
		System.out.println(zahl3);
	}
	
	public static void konstanten(int x) {
		int var = 0;
		final float konst = 3.14f;
		
		System.out.println("Möglich:");
		System.out.println(var + x);
		System.out.println("Unmöglich:");
		// konst += 1.0f;
	}
	
	public static void arrayRechnungen() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr2.length; i++) {
			// arr2[i] = i + 1;
			System.out.println("Zahl " + i  + ":");
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Inhalt des Zahlenarrays: ");
		
		for (int j : arr2) {
			System.out.println(j);
		}
		
		sc.close();
	}
	
	public static void fors() {
		String[] klaus = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < klaus.length; i++) {
			System.out.println("String " + i + " eingeben");
			klaus[i] = sc.nextLine();
		}
		
		for(String j: klaus) {
			System.out.println(j);
		}
		sc.close();
	}
	
	public static double quadrieren(int x) {
		double quadrat = Math.pow(x, 2);
		return quadrat;
	}
	
}
