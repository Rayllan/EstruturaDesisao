/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa:Diarias 
* Data:05/04/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade7 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double diaria = 60.0,
        dias = 0,
        taxa = 0.0,
        totalhospedagem = 0.0;

        System.out.println("Informe quantos dias você vai ficar hospedado: \n");
        dias = keyboard.nextInt();

        if (dias > 15){
             taxa = (5.50 * dias);
        }
        else if (dias == 15){
             taxa = (6.00 * dias);
        }
        else if (dias < 15){
             taxa = (8.00 * dias);
        }

        totalhospedagem = ((diaria * dias) + taxa);

          System.out.println("Sua hospedagem ficara R$ " + totalhospedagem);
        
    keyboard.close();
    }
}