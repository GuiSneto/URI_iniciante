/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Área do Círculo;            |
  |@fonte: URI_1002                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------

 A fórmula para calcular a área de uma circunferência é: area = π . raio^2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída

Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada				Exemplos de Saída
2.00								A=12.5664
-----------------------------------------------------------
100.64								A=31819.3103
-----------------------------------------------------------
150.00								A=70685.775
----------------------------------------------------------*/

import java.util.Locale;
import java.util.Scanner;

public class URI_1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, raio;
		
		raio = sc.nextDouble();
		
		area = 3.14159 * Math.pow(raio , 2.0);
						
		System.out.printf("A=%.4f%n", area);
		
		sc.close();


	}
}
