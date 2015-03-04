
public class SalaAula {

	
	int numeroAlunos;
	int ocupacaoMaxima;
	int indiceAluno;
	
	Aluno [] alunos = new Aluno[ocupacaoMaxima];
	
	SalaAula(int ocupacaoMaxima){
		
		this.ocupacaoMaxima = ocupacaoMaxima;
		
	}
	
	
	void adicionaAluno(Aluno a){
		
		if(numeroAlunos >= ocupacaoMaxima)
			System.out.println("Não é possível adicionar o aluno porque a sala está lotada");
		else
			insereAluno(a);
			
	}
	
	void insereAluno(Aluno a){
		
		if(a == null)
			System.out.println("Aluno inválido!");
		else{
			alunos[indiceAluno] = a;
			numeroAlunos++;
			indiceAluno++;			
		}
		
	}
	
	
}
