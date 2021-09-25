package com.company.game;

public class Driver {

    public static void driver(String args[]){
        GameLogic game = new GameLogic();
        game.right();
        game.left();
        game.jump();
        game.fireBall();
        game.gravity();

        }
    }



    interface GameState{
        public void moveLeft();
        public void moveRight();
        public void jump();
        public void gravity();
        public void fireBall();
    }

