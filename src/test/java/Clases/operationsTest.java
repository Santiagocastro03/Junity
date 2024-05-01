/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class operationsTest {
    
    public operationsTest() {
    }

    @org.junit.Test
    public void testGetNumero1() {
        System.out.println("getNumero1");
        operations instance = new operations();
        int expResult = 0;
        int result = instance.getNumero1();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetNumero1() {
        System.out.println("setNumero1");
        int numero1 = 0;
        operations instance = new operations();
        instance.setNumero1(numero1);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetNumero2() {
        System.out.println("getNumero2");
        operations instance = new operations();
        int expResult = 0;
        int result = instance.getNumero2();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetNumero2() {
        System.out.println("setNumero2");
        int numero2 = 0;
        operations instance = new operations();
        instance.setNumero2(numero2);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        operations instance = new operations();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSumar() {
        System.out.println("sumar");
        int n1 = 0;
        int n2 = 0;
        operations instance = new operations();
        int expResult = 0;
        int result = instance.sumar(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testRestar() {
        System.out.println("restar");
        int n1 = 0;
        int n2 = 0;
        operations instance = new operations();
        int expResult = 0;
        int result = instance.restar(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 0;
        int n2 = 0;
        operations instance = new operations();
        int expResult = 0;
        int result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testDividir() {
        System.out.println("dividir");
        int n1 = 0;
        int n2 = 0;
        operations instance = new operations();
        int expResult = 0;
        int result = instance.dividir(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testPorcentaje() {
        System.out.println("porcentaje");
        int n1 = 0;
        int n2 = 0;
        operations instance = new operations();
        int expResult = 0;
        int result = instance.porcentaje(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testPotencia() {
        System.out.println("potencia");
        int n1 = 0;
        int n2 = 0;
        operations instance = new operations();
        int expResult = 0;
        int result = instance.potencia(n1, n2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
