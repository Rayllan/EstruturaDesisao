/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa:Número ìmpar ou par, positivo ou negativo
* Data:05/04/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade4 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número: \n");
        int numero = keyboard.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é Par\n");
        }else{
            System.out.println("O número é Ímpar\n");
        }
        if (numero >= 0){
            System.out.println("O número é positivo\n");
        }else if (numero <= 0){
            System.out.println("O número é negativo\n");
        }
        else 
        System.out.println("O número é neutro\n");

keyboard.close();
        }
    }
    


