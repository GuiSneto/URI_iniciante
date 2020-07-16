/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: C�lculo Simples;            |
  |@fonte: URI_1010                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------

Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Sa�da
A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o "R$". O valor dever� ser apresentado com 2 casas ap�s o ponto.

Exemplos de Entrada						Exemplos de Sa�da
12 1 5.30
16 2 5.10								VALOR A PAGAR: R$ 15.50
-------------------------------------------------------------------------
13 2 15.30
161 4 5.20								VALOR A PAGAR: R$ 51.40
 -----------------------------------------------------------------------*/

import java.util.Locale;
import java.util.Scanner;

public class URI_1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int CODPECA1, CODPECA2, NUMPECA1, NUMPECA2 ;
		double VALPECA1, VALPECA2, TOTAL;
		
		
		CODPECA1 = sc.nextInt();
		NUMPECA1 = sc.nextInt();
		VALPECA1 = sc.nextDouble();
		

		
		CODPECA2 = sc.nextInt();
		NUMPECA2 = sc.nextInt();
		VALPECA2 = sc.nextDouble();
		
		TOTAL = (NUMPECA1 * VALPECA1) + (NUMPECA2 * VALPECA2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);
		
		sc.close();



	}
}
