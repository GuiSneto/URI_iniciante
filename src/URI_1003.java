/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Soma simples;               |
  |@fonte: URI_1003                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------
 * 
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada					Exemplos de Saída
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


