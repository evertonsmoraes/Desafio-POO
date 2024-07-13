package br.com.dio.desafio.dominio;

import java.util.*;
/**
 * <h1>Bootcamp </h1>
 * Classe que simula 'Desenvolvedor'
 * 
 * <b>Note:</b> Projeto do Módulo "Abstraindo um Bootcamp Usando Orientação a Objetos em Java" do BootCamp Santander 2024 - Backend com Java"
 * @author  Everton Moraes
 * @version 1.0
 * @since   13/07/2024
 */
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
	* Este método é para inscrever o Desenvolverdor no Bootcamp
	* @param bootcamp bootcampo a inscrever o Desenvolvedor (Bootcamp)
	*/
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
	* Este método é para progredir nos conteúdos que o Desenvolvedor esta inscrito
	*/
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    /**
	* Este método é para calcular o Total de XP do Desenvolvedor
	* @return Double o resultado deste método é o Total de XP do Desenvolvedor
	*/
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        /*return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }

    /**
	* Este método é para recuperar/consultar o Nome do Desenvolvedor
	* @return String o resultado deste método é o Nome do Desenvolvedor
	*/
    public String getNome() {
        return nome;
    }

    /**
	* Este método é para configurar o Nome do Desenvolvedor
	* @param nome Nome do Desenvolvedor (String)
	*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
	* Este método é para recuperar/consultar os Conteúdos Inscritos
	* @return Set<> o resultado deste método são os os Conteúdos Inscritos
	*/
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
	* Este método é para configurar os Conteúdos Inscritos
	* @param conteudosInscritos Conteúdos Inscritos (Set<Conteudo>)
	*/
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
	* Este método é para recuperar/consultar os Conteúdos Concluídos
	* @return Set<> o resultado deste método são os os Conteúdos Concluídos
	*/
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
	* Este método é para configurar os Conteúdos Concluídos
	* @param conteudosConcluidos Conteúdos Concluídos (Set<>)
	*/
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}