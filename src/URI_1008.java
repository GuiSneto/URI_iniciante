/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Sal�rio;                    |
  |@fonte: URI_1008                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------

Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.

Entrada
O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas casas decimais, representando o n�mero, quantidade de horas trabalhadas e o valor que o funcion�rio recebe por hora trabalhada, respectivamente.

Sa�da
Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo fornecido, com um espa�o em branco antes e depois da igualdade. No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.

Exemplos de Entrada					Exemplos de Sa�da
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
