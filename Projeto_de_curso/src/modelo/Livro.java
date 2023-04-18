/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author IFPR
 */
public class Livro {
    private int id,exemplar, edicao;
    private String titulo, nautor, editora, menserie;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the nautor
     */
    public String getNautor() {
        return nautor;
    }

    /**
     * @param nautor the nautor to set
     */
    public void setNautor(String nautor) {
        this.nautor = nautor;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the menserie
     */
    public String getMenserie() {
        return menserie;
    }

    /**
     * @param menserie the menserie to set
     */
    public void setMenserie(String menserie) {
        this.menserie = menserie;
    }

    /**
     * @return the exemplar
     */
    public int getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }

    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
}
