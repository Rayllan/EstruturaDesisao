/* Nome do Aluno: Rayllan Christian Gouvêa de Araujo
* RA: 323112057
* Nome do Programa: fatorial
* Data:24/04/23
*/
import java.util.Scanner;
import java.util.Locale;
    
public class atividade18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        sc.close();
        
        int fatorial = 1;
        int i;
        
    for (i = 1; i <= num; i = i + 1) {
        fatorial = fatorial * i;
    }
        System.out.println(fatorial);
        
    }
}
