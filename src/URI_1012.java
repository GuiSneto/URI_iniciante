/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: �rea;                       |
  |@fonte: URI_1012                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------

Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.

Entrada
O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.

Sa�da
O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a uma das �reas descritas acima, sempre com mensagem correspondente e um espa�o entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 d�gitos ap�s o ponto decimal.


Exemplos de Entrada						Exemplos de Sa�da
3.0 4.0 5.2								TRIANGULO: 7.800
										CIRCULO: 84.949
										TRAPEZIO: 18.200
										QUADRADO: 16.000
										RETANGULO: 12.000
 ---------------------------------------------------------------*/
 
import java.util.Locale;
import java.util.Scanner;

public class URI_1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIANGULO = (A * C) /2;
		CIRCULO = 3.14159 * C * C;
		TRAPEZIO = (A + B)*C/2;
		QUADRADO = B * B;
		RETANGULO = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f%n",TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n",CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n",TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n",QUADRADO);
		System.out.printf("RETANGULO: %.3f%n",RETANGULO);
		
		
		sc.close();



	}
}
