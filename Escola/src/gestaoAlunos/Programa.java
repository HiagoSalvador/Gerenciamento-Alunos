package gestaoAlunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import Alunos.Aluno;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
	     List <Aluno> list = new ArrayList<>();
	     
	      int opcao;
	     
	     do {
	    	 System.out.println("Escolha uma opção:");
	    	 System.out.println(" 1. Adicionar aluno ");
	    	 System.out.println(" 2. Exibir todos os alunos");
	    	 System.out.println(" 3. Buscar por ID");
	    	 System.out.println(" 4. Sair do programa");
	    	 
	    	opcao = scanner.nextInt();
	    	
	    	
	    	switch (opcao) {
	    	case 1:
	    	adicionarAluno(list, scanner);
	    	break;
	    	}
	    	 
	    	switch (opcao) {
	    	case 2:
	    	exibirAluno(list, scanner);
	    	break;
	    	}
	    	
	    	switch (opcao) {
	    	case 3:
	    	buscarPorId(list, scanner);
	    	break;
	    	}
	    	
	    	switch (opcao) {
	    	case 4:
	    	sairDoPrograma(list, scanner);
	    	break;
	    	}
	     }
	    	while(opcao !=4);
	    	System.out.println("Programa encerrado");
		
	     
	     scanner.close();
	}
	
	

	private static void sairDoPrograma(List<Aluno> list, Scanner scanner) 
			


	private static void buscarPorId(List<Aluno> list, Scanner scanner) {
	    System.out.println("Informe o ID:");
	    Integer id = scanner.nextInt();
	
	Optional<Aluno> alunoEncontrado = list.stream()
            .filter(aluno -> aluno.getId().equals(id))
            .findFirst();
	 if (alunoEncontrado.isPresent()) {
	        Aluno aluno = alunoEncontrado.get();
	        System.out.println("Aluno encontrado: " + aluno);
	    } else {
	        System.out.println("Aluno com ID " + id + " não encontrado.");
	    }	
	}

	private static void exibirAluno(List<Aluno> list, Scanner scanner) {
		for(Aluno aluno: list) {
			System.out.println(aluno);
		}	
	}

	private static void adicionarAluno(List<Aluno> list, Scanner scanner) {
		System.out.println("Informe o ID do aluno:");
		Integer id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Informe o nome do aluno:");
		String nome = scanner.next();
		System.out.println("Informe a serie do aluno:");
		Integer serie = scanner.nextInt();
		
		
		Aluno aluno = new Aluno(id, nome, serie);
		System.out.println("Aluno adicionado com sucesso!");
		list.add(aluno);
	}	
}
