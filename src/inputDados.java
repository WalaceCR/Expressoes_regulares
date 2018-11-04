import java.util.Scanner;

import classesTratamentoString.*;

public class inputDados {
	
	public static Aluno aluno = new Aluno();
	
	public static Scanner ler = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lerDadosAluno();
		mensagemValidacaoAluno(aluno);

	}
	

	
	private static void lerDadosAluno(){
		
		try {
			
			
			System.out.printf("Nome do aluno \n");
			aluno.setNome(ler.nextLine());
			System.out.printf("Sobrenome do aluno \n");
			aluno.setSobrenome(ler.nextLine());
			System.out.printf("Telefone do aluno \n");
			aluno.setTelefone(ler.nextLine());
			System.out.printf("Email do aluno \n");
			aluno.setEmail(ler.nextLine());
			System.out.printf("Idade do aluno \n");
			aluno.setIdade(ler.nextInt());
			ler.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	
	private static void mensagemValidacaoAluno(Aluno aluno) {
		try {
			
			aluno.exibirAluno(aluno.validarAluno(aluno));
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
}
