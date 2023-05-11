/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa:Conceito de nota!
* Data:05/04/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade6 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite sua nota: \n");
        int nota = keyboard.nextInt();

        if (nota >= 0 && nota <= 49){
             System.out.println("Seu conceito de nota é 'Insuficiente'");
        } else if (nota >= 50 && nota <= 64){
             System.out.println("Seu conceito de nota é 'Regular'");
        } else if (nota >= 65 && nota <= 84){
             System.out.println("Seu conceito de nota é 'Bom'");
        } else if (nota >= 85 && nota <= 100){
             System.out.println("Seu conceito de nota é 'Ótimo'");
        } else { 
             System.out.println("Erro! digite novamente sua nota");
        }   
keyboard.close();
    }
}