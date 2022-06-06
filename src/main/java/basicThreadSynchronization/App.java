package basicThreadSynchronization;

import java.util.Scanner;

class Processor extends Thread{

    private volatile boolean runner  = true;
    public void run(){
        while(runner){
            System.out.println("Hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public  void shutDown(){
        runner = false;
    }

}

public class App {

    public static void main(String[] args) {

        Processor process1 = new Processor();
        process1.start();

        System.out.println("press return to stop");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        process1.shutDown();
    }
}
