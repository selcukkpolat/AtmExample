package com.example.selcu.atm;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AtmC {
    public void run(Balance balance){

        Login login =new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome XBank");
        System.out.println("*************");
        System.out.println("User Login");
        System.out.println("*************");
        int login_right=3;
        while (true){
            if(login.login(balance)){
                System.out.println("Entered");
                break;
            }
            else{
                System.out.println("No Entered");
                login_right--;
                System.out.println("Remaining Right of Entry"+login_right);
            }
            if(login_right==0){
                System.out.println("You are finished");
                return;
            }

        }
        System.out.println("**************");
        String operation1="1. Show Balance\n"
                +"2.Deposit \n"
                +"3.Money Pull\n"
                +"Exit:q";
        System.out.println(operation1);
        System.out.println("**************");
        while(true){
            System.out.println("Select the proses:");
            String proses=scanner.nextLine();
            if(proses.equals("q")){
                break;
            }
            else if(proses.equals("1")){
                System.out.println("Your Balance:"+balance.getMoney());
            }
            else if (proses.equals("2")){
                System.out.println("Requested Amount:");
                int count=scanner.nextInt();
                scanner.nextLine();
                balance.deposit(count);
                System.out.println("Suscessfully");
                System.out.println("***********");
            }
            else if (proses.equals("3")){
                System.out.println("Windrawal");
                int cout=scanner.nextInt();
                scanner.nextLine();
                balance.withDraw(cout);
                System.out.println("Suscessfully");
                System.out.println("************");
            }
            else
                System.out.println("Wrong!");

        }









    }
}
