/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5lavyk;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args){
        BufferCircular a = new BufferCircular(5);
        InformacaoDaMaquina b = new InformacaoDaMaquina();
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        a.adicionar(b);
        
        a.remover();
        System.out.println(a.numeroDeElementos());
    }
}
