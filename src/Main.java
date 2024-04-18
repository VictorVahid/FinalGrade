import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		process student = new process();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome aluno: ");
		student.nomeAluno = sc.next();
		System.out.println("Nota primeiro Trimestre: ");
		student.NotaUm = sc.nextFloat();
		System.out.println("Nota segundo Trimestre: ");
		student.NotaDois = sc.nextFloat();
		System.out.println("Nota terceiro Trimestre: ");
		student.NotaTres = sc.nextFloat();

		student.getNomeAluno();
		student.mediaALuno();
		if (student.mediaALuno() < 60.0) {
			System.out.println("Failed");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("Pass");
		}
		sc.close();
	}
}