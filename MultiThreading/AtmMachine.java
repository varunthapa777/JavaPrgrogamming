package MultiThreading;

class ATM{


    synchronized public void checkBalance(String name){
        System.out.println(name + " Checking its Balance...\n");
        try{Thread.sleep(100);}catch(InterruptedException e){}
    }
    
    synchronized public void withdraw(String name, double amount){
        System.out.println(name + " Withdraws "+ amount + "...\n");
        try{Thread.sleep(100);}catch(InterruptedException e){}
    }

}


class Customer extends Thread{

    ATM atm;
    String name;
    double amount;
    
    public Customer(ATM atm, String name, double amount )
    {
     this.atm = atm;
     this.name = name;
     this.amount = amount;    
        }
    private void useATM(){
        
        atm.checkBalance(name);
        atm.withdraw(name, amount);

    }

    public void run(){
        useATM();
    }
}
public class AtmMachine {

  public static void main(String[] args) {
    
    ATM atm1 = new ATM();
    Customer c1 = new Customer(atm1,"Varun",100000);
    Customer c2 = new Customer(atm1,"Sachin",20000);
    Customer c3 = new Customer(atm1,"Kartik",30000);

    c1.start();
    c2.start();
    c3.start();
  }  
}