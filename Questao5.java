import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //imprimir o número digitado pelo usuário pra encontrar o fatorial dele
        System.out.println("Insira um número inteiro pra que o fatorial dele seja calculado ");

        //leitura da entrada do usuário como inteiro
        int numero = input.nextInt();

        //utilizar tipo long, pq esse tipo no Java tem um limite grande de números, tendo em vista ser um fatorial de um número, por isso não coloquei int
        long fatorialNumero = 1; //pq se inicializasse em zero, o resultado seria zero

        //loop for pra percorrer cada número de 1 até o número inserido pelo usuário (ex.: 1 - 100)
        for(int i = 1; i <= numero; i++){
            //fatorial do número multiplicado pelo valor contido em 'i' e depois armazena esse resultado em 'fatorialNumero'
            fatorialNumero *= i;
        }
        //imprimir o resultado do fatorial do número
        System.out.println("O fatorial do número " + numero + " inserido é: " + fatorialNumero);
    }
}
