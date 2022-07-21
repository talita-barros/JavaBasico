package Aula7;

import java.util.Scanner;

public class executora  extends Equacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Delta delta = new Delta();
        EqXn XnXp = new EqXn();

        System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");
        System.out.println("Digite um valor para A");
        delta.setA(entrada.nextDouble());
        
        System.out.println("Digite um valor para B");
        delta.setB(entrada.nextDouble());
        
        System.out.println("Digite um valor para C");
        delta.setC(entrada.nextDouble());

        delta.calculaDelta();
        System.out.println("O resultado do delta é:" + delta.getDelta());
        if (delta.getDelta() < 0) {
            System.out.println("A equação não possui uma raiz real");
        } else{
            System.out.println("xn:" + XnXp.calculaXn(delta));
            System.out.println("xp:" + XnXp.calculaXp(delta));
        }
        
    }

    
}
