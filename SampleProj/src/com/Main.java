package com;
class myThread2 extends Thread {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{
                Thread.currentThread().join();
            }
             catch (Exception e) {
                //TODO: handle exception
            }
            System.out.println("child");
        }
    }
}
public class Main
{
    public static void main(String [] args) throws InterruptedException
    {
        myThread2 t = new myThread2();
        t.start();
        t.join();
        System.out.println("parent");
    }
}