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
 * @author ALAN
 */
public class Jogo { 
    
    private int dificuldade;
    
    public String setOperacao(){
        String oper;
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
        oper=scan.next(); 
        return oper;
    }
    
    public void setDificuldade(){
        
        Scanner scan=new Scanner(System.in);      
        System.out.println("------------------------");
        System.out.println("Escolha uma dificuldade: ");
        System.out.println("------------------------");
        System.out.println("1 : Nivel 1");
        System.out.println("2 : Nivel 2");
        System.out.println("3 : Nivel 3");
        System.out.println("4 : Nivel 4");
        System.out.println("------------------------");
        System.out.print("Dificuldade: ");
        dificuldade=scan.nextInt();               
    }    
    
    public int getDificuldade(){
        return dificuldade; 
    }
    
    public int setResposta(){
        int resp;
        System.out.println("");
        Scanner entrada=new Scanner(System.in);
        resp=entrada.nextInt();  
        return resp;
    }
    
    public static void embaralhar(int[] opcao){
        Random randon = new Random();
        for(int i = 0; i < opcao.length; i++){
          int pos = randon.nextInt(opcao.length);
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
        
        // TODO code application logic here  
        String escolha;
        int resp;
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
                    for (int i=0;i<5;i++){
                        System.out.println("Pergunta " + numPergunta);
                        resp = oper.Adicao();
                        System.out.println("");                    
                        // inicializa os elementos do array
                        opcao[0] = (resp + ((int)(Math.random()*20+2)));
                        opcao[1] = (resp + ((int)(Math.random()*30+1)));
                        opcao[2] = (resp + ((int)(Math.random()*10)));
                        opcao[3] = resp;                
                        // embaralha o array
                         embaralhar(opcao);
                         if ( resp == user.setResposta()){ 
                            System.out.println("Correto");  
                            totalAcertos++;
                        }else{
                                System.out.println("Errado");
                                System.out.println("Resposta:" + resp);
                                totalErros++;
                                
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
                    System.out.println("% Acertos: " + historico.getPerctAcertos());  
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/
                    case "-":
                        for (int i=0;i<5;i++){
                            System.out.println("Pergunta " + numPergunta);    
                            resp = oper.Subtracao();
                            System.out.println("");                    
                            // inicializa os elementos do array
                            opcao[0] = (resp + ((int)(Math.random()*20+2)));
                            opcao[1] = (resp + ((int)(Math.random()*30+1)));
                            opcao[2] = (resp + ((int)(Math.random()*10)));
                            opcao[3] = resp;                
                            // embaralha o array
                             embaralhar(opcao);
                            if ( resp == user.setResposta()){ 
                                System.out.println("Correto");  
                                 totalAcertos++;
                            }else{
                                    System.out.println("Errado");
                                    System.out.println("Resposta:" + resp);
                                    totalErros++;
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
                    System.out.println("% Acertos: " + historico.getPerctAcertos());  
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/
                    case "*":
                        for (int i=0;i<5;i++){
                            resp = oper.Multiplicacao();
                            System.out.println("");                    
                            // inicializa os elementos do array
                            opcao[0] = (resp + ((int)(Math.random()*20+2)));
                            opcao[1] = (resp + ((int)(Math.random()*30+1)));
                            opcao[2] = (resp + ((int)(Math.random()*10)));
                            opcao[3] = resp;                
                            // embaralha o array
                             embaralhar(opcao);
                            if ( resp == user.setResposta()){ 
                                System.out.println("Correto"); 
                                totalAcertos++;
                            }else{
                                    System.out.println("Errado");
                                    System.out.println("Resposta:" + resp);
                                    totalErros++;
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
                    System.out.println("% Acertos: " + historico.getPerctAcertos());  
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/  
                    case "/":
                        for (int i=0;i<5;i++){
                            resp = oper.Divisao();
                            System.out.println("");                    
                            // inicializa os elementos do array
                            opcao[0] = (resp + ((int)(Math.random()*20+2)));
                            opcao[1] = (resp + ((int)(Math.random()*30+1)));
                            opcao[2] = (resp + ((int)(Math.random()*10)));
                            opcao[3] = resp;                
                            // embaralha o array
                             embaralhar(opcao);
                            if ( resp == user.setResposta()){ 
                                System.out.println("Correto");
                                totalAcertos++;
                            }else{
                                    System.out.println("Errado");
                                    System.out.println("Resposta:" + resp);
                                    totalErros++;
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
                    System.out.println("% Acertos: " + historico.getPerctAcertos());  
                    System.out.println("Total de Pontos: " + historico.getTotalPontos());                    
                    System.out.println("Qtd Erros: " + historico.getQtdErros()); 
                    System.out.println("Proximo nivel: " + historico.getNumeroPontosProxNivel() + " pontos");
                    System.out.println("----------------------------------------------");
                    break;
                    /*-----------------------------------------*/    
                    default:
                    System.out.println("Operacao Inválida!");
                    
            }//switch              
        }//main    
}//classe jogo
