/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Distância Entre Dois Pontos;|
  |@fonte: URI_1015                   |
  +-----------------------------------+*/

/* ---------- Descrição -----------
 
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula.

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
1.0 7.0
5.0 9.0					4.4721
----------------------------------------------------
-2.5 0.4
12.1 7.3				16.1484
 -------------------------------------------------*/

import java.util.Scanner;
import java.util.Locale;

public class URI_1015 {

	public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		double X1, X2 , Y1, Y2, distancia;
		
		X1 = sc.nextDouble();
		Y1 = sc.nextDouble();
		X2 = sc.nextDouble();
		Y2 = sc.nextDouble();
		
        distancia = Math.sqrt((X2 - X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
        
        System.out.printf("%.4f%n",distancia);
        
        sc.close();
	}

}



