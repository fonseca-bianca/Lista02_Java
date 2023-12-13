import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //pedir pro usuário inserir número inteiro
        System.out.println("Digite um número inteiro: ");
        int numero = input.nextInt();

        //loop for pra percorrer cada múltiplo do número inserido pelo usuário
        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
