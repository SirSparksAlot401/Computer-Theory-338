package com.company.game;

public class Driver {

    public static void driver(String args[]){
        System.out.println("test");

        }
    }



    interface State{
        public void moveLeft();
        public void moveRight();
        public void jump();
        public void gravity();
        public void hitGround();
    }

