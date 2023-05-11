/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa: Metodo de pagamento  
* Data:05/04/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade9 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorvenda,valorfinal;
        
    System.out.println("Informe o valor total da venda: \n");
        valorvenda = keyboard.nextDouble();

    System.out.println("Informe como deseja pagar:"
    + "\n Opção 1 - Venda a Vista - desconto de 10%"
    + "\n Opção 2 - Venda a Prazo 30 dias - desconto de 5% "
    + "\n Opção 3 - Venda a Prazo 60 dias - mesmo preço"
    + "\n Opção 4 - Venda a Prazo 90 dias - acréscimo de 5%"
    + "\n Opção 5 - Venda com cartão de débito - desconto de 8%"
    + "\n Opção 6 - Venda com cartão de crédito - desconto de 7% ");

    int opcao = keyboard.nextInt(); 

    switch (opcao) {
        case 1: 
            valorfinal = valorvenda * 0.9; // desconto de 10%
            break;

        case 2: 
            valorfinal = valorvenda * 0.95;//  desconto de 5%
            break;

        case 3: 
            valorfinal = valorvenda;// mesmo preço
            break;

        case 4: 
            valorfinal =  valorvenda * 1.05;// acréscimo de 5%
            break;

        case 5: 
            valorfinal = valorvenda * 0.92;// desconto de 8%
            break;
        
        case 6: 
            valorfinal = valorvenda * 0.93;// desconto de 7%
            break;

        default:

        valorfinal = valorvenda; // opção inválida, mantém o valor original
        System.out.println("Opção inválida");
        
        }
        System.out.printf("Valor total R$ %.2f", valorfinal);
        keyboard.close();
    }
}