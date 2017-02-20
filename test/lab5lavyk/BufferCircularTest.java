/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5lavyk;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lavyk
 */
public class BufferCircularTest {

    @Test
    public void testAdicionar() {
        System.out.println("Teste método adicionar.");
        InformacaoDaMaquina info = new InformacaoDaMaquina();
        BufferCircular instance = new BufferCircular(4);

        instance.adicionar(info);

        boolean resultadoEsperado = false;
        boolean resultadoFinal = instance.estaVazio();
        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    public void testRemover() {
        System.out.println("Teste método remover");
        BufferCircular instance = new BufferCircular(4);
        InformacaoDaMaquina info = new InformacaoDaMaquina();

        instance.adicionar(info);

        InformacaoDaMaquina resultadoEsperado = info;
        InformacaoDaMaquina resultadoFinal = instance.remover();
        assertEquals(resultadoEsperado, resultadoFinal);

        int resultadoEsperado2 = 0;
        int resultadoFinal2 = instance.numeroDeElementos();
        assertEquals(resultadoEsperado2, resultadoFinal2);
    }

    @Test
    public void testEstaVazio() {
        System.out.println("Teste método estaVazio");
        BufferCircular instance = new BufferCircular(4);
        boolean resultadoEsperado = true;
        boolean resultadoFinal = instance.estaVazio();
        assertEquals(resultadoEsperado, resultadoFinal);
    }

    @Test
    public void testNumeroDeElementos() {
        System.out.println("Teste método numeroDeElementos");
        BufferCircular instance = new BufferCircular(4);
        int resultadoEsperado = 0;
        int result = instance.numeroDeElementos();
        assertEquals(resultadoEsperado, result);
    }

    /**
     * Test of tamanhoMaximo method, of class BufferCircular.
     */
    @Test
    public void testTamanhoMaximo() {
        System.out.println("Teste método tamanhoMaximo");
        BufferCircular instance = new BufferCircular(500000);
        int resultadoEsperado = 500000;
        int resultadoFinal = instance.tamanhoMaximo();
        assertEquals(resultadoEsperado, resultadoFinal);

    }

}
