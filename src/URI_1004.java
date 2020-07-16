/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Produto Simples;            |
  |@fonte: URI_1004                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------
 
 Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD. A seguir mostre a vari�vel PROD com mensagem correspondente.   

Entrada
O arquivo de entrada cont�m 2 valores inteiros.

Sa�da
Imprima a mensagem "PROD" e a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

Exemplos de Entrada					Exemplos de Sa�da
3
9										PROD = 27
---------------------------------------------------------------
-30
10										PROD = -300
---------------------------------------------------------------
0
9										PROD = 0
 -------------------------------------------------------------*/


import java.util.Locale;
import java.util.Scanner;

public class URI_1004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A * B;
						
		System.out.println("PROD = " + PROD);
		
		sc.close();


	}
}
