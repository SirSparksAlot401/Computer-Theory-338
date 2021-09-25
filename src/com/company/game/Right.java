package com.company.game;

class Right implements GameState {
    private GameLogic game;

    public Right(GameLogic g){
        game = g;
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving to stand.");
        game.setState(game.getStanding());
    }

    @Override
    public void moveRight() {
        System.out.println("Moving right.");
        game.setState(game.getRight());
    }

    @Override
    public void jump(){
        System.out.println("Jumping, now midair.");
        game.setState(game.getMidAir());
    }

    @Override
    public void fireBall(){
        System.out.println("Hit by fireball.");
        game.setState(game.getProne());
    }

    @Override
    public void gravity(){
        System.out.println("Remaining strong in the face of gravity, stay right.");
        game.setState(game.getRight());
    }
}
