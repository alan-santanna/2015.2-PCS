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
public class Operacao {
    private String nome;
    private char sinal;

    public Operacao() {
         
    }
    /*-----------------------------------------*/    
     public int Adicao(){
        int a,b,result;
        a= (int)(Math.random()*100);
        b= (int)(Math.random()*99);
        System.out.println(a + " + " + b);        
        result=a+b;  
        return result;
    }
     /*-----------------------------------------*/
     public int Subtracao(){
        int a,b,result;
        a= (int)(Math.random()*100);
        b= (int)(Math.random()*99);
        System.out.println(a + " - " + b);        
        result=a-b;  
        return result;
    }
     /*-----------------------------------------*/
     public int Multiplicacao(){
        int a,b,result;
        a= (int)(Math.random()*100);
        b= (int)(Math.random()*99);
        System.out.println(a + " * " + b);        
        result=a*b;  
        return result;
    }
     /*-----------------------------------------*/
     public int Divisao(){
        int a,b,result;
        a= (int)(Math.random()*100);
        b= (int)(Math.random()*99);
        if ( a > b ){
            System.out.println(a + " / " + b);  
            result=a/b;  
        }else{
            System.out.println(b + " / " + a);  
            result=b/a;
        }
        return result;
    }
     /*-----------------------------------------*/    
}
