package com.company.game;

class Stand implements GameState {
    private GameLogic game;

    public Stand(GameLogic g) {
        game = g;
    }
        @Override
        public void moveLeft() {
            System.out.println("Moving left.");
            game.setState(game.getLeft());
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
            System.out.println("Remaining strong in the face of gravity, stay standing.");
            game.setState(game.getStanding());
    }

}
