/* Nome do Aluno: Rayllan Christian Gouvêa de Araujo
* RA: 323112057
* Nome do Programa: imprima de 1 a 100
* Data:25/04/23
*/
    
public class atividade13 {
    public static void main(String[] args)
    {

    int soma = 0;
    
    int num;
    num = 1;

    while(num <= 100) {

        soma = num + soma;
        num = num + 1;

    }
        System.out.println(soma);
    }
}
