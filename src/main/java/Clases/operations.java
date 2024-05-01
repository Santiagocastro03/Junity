package Clases;

import javax.swing.JOptionPane;

public class operations {
    private int numero1, numero2;

    public operations(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public operations() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "operations{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    public int sumar(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n1 + n2;
    }
    public int restar(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n1 - n2;
    }
    public int multiplicar(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        return n1 * n2;
    }
    public int dividir(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        if(n2 == 0){
            System.out.println("Error sintaxis.");
            JOptionPane.showMessageDialog(null, "Error divisón entre 0");
            return 0;
        }
        return n1 / n2;
    }
    
    public int porcentaje(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        try {
            return n1 % n2;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public int potencia(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
        try {
          return (int) Math.pow(n1, n2);  
        } catch (Exception e) {
            return 0;
        }
        
    }
}
