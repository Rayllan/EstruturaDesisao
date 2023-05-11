/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa:Número maior
* Data:04/04/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade1 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);
 
        double numero1, numero2;

        System.out.println("Digite um Número:\n");
        numero1 = keyboard.nextDouble();
        System.out.println("Digite Outro Número:\n");
        numero2 = keyboard.nextDouble();

         if(numero1 > numero2){
             System.out.println("O número " + numero1 + " é o maior!\n ");

        } else if (numero2 > numero1 ){
             System.out.println("O número " + numero2 + " é o maior!\n ");
        } else {

             System.out.println("Os dois número são Iguais! ");

        }
    keyboard.close();
    }
}