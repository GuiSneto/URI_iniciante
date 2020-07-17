/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: O Maior;                    |
  |@fonte: URI_1013                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------

Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior".
Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

Exemplos de Entrada					Exemplos de Saída
7 14 106							106 eh o maior
----------------------------------------------------------------------
217 14 6							217 eh o maior
 -------------------------------------------------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class URI_1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, MAIORAB, MAIORABC;
		

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		MAIORAB = (A + B + Math.abs(A - B))/2;
		MAIORABC = (MAIORAB + C + Math.abs(MAIORAB - C))/2;
			
		
		System.out.println(MAIORABC +" eh o maior");

		
		sc.close();



	}
}	