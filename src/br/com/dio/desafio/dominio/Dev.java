package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluidos= new LinkedHashSet<>();

	public void inscreverBootcamp(Bootcamp bootcamp){	
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		if(conteudo.isPresent()){
			this.conteudoConcluidos.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteudo");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudoConcluidos.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}

	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluidos, conteudoInscritos, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluidos, other.conteudoConcluidos)
				&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(name, other.name);
	}
	
	
}
