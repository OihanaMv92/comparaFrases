package es.studium.comparafrase;

import java.util.Scanner;

public class comparafrase
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena1,cadena2;
		System.out.println("Dame una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame una cadena");
		cadena2 = teclado.nextLine();
		
		
		if (cadena1.equals(cadena2))
		{
		System.out.println("la cadena 1 y la cadena 2 son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}

	}

}
