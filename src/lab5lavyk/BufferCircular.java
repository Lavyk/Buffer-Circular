/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5lavyk;

/**
 *
 * @author Lavyk
 */


// https://www.embarcados.com.br/desenvolvendo-um-rtos-buffer-circular/
public class BufferCircular {
    private int tamanhoBuffer;
    Integer[] buffer = new Integer[tamanhoBuffer];
    private int ini = 0;
    private int fim = 0;

    BufferCircular(int tamanhoBuffer){
        this.tamanhoBuffer = tamanhoBuffer;
    }
    
    public void adicionar(InformacaoDaMaquina info){
        //buffer[fim] = info;
        
        if ((fim+1) < tamanhoBuffer){
            this.fim++;
        } else {
            this.fim = 0;
        }
    }
    
    public InformacaoDaMaquina remover(){
        this.ini++;
    }

    public boolean estaVazio(){
       
        return boolean;
    }

    public int numeroDeElementos(){
        return int;
    }

    public int tamanhoMaximo(){
        return int;
    }
    
}
