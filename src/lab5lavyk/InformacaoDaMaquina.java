/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5lavyk;

import java.util.Random;


/**
 *
 * @author Lavyk
 */
public class InformacaoDaMaquina {

    Random random = new Random();
    int numRandom = random.nextInt(100);

    public int usoRAM() {
        
        return numRandom;
    }

    public int usoHD() {
        return numRandom;
    }

    public int usoCPU() {
        return numRandom;
    }

    public double clockCPU() {
        return Math.random();
    }
    
    /* --------------------------------------------------------------
    usoRAM : int (valor de 0 a 100 indicando a porcentagem de uso)
    usoHD: int (valor de 0 a 100 indicando a porcentagem de uso)
    usoCPU : int (valor de 0 a 100 indicando a porcentagem de uso)
    clockCPU: double (nível do clock da CPU)
    ----------------------------------------------------------------*/
}
