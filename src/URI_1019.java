/*+-----------------------------------+
  |@autor: Guilherme Staciarini;      |        
  |@nome: Convers�o de tempo;         |
  |@fonte: URI_1019                   |
  +-----------------------------------+*/

/* ---------- Descri��o -----------

Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada cont�m um valor inteiro N.

Sa�da
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada				Exemplo de Sa�da
556								0:9:16
-----------------------------------------------------------------------
1								0:0:1
----------------------------------------------------------------------*/
import java.util.Scanner;

public class URI_1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tempo, horas,minutos, segundos, rhoras, rminutos;
        
        
        tempo = sc.nextInt();
       
        horas = tempo/3600;
        rhoras = tempo%3600; 
        minutos = rhoras/60;
        rminutos = rhoras%60;    
        segundos = rminutos;
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        
        sc.close();

    }

}	