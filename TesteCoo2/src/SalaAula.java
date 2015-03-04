
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
			System.out.println("N�o � poss�vel adicionar o aluno porque a sala est� lotada");
		else
			insereAluno(a);
			
	}
	
	void insereAluno(Aluno a){
		
		if(a == null)
			System.out.println("Aluno inv�lido!");
		else{
			alunos[indiceAluno] = a;
			numeroAlunos++;
			indiceAluno++;			
		}
		
	}
	
	
}
