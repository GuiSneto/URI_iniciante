/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Gasto de Combust�vel;       |
  |@fonte: URI_1017                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------
Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao utilizar um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, calcular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.

Entrada
O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem (em horas) e o segundo � a velocidade m�dia durante a mesma (em km/h).

Sa�da
Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal

Exemplo de Entrada			Exemplo de Sa�da
10
85							70.833
---------------------------------------------------------------
2
92							15.333
-------------------------------------------------------------*/

import java.util.Scanner;
import java.util.Locale;

public class URI_1017 {

	public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		double V, T, D, consumo;
		
		V = sc.nextDouble();
		T = sc.nextDouble();
		
		
        D = V*T;
        
        consumo = D/12;

        
        System.out.printf("%.3f%n", consumo);
        
        sc.close();
	}

}