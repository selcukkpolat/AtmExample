package com.example.selcu.atm;

import java.util.Scanner;

public class Login {
    public boolean login(Balance balance){
        Scanner scanner=new Scanner(System.in);
        String userName;
        String password;
        System.out.println("Username:");
        userName=scanner.nextLine();
        System.out.println("Password");
        password=scanner.nextLine();
        if (balance.getUserName().equals(userName) && balance.getPassword().equals(password))
        {
            return true;
        }
        else
            System.out.println("Username or Password Wrong!!");
            return false;

    }
}
