package example;

import java.util.Scanner;

public class Encapsulation {
    private int balance;

    public Encapsulation(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance){
        balance = newBalance;
        System.out.println(balance);
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
        }
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();

        Encapsulation en = new Encapsulation(balance);
        //en.setBalance(2500);
        en.deposit(amount);

    }
}
