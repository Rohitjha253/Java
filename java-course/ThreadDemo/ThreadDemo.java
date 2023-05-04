package ThreadDemo;

class childDemo implements Runnable{

    @Override
    public void run() {     
    }
    
}

class childDemo2 implements Runnable{
    public void run() {
        for (int i = 0; i<5; i++) {
            System.out.println("Child two show");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable ch1=()->{
            
                for (int i = 0; i <5; i++) {
                    System.out.println("Child one show");
                }
            
        };

        
        childDemo2 ch2=new childDemo2();

        Thread th1=new Thread(ch1);
        Thread th2=new Thread(ch2);
        th1.start();
        th2.start(); 

        

    }
}
