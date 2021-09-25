package com.company.game;

//Prone state
public class Prone implements GameState {
    private GameLogic game;

    //Setting up the GameLogic object.
    public Prone(GameLogic g){
        game = g;
    }

    //Moving left from prone.
    @Override
    public void moveLeft() {
        System.out.println("Standing.");
        game.setState(game.getStanding());
    }

    //Moving right from prone.
    @Override
    public void moveRight() {
        System.out.println("Standing.");
        game.setState(game.getStanding());
    }

    //Jumping from prone.
    @Override
    public void jump(){
        System.out.println("Standing up.");
        game.setState(game.getStanding());
    }

    //Handling the fireball game action while in prone state.
    @Override
    public void fireBall(){
        System.out.println("Dogged fireball, remaining on ground.");
        game.setState(game.getProne());
    }

    //Handling the gravity game action while in prone state.
    @Override
    public void gravity(){
        System.out.println("Staying on ground.");
        game.setState(game.getProne());
    }
}
