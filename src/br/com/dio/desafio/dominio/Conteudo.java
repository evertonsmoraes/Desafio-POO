package br.com.dio.desafio.dominio;
/**
 * <h1>Bootcamp </h1>
 * Classe Abstrata que simula 'Conteúdo'
 * 
 * <b>Note:</b> Projeto do Módulo "Abstraindo um Bootcamp Usando Orientação a Objetos em Java" do BootCamp Santander 2024 - Backend com Java"
 * @author  Everton Moraes
 * @version 1.0
 * @since   13/07/2024
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    /**
	* Este método é para calcular a quantidade de Xp do Conteúdo
	* @return double quantidade de Xp do Conteúdo
	*/
    public abstract double calcularXp();

    /**
	* Este método é para recuperar/consultar a Título do Conteúdo
	* @return String o resultado deste método é a Título do Conteúdo
	*/
    public String getTitulo() {
        return titulo;
    }

    /**
	* Este método é para configurar o Título do Conteúdo
	* @param titulo Título do Conteúdo (String)
	*/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
	* Este método é para recuperar/consultar a Descrição do Conteúdo
	* @return String o resultado deste método é a Descrição do Conteúdo
	*/
    public String getDescricao() {
        return descricao;
    }

    /**
	* Este método é para configurar o Descrição do Conteúdo
	* @param descricao Descrição do Conteúdo (String)
	*/
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}