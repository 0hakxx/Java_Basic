package oop1;

public class Account {
    int balance;

    public int desposit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    public int withdraw(int amount){
        if(this.balance < amount){
            System.out.println("출금 잔액이 부족합니다.");
            return 0;
        }
        else {
            this.balance -= amount;
            return this.balance;
        }
    }
}
