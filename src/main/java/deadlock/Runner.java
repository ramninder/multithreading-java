package deadlock;

public class Runner {

    private Account acc1 = new Account();
    private Account acc2 = new Account();

    public void firstThread() throws  InterruptedException{

    }

    public void secondThread() throws  InterruptedException{

    }

    public void finished(){
        System.out.println("Account 1 balance " + acc1.getBalance());
        System.out.println("Account 2 balance " + acc2.getBalance());
        System.out.println("Total balance " + (acc1.getBalance() + acc2.getBalance()));
    }
}
