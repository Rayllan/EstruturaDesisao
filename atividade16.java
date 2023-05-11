/* Nome do Aluno: Rayllan Christian Gouvêa de Araujo
* RA: 323112057
* Nome do Programa: zero
* Data:24/04/23
*/
import java.util.Scanner;
import java.util.Locale;   

public class atividade16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

         while(numero !=0 ) {

            System.out.println("Digite novamente: ");
            numero = sc.nextInt();
            
    }
       sc.close();
    }
}
