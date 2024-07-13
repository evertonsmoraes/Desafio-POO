package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
/**
 * <h1>Bootcamp </h1>
 * Classe que simula um 'Bootcamp'
 * 
 * <b>Note:</b> Projeto do Módulo "Abstraindo um Bootcamp Usando Orientação a Objetos em Java" do BootCamp Santander 2024 - Backend com Java"
 * @author  Everton Moraes
 * @version 1.0
 * @since   13/07/2024
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    /**
	* Este método é para recuperar/consultar o Nome do Bootcamp
	* @return String o resultado deste método é o Nome do Bootcamp
	*/
    public String getNome() {
        return nome;
    }

    /**
	* Este método é para configurar o Nome do Bootcamp
	* @param nome Nome do Bootcamp (String)
	*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
	* Este método é para recuperar/consultar o Descrição do Bootcamp
	* @return String o resultado deste método é o Descrição do Bootcamp
	*/
    public String getDescricao() {
        return descricao;
    }

    /**
	* Este método é para configurar o Descrição do Bootcamp
	* @param descricao Descrição do Bootcamp (String)
	*/
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
	* Este método é para recuperar/consultar a Data Inicial do Bootcamp
	* @return LocalDate o resultado deste método é a Data Inicial do Bootcamp
	*/
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
	* Este método é para recuperar/consultar a Data Final do Bootcamp
	* @return LocalDate o resultado deste método é a Data Final do Bootcamp
	*/
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
	* Este método é para recuperar/consultar os Desenvolvedores Inscritos no Bootcamp
	* @return Set<> o resultado deste método são os Desenvolvedores Inscritos no Bootcamp
	*/
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
	* Este método é para configurar os Desenvolvedores Inscritos no Bootcamp
	* @param devsInscritos  Desenvolvedores Inscritos no Bootcamp (Set<>)
	*/
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    /**
	* Este método é para recuperar/consultar os Conteúdos do Bootcamp
	* @return Set<> o resultado deste método são os Conteúdos do Inscritos n
	*/
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
	* Este método é para configurar os Conteúdos do Bootcamp
	* @param conteudos  Conteúdos do Bootcamp (Set<>)
	*/
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}