/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa: Multiplos sete
* Data:11/05/2023
*/

public class Atividade12 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero += 2;
        } while (numero % 7 != 0);
    }
}
