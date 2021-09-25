package com.company.game;

public class Prone implements GameState {

    private GameLogic game;

    public Prone(GameLogic g){
        game = g;
    }

    @Override
    public void moveLeft() {
        System.out.println("Standing.");
        game.setState(game.getStanding());
    }

    @Override
    public void moveRight() {
        System.out.println("Standing.");
        game.setState(game.getStanding());
    }

    @Override
    public void jump(){
        System.out.println("Standing up.");
        game.setState(game.getStanding());
    }

    @Override
    public void fireBall(){
        System.out.println("Dogged fireball, remaining on ground.");
        game.setState(game.getProne());
    }

    @Override
    public void gravity(){
        System.out.println("Staying on ground.");
        game.setState(game.getProne());
    }
}
