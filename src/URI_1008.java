/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Salário;                    |
  |@fonte: URI_1008                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------

Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

Exemplos de Entrada					Exemplos de Saída
25
100									NUMBER = 25
5.50								SALARY = U$ 550.00
----------------------------------------------------------------------
1
200									NUMBER = 1
20.50								SALARY = U$ 4100.00
 --------------------------------------------------------------------*/

import java.util.Locale;
import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NUMBER, HOURS;
		double  VALOR, SALARY;
		
		NUMBER = sc.nextInt();
		HOURS = sc.nextInt();
		VALOR = sc.nextDouble();
		
		
		SALARY = HOURS*VALOR;
		
		System.out.println("NUMBER = " + NUMBER);
						
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		
		sc.close();


	}
}
