package com.company;

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.quarterInserted();
        gumballMachine.quarterUsedToPay();
        gumballMachine.gumballDelivered();
    }
}



interface State{
    public void quarterInserted();
    public void quarterUsedToPay();
    public void gumballDelivered();
}

