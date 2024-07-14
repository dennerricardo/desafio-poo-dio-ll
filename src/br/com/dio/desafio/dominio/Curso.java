package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;
	
	public Curso() {
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [getDescricao()=" +  getTitulo() + 
				", getDescricao()=" + getDescricao() + 
				", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 10d;
	} 
	
	
	
}
