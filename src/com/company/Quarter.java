package com.company;

class Quarter implements State{
    private GumballMachine gumballMachine;

    public Quarter(GumballMachine m){
        gumballMachine = m;
    }

    @Override
    public void quarterInserted() {
        System.out.println("There is already a quarter inserted.");
        gumballMachine.setState(gumballMachine.getQuarter());
    }

    @Override
    public void crank(){
        System.out.println("Here is a gumball, enjoy!");
        gumballMachine.setState(gumballMachine.getNoQuarter());}

    @Override
    public void removeQuarter() {
        System.out.println("Here is your quarter back.");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

}
