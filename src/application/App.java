package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Aluno;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<>();

        System.out.print("Digite o número de alunos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            Aluno aluno = new Aluno(null, null, null, null, null);

            System.out.println("Digite os dados do aluno " + (i + 1) + ": ");
            System.out.print("Nome: ");
            aluno.setNome(sc.nextLine());
            System.out.print("Id: ");
            aluno.setId(sc.nextInt());
            System.out.print("Nota 1: ");
            aluno.setN1(sc.nextDouble());
            System.out.print("Nota 2: ");
            aluno.setN2(sc.nextDouble());
            System.out.print("Nota 3: ");
            aluno.setN3(sc.nextDouble());

            listaAlunos.add(aluno);
        }

        System.out.println("\nLista de alunos:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }

        sc.close();
    }
}
