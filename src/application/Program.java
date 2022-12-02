package application;
import entities.Cadastro;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo, a pensao possui 10 quartos, quantos alunos irao se hospedar? ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            do {
                System.out.println("Por favor, digite uma quantidade valida!");
                System.out.println("Quantos alunos irao se hospedar ?");
                n = sc.nextInt();
            } while (n > 10 || n < 1);
        }

        Cadastro[] vetor = new Cadastro[n + 1];

        for (int i = 1; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Ola, qual o seu nome ?");
            String nome = sc.nextLine();
            System.out.println("Qual o seu email?");
            String email = sc.next();
            System.out.println("Digite o numero do quarto desejado: ");
            int numQuarto = sc.nextInt();
            vetor[i] = new Cadastro(nome, email, numQuarto);
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("Quartos Reservados: ");
        System.out.println();
        String hospede;
        for (int i = 1; i < vetor.length; i++) {
            hospede = vetor[i].toString();
            System.out.println(hospede);
        }
        sc.close();
    }
}

