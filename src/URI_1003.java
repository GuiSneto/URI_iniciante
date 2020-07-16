/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Soma simples;               |
  |@fonte: URI_1003                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------
 * 
Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � vari�vel SOMA. A seguir escrever o valor desta vari�vel.

Entrada
O arquivo de entrada cont�m 2 valores inteiros.

Sa�da
Imprima a mensagem "SOMA" com todas as letras mai�sculas, com um espa�o em branco antes e depois da igualdade seguido pelo valor correspondente � soma de A e B. Como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

Exemplos de Entrada					Exemplos de Sa�da
30
10										SOMA = 40
----------------------------------------------------------------
-30
10										SOMA = -20
----------------------------------------------------------------
0
0										SOMA = 0
---------------------------------------------------------------*/

import java.util.Locale;
import java.util.Scanner;

public class URI_1003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, SOMA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		
		SOMA = (A + B);
						
		System.out.println("SOMA = " + SOMA);
		
		sc.close();


	}
}


