/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogo;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ALAN e BRUNO
 */
public class Jogo { 
    
    private int dificuldade;
    
    public String setOperacao(){
        String operacao;
        Scanner scan=new Scanner(System.in);      
        System.out.println("------------------------");
        System.out.println("Escolha uma operacao: ");
        System.out.println("------------------------");
        System.out.println("+ : Adicao");
        System.out.println("- : Subtracao");
        System.out.println("* : Multiplicacao");
        System.out.println("/ : Divisao");
        System.out.println("------------------------");
        System.out.print("Operacao: ");
        operacao=scan.next();
        return operacao;
    }
    
    public void setDificuldade(){
        
        Scanner leia = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Escolha uma dificuldade: ");
        System.out.println("------------------------");
        System.out.println("1 : Nivel 1");
        System.out.println("2 : Nivel 2");
        System.out.println("3 : Nivel 3");
        System.out.println("4 : Nivel 4");
        System.out.println("------------------------");
        System.out.print("Dificuldade: ");
        dificuldade=leia.nextInt();
    }    
    
    public int getDificuldade(){
        return dificuldade; 
    }
    
    public int setResposta(){
        int resposta;
        System.out.println("");
        Scanner entrada=new Scanner(System.in);
        resposta=entrada.nextInt();
        return resposta;
    }
    
    public static void embaralhar(int[] opcao){
        Random gera = new Random();
        for(int i = 0; i < opcao.length; i++){
          int pos = gera.nextInt(opcao.length);
          int temp = opcao[i];
          opcao[i] = opcao[pos];
          opcao[pos] = temp;
        }
        // exibe o array já embaralhado
        for(int i = 0; i < opcao.length; i++){
          System.out.println(opcao[i]);
        } 
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalAcertos=0;
        int totalErros=0;
        int numPergunta=1;
        int vida=3;
        
        // TODO code application logic here  
        String escolha;
        int resposta;
        System.out.println("-----------------------------------");
        System.out.println("Bem-vindo ao Matematica Divertida! ");
        System.out.println("-----------------------------------");
        Jogo user=new Jogo();
        Operacao oper=new Operacao();
        Historico historico=new Historico();
        int[] opcao = new int[4];
        escolha=user.setOperacao(); 
        user.setDificuldade();        
        //oper.Adicao();        
        //user.setResposta();
        /*-----------------------------------------*/
            switch (escolha){
                /*-----------------------------------------*/
                case "+":
                    for (int i=0;i<5 && vida>0;i++){
                        System.out.println("Pergunta " + numPergunta);
                        resposta = oper.Adicao();
                        System.out.println("");                    
                        // inicializa os elementos do array
                        opcao[0] = (resposta + ((int)(Math.random()*20+2)));
                        opcao[1] = (resposta + ((int)(Math.random()*30+1)));
                        opcao[2] = (resposta + ((int)(Math.random()*10)));
                        opcao[3] = resposta;
                        // embaralha o array
                         embaralhar(opcao);
                         if ( resposta == user.setResposta()){
                            System.out.println("Correto");  
                            totalAcertos++;
                        }else{
                            System.out.println("Errado");
                            System.out.println("Resposta:" + resposta);
                            totalErros++;
                            vida--;
                        }
                        numPergunta++;
                    }//for
                    historico.setPercAcertos(totalAcertos);
                    historico.setQtdErros(totalErros);
                    historico.setTotalPontos(totalAcertos);
                    historico.setNumeroPontosProxNivel(totalAcertos);
                    historico.setNivelAtual(user.getDificuldade());
                    System.out.println(totalAcertos);
                    System.out.println("-----------Pontuacao--------------------------");
                    System.out.println("Nivel Atual: " + historico.getNivelAtual());
                    System.out.println("Acertos: " + historico.getPerctAcertos());
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("Vidas: " + vida);
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/
                    case "-":
                        for (int i=0;i<5 && vida>0;i++){
                            System.out.println("Pergunta " + numPergunta);    
                            resposta = oper.Subtracao();
                            System.out.println("");                    
                            // inicializa os elementos do array
                            opcao[0] = (resposta + ((int)(Math.random()*20+2)));
                            opcao[1] = (resposta + ((int)(Math.random()*30+1)));
                            opcao[2] = (resposta + ((int)(Math.random()*10)));
                            opcao[3] = resposta;
                            // embaralha o array
                             embaralhar(opcao);
                            if ( resposta == user.setResposta()){
                                System.out.println("Correto");  
                                 totalAcertos++;
                            }else{
                                    System.out.println("Errado");
                                    System.out.println("Resposta:" + resposta);
                                    totalErros++;
                                    vida--;
                                    } 
                                numPergunta++;
                     }//for
                    historico.setPercAcertos(totalAcertos);
                    historico.setQtdErros(totalErros);
                    historico.setTotalPontos(totalAcertos);
                    historico.setNumeroPontosProxNivel(totalAcertos);
                    historico.setNivelAtual(user.getDificuldade());
                    System.out.println(totalAcertos);
                    System.out.println("-----------Pontuacao--------------------------");
                    System.out.println("Nivel Atual: " + historico.getNivelAtual());
                    System.out.println("Acertos: " + historico.getPerctAcertos());
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("Vidas: " + vida);
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/
                    case "*":
                        for (int i=0;i<5 && vida>0;i++){
                            resposta = oper.Multiplicacao();
                            System.out.println("");                    
                            // inicializa os elementos do array
                            opcao[0] = (resposta + ((int)(Math.random()*20+2)));
                            opcao[1] = (resposta + ((int)(Math.random()*30+1)));
                            opcao[2] = (resposta + ((int)(Math.random()*10)));
                            opcao[3] = resposta;
                            // embaralha o array
                             embaralhar(opcao);
                            if ( resposta == user.setResposta()){
                                System.out.println("Correto"); 
                                totalAcertos++;
                            }else{
                                    System.out.println("Errado");
                                    System.out.println("Resposta:" + resposta);
                                    totalErros++;
                                    vida--;
                                    } 
                            numPergunta++;
                        }//for
                    historico.setPercAcertos(totalAcertos);
                    historico.setQtdErros(totalErros);
                    historico.setTotalPontos(totalAcertos);
                    historico.setNumeroPontosProxNivel(totalAcertos);
                    historico.setNivelAtual(user.getDificuldade());
                    System.out.println(totalAcertos);
                    System.out.println("-----------Pontuacao--------------------------");
                    System.out.println("Nivel Atual: " + historico.getNivelAtual());
                    System.out.println("Acertos: " + historico.getPerctAcertos());
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("Vidas: " + vida);
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/  
                    case "/":
                        for (int i=0;i<5 && vida>0;i++){
                            resposta = oper.Divisao();
                            System.out.println("");                    
                            // inicializa os elementos do array
                            opcao[0] = (resposta + ((int)(Math.random()*20+2)));
                            opcao[1] = (resposta + ((int)(Math.random()*30+1)));
                            opcao[2] = (resposta + ((int)(Math.random()*10)));
                            opcao[3] = resposta;
                            // embaralha o array
                             embaralhar(opcao);
                            if ( resposta == user.setResposta()){
                                System.out.println("Correto");
                                totalAcertos++;
                            }else{
                                    System.out.println("Errado");
                                    System.out.println("Resposta:" + resposta);
                                    totalErros++;
                                    vida--;
                                    }
                         numPergunta++;
                        }//for
                    historico.setPercAcertos(totalAcertos);
                    historico.setQtdErros(totalErros);
                    historico.setTotalPontos(totalAcertos);
                    historico.setNumeroPontosProxNivel(totalAcertos);
                    historico.setNivelAtual(user.getDificuldade());
                    System.out.println(totalAcertos);
                    System.out.println("-----------Pontuacao--------------------------");
                    System.out.println("Nivel Atual: " + historico.getNivelAtual());
                    System.out.println("Acertos: " + historico.getPerctAcertos());
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("Vidas: " + vida);
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/    
                    default:
                    System.out.println("Operacao Inválida!");
                    
            }//switch              
        }//main    
}//classe jogo
