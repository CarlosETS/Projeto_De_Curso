/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author IFPR
 */
public class Emprestimo {
    private int idEmpres;
    private String titulo, leitor;
    private Date dtemprestimo, dtDevolucao;

    /**
     * @return the idEmpres
     */
    public int getIdEmpres() {
        return idEmpres;
    }

    /**
     * @param idEmpres the idEmpres to set
     */
    public void setIdEmpres(int idEmpres) {
        this.idEmpres = idEmpres;
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
     * @return the leitor
     */
    public String getLeitor() {
        return leitor;
    }

    /**
     * @param leitor the leitor to set
     */
    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    /**
     * @return the dtemprestimo
     */
    public Date getDtemprestimo() {
        return dtemprestimo;
    }

    /**
     * @param dtemprestimo the dtemprestimo to set
     */
    public void setDtemprestimo(Date dtemprestimo) {
        this.dtemprestimo = dtemprestimo;
    }

    /**
     * @return the dtDevolucao
     */
    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    /**
     * @param dtDevolucao the dtDevolucao to set
     */
    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }
}
