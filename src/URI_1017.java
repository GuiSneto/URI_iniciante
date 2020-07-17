/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Gasto de Combustível;       |
  |@fonte: URI_1017                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).

Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

Exemplo de Entrada			Exemplo de Saída
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