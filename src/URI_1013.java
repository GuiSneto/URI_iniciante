/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: O Maior;                    |
  |@fonte: URI_1013                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------

Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos seguido da mensagem �eh o maior".
Entrada
O arquivo de entrada cont�m tr�s valores inteiros.

Sa�da
Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".

Exemplos de Entrada					Exemplos de Sa�da
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