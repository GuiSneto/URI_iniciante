/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Consumo;                    |
  |@fonte: URI_1014                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------

Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".

Exemplo de Entrada	Exemplo de Saída
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

