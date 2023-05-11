/* Nome do Aluno: Rayllan Christian Gouvêa de Araujo
* RA: 323112057
* Nome do Programa: Elevador
* Data:25/04/23
*/

import java.util.Scanner;
import java.util.Locale;

public class atividade20 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a carga maxima do elevador: ");
        double cargamaxima = sc.nextDouble();

        System.out.println("Digite a quantidade maxima de pessoas: ");
        int quantidadepessoas = sc.nextInt();
       
        double carga = 0;

         do {
            System.out.printf("Digite o peso da pessoa: ");

            carga += sc.nextDouble();
            quantidadepessoas--;

        } while (carga <= cargamaxima && quantidadepessoas > 0);

sc.close();
    }
}

