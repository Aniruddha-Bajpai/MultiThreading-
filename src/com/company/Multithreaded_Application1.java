package com.company;
class Mythread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Mythread "+i);
        }
        System.out.println(10/0);
    }
}
class test56
{
    public static void main(String[] args) {
        Mythread obj =new Mythread();
        Thread obj1 = new Mythread();
        obj.start();//to create multithreaded application it is necessary to invoke start method
//        It is not necessary to override run method
//        we can override start method but we lose the default behaviour of start method
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread"+1);
        }
        System.out.println(20/0);
    }
}

public class Multithreaded_Application1
{

}
