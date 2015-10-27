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
public class Historico {
    private int perctAcertos;
    private int qtdErros;
    private int totalPontos;
    private int nivelAtual;
    private int numeroPontosProxNivel;

    public Historico(){
    }
    
    /**
     * @return the percAcertos
     */
    public float getPerctAcertos() {
        return perctAcertos;
    }

    /**
     * @param percAcertos the percAcertos to set
     */
    public void setPercAcertos(int totalAcertos) {
       this.perctAcertos = totalAcertos;
       int  temp=(perctAcertos*100)/5;
       perctAcertos=temp;
    }

    /**
     * @return the qtdErros
     */
    public int getQtdErros() {
        return qtdErros;
    }

    /**
     * @param qtdErros the qtdErros to set
     */
    public void setQtdErros(int qtdErros) {
        this.qtdErros = qtdErros;
    }

    /**
     * @return the totalPontos
     */
    public int getTotalPontos() {
        return totalPontos;
    }

    /**
     * @param totalPontos the totalPontos to set
     */
    public void setTotalPontos(int totalAcertos) {
        this.totalPontos = totalAcertos;
        int t=totalAcertos*100;
        totalPontos=t;
    }

    /**
     * @return the nivelAtual
     */
    public int getNivelAtual() {
        return nivelAtual;
    }

    /**
     * @param nivelAtual the nivelAtual to set
     */
    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }

    /**
     * @return the numeroPontosProxNivel
     */
    public int getNumeroPontosProxNivel() {
        return numeroPontosProxNivel;
    }

    /**
     * @param numeroPontosProxNivel the numeroPontosProxNivel to set
     */
    public void setNumeroPontosProxNivel(int totalAcertos) {
        this.numeroPontosProxNivel = 1000;
        int t=totalAcertos*100;
        numeroPontosProxNivel=numeroPontosProxNivel-t;
        
    }
}
