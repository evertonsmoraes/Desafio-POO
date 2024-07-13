package br.com.dio.desafio.dominio;

import java.time.LocalDate;
/**
 * <h1>Bootcamp </h1>
 * Classe que simula 'Mentoria', com heraça de 'Conteudo'
 * 
 * <b>Note:</b> Projeto do Módulo "Abstraindo um Bootcamp Usando Orientação a Objetos em Java" do BootCamp Santander 2024 - Backend com Java"
 * @author  Everton Moraes
 * @version 1.0
 * @since   13/07/2024
 */
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    /**
	* Este método é para recuperar/consultar a Data Local da Mentoria
	* @return LocalDate o resultado deste método é a Data Local da Mentoria
	*/
    public LocalDate getData() {
        return data;
    }

    /**
	* Este método é para configurar o Data Local da Mentoria
	* @param data Data Local a ser configurada
	*/        
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}