/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogo;

/**
 *
 * @author ALAN
 */
public class Aluno extends Usuario{
    private int matricula;
    private final String dataNascimento;
    private int classe;

    public Aluno(int matricula, String dataNascimento, int classe, String nome, String senha, int tipo) {
        super(nome, senha, tipo);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.classe = classe;
    }
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }
    
    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the classe
     */
    public int getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(int classe) {
        this.classe = classe;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }
}
