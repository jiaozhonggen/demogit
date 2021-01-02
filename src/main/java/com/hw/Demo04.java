package com.hw;

public class Demo04 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        //3、创建Thread类的子类对象
        Demo04 myThread = new Demo04();
        //4、调用start方法启动线程
        myThread.start();
    }
}
