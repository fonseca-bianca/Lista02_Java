import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione a operação desejada pelo número: ");
        System.out.println("1 (Soma)");
        System.out.println("2 (Subtração)");
        System.out.println("3 (Divisão)"); //NÃO pode resultar em zero (usar if-else)
        System.out.println("4 (Multiplicação)");
        System.out.println("5 (Resto (%))");
        System.out.println("6 (Raiz quadrada)");
        System.out.println("7 (Potência)");

        int operacao = input.nextInt(); //variável 'operacao'. 'input' é uma instância da Classe Scanner (lê entrada usuário). .nextInt() (método): lê entrada como 'int'
        //int de 1-7 (opções)
        System.out.println("Insira o primeiro número: ");
        double num1 = input.nextDouble(); //optei por double caso o usuário insira número com decimal

        System.out.println("Insira o segundo número ");
        double num2 = input.nextDouble();

        switch (operacao) { //blocos do switch irão percorrer a variável conforme opção digitada pelo usuário
            case 1:
                System.out.println("O resultado é =  " + (num1 + num2));
                break;
            case 2:
                System.out.println("O resultado é =  " + (num1 - num2));
                break;
            case 3:
                if (num2 != 0) { //NÃO pode dividir por zero
                    System.out.println("O resultado é =  " + (num1 / num2));
                } else {
                    System.out.println("ERRO! NÃO é permitida divisão por zero!");
                }
                break;
            case 4:
                System.out.println("O resultado é = " + (num1 * num2));
                break;
            case 5:
                System.out.println("O resultado do resto é = " + (num1 % num2));
                break;
            case 6:
                System.out.println("O resultado da raiz é = " + Math.sqrt(num1)); //biblioteca Math q inclui método .sqtr() pra calcular raiz quadrada - usar double
                break;
            case 7:
                System.out.println("O resultado da potência é = " + Math.pow(num1, num2)); //biblioteca Math q inclui método .pow() pra calcular potência - usar double
                break;
        }
    }
}
