package com.rafael;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        boolean continua = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador a : ");
            String b = JOptionPane.showInputDialog("Numerador b : ");
            try{
                Double intA = Double.parseDouble(a);
                Double intB = Double.parseDouble(b);  
                Double resultado = dividir(intA , intB);  
                String resultadoFormatado = String.format("O resultado é %.2f", resultado);   
                     
                System.out.println("O resultado é " + resultado );
                JOptionPane.showMessageDialog(null, resultadoFormatado);
                continua = false;        
            }
            catch(NumberFormatException erro){
                erro.printStackTrace();
                // System.out.println("Digite um numero válido");
                JOptionPane.showMessageDialog(null, "Digite um numero válido, " + erro.getMessage());
            }
            catch(ArithmeticException erro){
                erro.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não é possivel a divisão por 0, " + erro.getMessage());
            }
        } while (continua);
            
            System.out.println("....pra ver");  
    }

    public static Double dividir(Double intA , Double intB ){
        return intA / intB; 
    };
}