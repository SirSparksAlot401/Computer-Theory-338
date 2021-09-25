package com.company.game;

class AirBorne implements GameState {
    private GameLogic game;

    public AirBorne(GameLogic g){
        game = g;
    }

    @Override
    public void moveLeft() {
        System.out.println("Remaining airborne.");
        game.setState(game.getMidAir());
    }

    @Override
    public void moveRight() {
        System.out.println("Remaining airborne.");
        game.setState(game.getMidAir());
    }

    @Override
    public void jump(){
        System.out.println("Remaining airborne.");
        game.setState(game.getMidAir());
    }

    @Override
    public void fireBall(){
        System.out.println("Dogged fireball, remaining airborne.");
        game.setState(game.getMidAir());
    }

    @Override
    public void gravity(){
        System.out.println("Returning to ground.");
        game.setState(game.getStanding());
    }
}
