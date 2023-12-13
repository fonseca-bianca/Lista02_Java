import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int x = input.nextInt();

        if(x%2 == 1){
            System.out.println("Weird");
        } else if(x%2 == 0 && x >= 2 && x <= 5){ //se 'x' NÃO for ímpar, irá pras próximas opções
            System.out.println("Not Weird");
        } else if(x%2 == 0 && x >= 6 && x <= 20){
            System.out.println("Weird");
        } else if(x%2 ==0 && x > 20){
            System.out.println("Not Weird");
        }
    }
}
