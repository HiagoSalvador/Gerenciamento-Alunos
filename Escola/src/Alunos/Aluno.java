package Alunos;

public class Aluno {
	
	private Integer id;
	private String nome;
	private Integer serie;
	
	public Aluno(Integer id, String nome, Integer serie) {
		this.id = id;
		this.nome = nome;
		this.serie = serie;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getSerie() {
		return serie;
	}
	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	
	public void addAluno(int aluno) {
		aluno += aluno;
		
	}
	
	public String toString() {
		return "ID: " + id + ","   
	     + " Nome: " +  nome + ","  
	     + " Série: " + serie    ;
	}

}
