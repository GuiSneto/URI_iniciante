/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Consumo;                    |
  |@fonte: URI_1014                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------

Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto (em litros).

Entrada
O arquivo de entrada cont�m dois valores: um valor inteiro X representando a dist�ncia total percorrida (em Km), e um valor real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.

Sa�da
Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, seguido da mensagem "km/l".

Exemplo de Entrada	Exemplo de Sa�da
500
35.0				14.286 km/l
------------------------------------------------------------
2254
124.4				18.119 km/l
 ----------------------------------------------------------*/

import java.util.Locale;
import java.util.Scanner;

public class URI_1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    
		double  X,Y,CONSUMO;
		
		X = sc.nextDouble();
		Y = sc.nextDouble();
		
		
		CONSUMO = X/Y;
		
						
		System.out.printf("%.3f km/l\n",CONSUMO);
		
		
		sc.close();
		

	}
}

