package com.coderbd.ex6;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

/**
 *
 * @author Rajaul Islam
 */
// The run() method in this thread should be called only when 
// four players are ready to start the game 
class MixedDoubleTennisGame extends Thread {

    @Override
    public void run() {
        System.out.println("All four players ready, game starts \n Love all...");
    }
}

// This thread simulates arrival of a player. 
// Once a player arrives, he/she should wait for other players to arrive 
class Player extends Thread {

    CyclicBarrier waitPoint;

    public Player(CyclicBarrier barrier, String name) {
        this.setName(name);
        waitPoint = barrier;
        this.start();
    }

    @Override
    public void run() {
        System.out.println("Player " + getName() + " is ready ");
        try {
            waitPoint.await(); // await for all four players to arrive 
        } catch (BrokenBarrierException | InterruptedException exception) {
            System.out.println("An exception occurred while waiting... "
                    + exception);
        }
    }
}

// Creates a CyclicBarrier object by passing the number of threads and the thread to run
// when all the threads reach the barrier 
class CyclicBarrierTest {

    public static void main(String[] args) {
        // a mixed-double tennis game requires four players; 
        // so wait for four players 
        // (i.e., four threads) to join to start the game
        System.out.println("Reserving tennis court \n"
                + "As soon as four players arrive, game will start");
        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(barrier, "Rashidul");
        new Player(barrier, "Zunaid");
        new Player(barrier, "Emon");
        new Player(barrier, "Monna");
    }
}
