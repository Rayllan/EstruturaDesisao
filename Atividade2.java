/* Nome do Aluno: Rayllan Christian Gouvêa de Araújo
* RA:323112057
* Nome do Programa:Número maior
* Data:05/04/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class Atividade2 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);
 
        double numero1, numero2, numero3;
        double menor, medio, maior;

        System.out.println("Digite o primeiro número");
        numero1 = keyboard.nextDouble();
        System.out.println("Digite o segundo número");
        numero2 = keyboard.nextDouble();
        System.out.println("Digite o terceiro número");
        numero3 = keyboard.nextDouble();

        if(numero1 <= numero2 && numero1 <= numero3 ){
            menor = numero1;
            if (numero2 <= numero3){
            medio = numero2;
            maior = numero3;
            }else{
            medio = numero3;
            maior = numero2;
            }
        }else if (numero2 <= numero1 && numero2 <= numero3){
            menor = numero2;
            if (numero1 <= numero3){
            medio = numero1;
            maior = numero3;
        }else{
            medio = numero3;
            maior = numero1;
        }
        }else if (numero3 <= numero1 && numero3 <= numero2){
            menor = numero3;
            if (numero2 <= numero1){
            medio = numero2;
            maior = numero1;
        }else{
            medio = numero1;
            maior = numero2;

        }
        System.out.println("Valores em ordem crescente: " + menor + ", " + medio + ", " + maior);
        }
    keyboard.close();
    }
        
   }

