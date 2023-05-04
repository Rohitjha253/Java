package ThreadDemo;

class Demo{
    public int initialval=0;
    public void increase(){
        initialval++;
    }
}

public class DemoThread {
    public static void main(String[] args) throws InterruptedException {
        Demo d=new Demo();
        Runnable ch1=()->{
            for(int i=0;i<15;i++){
                System.out.println(d.initialval);
                d.increase();
            }
        };

        Runnable ch2=()->{
            for(int i=0;i<15;i++){
                System.out.println(d.initialval);
                d.increase();
            }
        };

        Thread th1=new Thread(ch1);
        Thread th2=new Thread(ch2);
        th1.start();
        th2.start(); 
        th1.join();
        th2.join();

        System.out.println(d.initialval);
    }
}
