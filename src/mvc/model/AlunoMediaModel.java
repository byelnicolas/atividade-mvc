package mvc.model;

public class AlunoMediaModel {

	private int resultado;
	
	public void somar(int nota1, int nota2, int nota3, int nota4) {
		resultado = (nota1 + nota2 + nota3 + nota4) / 4;
	}
	public int retornarResultado() {
		return resultado;
	}
}
