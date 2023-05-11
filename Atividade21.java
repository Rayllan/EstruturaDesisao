/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa: tabuada
* Data:11/05/2023
*/
import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = sc.nextInt();

        sc.close();

        for (int valor1 = 1; valor1 <= numero; valor1++) {
            System.out.println("Tabuada do " + valor1 + ":");
            for (int valor2 = 1; valor2 <= 10; valor2++) {
                int resultado = valor1 * valor2;
                System.out.println(valor1 + " x " + valor2 + " = " + resultado);
            }
            System.out.println();
        }
    }
}
