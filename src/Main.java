import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição do curso de java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso javaScript");
		curso2.setDescricao("Descrição do curso de javaScript");
		curso2.setCargaHoraria(12);
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo2 = new Mentoria();
		//polimorfismo // 
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java OldSchool");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		

		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Na Essência");
		bootcamp.setDescricao("Classico, Estilo OldSchool");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		
		Dev devDenner = new Dev();
		devDenner.setName("DENNER");
		devDenner.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos"+ devDenner.getConteudoInscritos());
		devDenner.progredir();
		devDenner.progredir();
		System.out.println("=====================");
		System.out.println("Conteúdos Inscritos"+ devDenner.getConteudoInscritos());
		System.out.println("Conteúdos Concluidos"+ devDenner.getConteudoConcluidos());
		System.out.println("XP:"+ devDenner.calcularTotalXp());
		
		
		System.out.println("=====================");
		
		Dev devJorlan = new Dev();
		devJorlan.setName("Jorlan");
		devJorlan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos"+ devJorlan.getConteudoInscritos());
		devJorlan.progredir();
		devJorlan.progredir();
		devJorlan.progredir();
//		devJorlan.progredir();
		System.out.println("=====================");
		System.out.println("Conteúdos Inscritos"+ devJorlan.getConteudoInscritos());
		System.out.println("Conteúdos Concluidos"+ devJorlan.getConteudoConcluidos());
		System.out.println("XP:"+ devJorlan.calcularTotalXp());
		
		
	}
}
