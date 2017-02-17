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
    InformacaoDaMaquina[] buffer;
    private int ini = 0;
    private int fim = 0;

    BufferCircular(int tamanhoBuffer){
        this.tamanhoBuffer = tamanhoBuffer;
        buffer = new InformacaoDaMaquina[tamanhoBuffer];
    }
    
    public void adicionar(InformacaoDaMaquina info){
        buffer[fim] = info;
        if ((fim+1) < tamanhoBuffer){
         
            this.fim++;
        } else {
            this.fim = 0;
        }
    }
    
    public InformacaoDaMaquina remover(){
        boolean vazio = estaVazio();
        InformacaoDaMaquina  info = buffer[ini];
        if(vazio){
            this.ini++;
        }
        return info;
    }

    public boolean estaVazio(){
        return ini == fim;
    }

    /*    public int numeroDeElementos(){
    
    return int;
    }*/

    public int tamanhoMaximo(){
        return buffer.length;
    }
    
}
