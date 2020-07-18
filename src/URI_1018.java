/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: C�lulas;                    |
  |@fonte: URI_1017                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------
 
Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode ser decomposto. As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas necess�rias.

Entrada
O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).

Sa�da
Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, conforme o exemplo fornecido. N�o esque�a de imprimir o fim de linha ap�s cada linha, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

Exemplo de Entrada			Exemplo de Sa�da
576							576
							5 nota(s) de R$ 100,00
							1 nota(s) de R$ 50,00
							1 nota(s) de R$ 20,00
							0 nota(s) de R$ 10,00
							1 nota(s) de R$ 5,00
							0 nota(s) de R$ 2,00
							1 nota(s) de R$ 1,00
 */

import java.util.Scanner;
import java.util.Locale;

public class URI_1018 {

	public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		

		int valor;
		
		valor=sc.nextInt();
		
		System.out.println(valor);
		
		System.out.printf("%d nota(s) de R$ 100,00\n",valor/100);
		valor %= 100;
		
		System.out.printf("%d nota(s) de R$ 50,00\n",valor/50);
		valor %= 50;
		
		System.out.printf("%d nota(s) de R$ 20,00\n",valor/20);
		valor %= 20;
		
		System.out.printf("%d nota(s) de R$ 10,00\n",valor/10);
		valor %= 10;
		
		System.out.printf("%d nota(s) de R$ 5,00\n",valor/5);
		valor %= 5;
		
		System.out.printf("%d nota(s) de R$ 2,00\n",valor/2);
		valor %= 2;
		
		System.out.printf("%d nota(s) de R$ 1,00\n",valor);

		
		sc.close();
	}
}
		