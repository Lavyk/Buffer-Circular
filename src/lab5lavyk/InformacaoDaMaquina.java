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

    private Random random = new Random();
    private int numRandom = random.nextInt(100);    
    
    int usoRAM = numRandom;
    int usoHD = numRandom;
    int usoCPU = numRandom;
    double clockCPU = random.nextDouble()*3;
    
    /* --------------------------------------------------------------
    usoRAM : int (valor de 0 a 100 indicando a porcentagem de uso)
    usoHD: int (valor de 0 a 100 indicando a porcentagem de uso)
    usoCPU : int (valor de 0 a 100 indicando a porcentagem de uso)
    clockCPU: double (nível do clock da CPU)
    ----------------------------------------------------------------*/
}
