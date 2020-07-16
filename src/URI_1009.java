/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Sal�rio com B�nus;          |
  |@fonte: URI_1009                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------
 
Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber no final do m�s, com duas casas decimais.

Entrada
O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2 valores de dupla precis�o (double) com duas casas decimais, representando o sal�rio fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Sa�da
Imprima o total que o funcion�rio dever� receber, conforme exemplo fornecido.

Exemplos de Entrada						Exemplos de Sa�da
JOAO
500.00
1230.30									TOTAL = R$ 684.54
----------------------------------------------------------------------------
PEDRO
700.00
0.00									TOTAL = R$ 700.00
-------------------------------------------------------------------------- */

import java.util.Locale;
import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String NAME;
		double SALARYF, SELLERS, TOTAL;
		
		NAME = sc.nextLine();
		SALARYF = sc.nextDouble();
		SELLERS = sc.nextDouble();
		
		
		TOTAL = ((SELLERS*15/100)+SALARYF);
						
		System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
		
		sc.close();


	}
}
