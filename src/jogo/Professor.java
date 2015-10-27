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
public class Professor extends Usuario{
    private int registro;
    private String disciplina;

    public Professor(int registro, String disciplina, String nome, String senha, int tipo) {
        super(nome, senha, tipo);
        this.registro = registro;
        this.disciplina = disciplina;
    }

    /**
     * @return the registro
     */
    public int getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
