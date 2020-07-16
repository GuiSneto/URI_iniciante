/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Média 2;                    |
  |@fonte: URI_1006                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------

Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada					Exemplos de Saída
5.0
6.0
7.0										MEDIA = 6.3
--------------------------------------------------------------------
5.0
10.0
10.0									MEDIA = 9.0
------------------------------------------------------------------ */

import java.util.Locale;
import java.util.Scanner;

public class URI_1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		MEDIA = (2*A + 3*B + 5*C)/10;
						
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		sc.close();


	}
}
