/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Dist�ncia;                  |
  |@fonte: URI_1016                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------

Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X, ou seja, consegue se afastar um quil�metro a cada 2 minutos.

Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa dist�ncia do outro carro.

Entrada
O arquivo de entrada cont�m um n�mero inteiro.

Sa�da
Imprima o tempo necess�rio seguido da mensagem "minutos".

Exemplo de Entrada			Exemplo de Sa�da
30							60 minutos
-----------------------------------------------------------------
110							220 minutos
---------------------------------------------------------------*/

import java.util.Scanner;
import java.util.Locale;

public class URI_1016 {

	public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		int D, T;
		
		D = sc.nextInt();


		
        T = D*2;
        
        System.out.println(T + " minutos");
        
        sc.close();
	}

}