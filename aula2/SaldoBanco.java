package aula2;

import java.util.Random;

public class SaldoBanco {
    public static void main(String[] args) {
        /*
        Monte um sistema de repetição:
        A partir de um saldo ele tenha uma variável ou técnica que identifique se a movimentação creditou ou debitou.
        Ao final ele mostra 12 movimentos e como ficou o saldo final.
         */
        double saldoInicial = 10000;
        int contador = 0;
        Random aleatorio = new Random();
        double credito = 0;
        double debito = 0;

        while(contador <= 12){
            contador++;
            double i = aleatorio.nextInt(-2500, 2500);
            System.out.println("-----------------------------------------------------------------------");
            saldoInicial += i;
            if(i < 0){
                System.out.println("Foi retirado " + i + " a sua conta. Seu saldo atual e igual a " + saldoInicial);
                debito += i;
            }else{
                System.out.println("Foi adicionado " + i + " da sua conta. Seu saldo atual e igual a " + saldoInicial);
                credito += i;
            }
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Credito = " + credito);
        System.out.println("Debito = " + debito);
        System.out.println("Seu saldo final e = " + saldoInicial);
    }
}