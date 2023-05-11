/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa:Impressão de dados
* Data:04/04/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade5 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome, sobrenome, naturalidade;
        int idade;

        System.out.println("Informe seu primeiro Nome:\n");
        nome = keyboard.nextLine();
        System.out.println("Informe seu somebrenome:\n");
        sobrenome = keyboard.nextLine();
        System.out.println("Informe sua naturalidade:\n");
        naturalidade = keyboard.nextLine();
        System.out.println("Informe sua idade:\n");
        idade = keyboard.nextInt();


        System.out.println("Deseja visualizar dados completos? [S ou N]\n");
        char resposta = keyboard.next().charAt(0);

        if (resposta == 'S'){
             System.out.println("- " + nome + " " + sobrenome + ".\n" + "- " + idade + " anos" + ".\n" + "- " + naturalidade + ".");
        } else if(resposta == 'N'){
             System.out.println("- " + nome + ".\n" + "- " + idade + ".");
        } else {
             System.out.println("Digitação errada. Tente Novamente");
        }
keyboard.close();
    }
}