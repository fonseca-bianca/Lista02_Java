import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //criação Objeto Scanner

        //usuário colocará quantidade notas q ele deseja calcular média
        System.out.println("Quantas notas você deseja inserir? ");
        int quantidadeNotas = input.nextInt(); //usuário vai inserir número q será armazenado na variável 'quantidadeNotas'

        //inserir notas lançadas num ArrayList, pq ele permite a dinâmica de adicionar ou remover elementos
        //ArrayList de double tem q ser em Maiúsculo, pq Double é o Objeto do tipo primitivo double
        ArrayList<Double> notasLancadas = new ArrayList<Double>();

        double somarNotas = 0; //variável 'somarNotas' inicializada em zero pra armazenar a soma de todas as notas inseridas

        //loop for vai ser executado a cada nota lançada. Variável 'i' declarada
        for(int i = 0; i <quantidadeNotas; i++){
            System.out.println("Insira a nota número " + (i+1) + " do aluno"); //usuário insere a nota conforme o número indicado acima

            //ler a próxima entrada do usuário como valor double e armazena ele na variável 'nota'
            double nota = input.nextDouble();

            //adiciona 'nota' ao ArrayList 'notasLancadas'
            notasLancadas.add(nota);

            //'somarNotas' irá adicionar a 'nota' ao seu total de notas somadas
            somarNotas += nota;
        }
        //fora do loop for, pois precisa q todas as notas tenham sido inseridas pelo usuário
        //aq será calcula a média como tipo double com base nas notas somadas pela quantidade de números inseridos pelo usuário
        double media = somarNotas / quantidadeNotas;
        System.out.println("A média do aluno é: " + media);
    }
}
