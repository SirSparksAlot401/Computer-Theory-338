package com.company.game;

//Driver method for the game DFA.
public class Driver {
    //Main function
    public static void main(String[] args){
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

    //The GameState interface.
    interface GameState{
        void moveLeft();
        void moveRight();
        void jump();
        void gravity();
        void fireBall();
    }

