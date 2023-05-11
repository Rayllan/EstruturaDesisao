/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa:Meses e Estações
* Data:04/04/2023
*/
import java.util.Scanner;
import java.util.Locale;

public class Atividade8 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe um Númeor entre 1 e 12 \n");
        int mes = keyboard.nextInt();

        switch (mes){
        case 1:
            System.out.print("Mês: Janeiro \nEstação: Verão\n");
            break;
        case 2:
            System.out.print("Mês: Fevereiro \nEstação: Verão\n");
            break;  
        case 3:
            System.out.print("Mês: Março \nEstação: Outono\n ");
            break;
        case 4:
            System.out.print("Mês: Abril \nEstação: Outono\n ");
            break;
        case 5:
            System.out.print("Mês: Maio \nEstação: Outono \n");
            break;
        case 6:
            System.out.print("Mês: Junho \nEstação: Inverno\n ");
            break;
        case 7:
            System.out.print("Mês: Julho \nEstação: Inverno\n");
            break;
        case 8:
            System.out.print("Mês: Agosto \nEstação: Inverno\n");
            break;
        case 9:
            System.out.print("Mês: Setenbro \nEstação: Primavera\n");
            break;
        case 10:
            System.out.print("Mês: Outubro \nEstação: Primavera\n");
            break;
        case 11:
            System.out.print("Mês: Novembro \nEstação: Primavera\n");
            break;
        case 12:
            System.out.print("Mês: Dezembro \nEstação: Primavera\n");
            break;

        default:
       System.out.println("O número escolhido é inválido! Digite um número entre 1 a 12.");
            
        }
    keyboard.close();
    }
}