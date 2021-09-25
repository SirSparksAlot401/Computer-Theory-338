package com.company.game;

public class Driver {

    public static void main(String args[]){
        GameLogic game = new GameLogic();
        game.right();
        game.left();
        game.jump();
        game.fireBall();
        game.gravity();
        game.right();
        game.left();
        game.jump();
        game.right();
        game.left();
        game.jump();
        game.right();

        }
    }



    interface GameState{
        void moveLeft();
        void moveRight();
        void jump();
        void gravity();
        void fireBall();
    }

