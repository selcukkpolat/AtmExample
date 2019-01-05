package com.example.selcu.atm;

public class Main {
    public static void main(String[] args) {

            AtmC atmC =new AtmC();
            Balance balance=new Balance("Selçuk Polat","122345",2333);
            atmC.run(balance);
            System.out.println("Atm is turn off");
    }
}
