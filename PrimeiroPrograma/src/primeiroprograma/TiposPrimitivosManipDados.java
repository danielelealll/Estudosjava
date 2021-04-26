package primeiroprograma;

import java.util.Scanner;

public class TiposPrimitivosManipDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = leia.nextLine();
		System.out.print("Digite a nota do aluno: ");
		float nota = leia.nextFloat();
		System.out.format("A nota de %s é %.2f \n ",nome, nota);
		

	}

}
