/* Nome do Aluno: Rayllan Christian Gouvêa de Araujo
* RA: 323112057
* Nome do Programa: gas em cm³
* Data:25/04/23
*/

import java.util.Scanner;
import java.util.Locale;

public class atividade19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    
            System.out.println("Digite o volume inicial cm³: ");
            int volume = sc.nextInt();
            int segundos = 0;

            while (volume < 1000){

            volume = volume * 2;
            segundos = segundos + 1;
        }


    System.out.printf("Demorou %d segundo para o volume alcançar 1000 cm³ %n", segundos);
    sc.close();
    }
}
