package br.com.dio.desafio.dominio;
/**
 * <h1>Bootcamp </h1>
 * Classe que simula 'Curso', com heraça de 'Conteudo'
 * 
 * <b>Note:</b> Projeto do Módulo "Abstraindo um Bootcamp Usando Orientação a Objetos em Java" do BootCamp Santander 2024 - Backend com Java"
 * @author  Everton Moraes
 * @version 1.0
 * @since   13/07/2024
 */
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    /**
	* Este método é para recuperar/consultar a Carga Horária do Curso
	* @return int o resultado deste método é a Carga Horária do Curso
	*/
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
	* Este método é para configurar a Carga Horária do Curso
	* @param cargaHoraria Carga Horária do Curso (int)
	*/
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}