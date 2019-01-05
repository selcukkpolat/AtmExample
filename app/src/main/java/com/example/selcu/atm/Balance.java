package com.example.selcu.atm;

import java.sql.SQLOutput;

public class Balance {
    private String userName;
    private String password;
    private int money;

    public Balance(String userName, String password, int money) {
        this.userName = userName;
        this.password = password;
        this.money = money;
    }

    public void deposit(int count){
        this.money+=count;
        System.out.println("New Balance:"+money);
    }
    public void withDraw(int count){
        if(count>1500){
            System.out.println("Daily limit:1500");
        }
        if(count>money)
        {
            System.out.println("Insufficient Balance");
            System.out.println("Your Balance"+money);
        }
        else{
            money-=count;
            System.out.println("New Balance:"+money);
        }
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
