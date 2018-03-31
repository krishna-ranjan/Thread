package com.vincii.thread;

import static com.vincii.thread.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_RED +"Hye from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_BLACK + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_GREEN + "Hello again from the main thread");
    }
}
