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
public class BufferCircular {

    private int tamanhoBuffer;
    InformacaoDaMaquina[] buffer;
    private int ini = 0;
    private int fim = 0;
    private int nElementos = 0;

    BufferCircular(int tamanhoBuffer) {
        this.tamanhoBuffer = tamanhoBuffer;
        buffer = new InformacaoDaMaquina[tamanhoBuffer];
    }

    public void adicionar(InformacaoDaMaquina info) {
        buffer[fim] = info;
        if ((fim + 1) < tamanhoBuffer) {

            this.fim++;
        } else {
            this.fim = 0;
        }
    }

    public InformacaoDaMaquina remover() {
        boolean vazio = estaVazio();
        InformacaoDaMaquina info = null;
        if (!vazio) {
            info = buffer[ini];
            nElementos--;
            this.ini++;
        } else {
            System.err.println("O buffer está vazio, você não pode remover um elemento.");
        }
        return info;
    }

    public boolean estaVazio() {
        return ini == fim;
    }

    public int numeroDeElementos() {

        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] != null) {
                nElementos++;
            }
        }

        return nElementos;
    }

    public int tamanhoMaximo() {
        return buffer.length;
    }

}
