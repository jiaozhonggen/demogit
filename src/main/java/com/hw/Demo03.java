package com.hw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo03 implements Callable<Person> {

    public Person call() throws Exception {
        int sum = 0;
        for(int i=0;i<10;i++) {
            if(i%2==0) {
                System.out.println(i);
                sum+=i;
            }
        }
        Person person = new Person();
        person.setId(sum);
        return person;
    }

    public static void main(String[] args) {
        Demo03 callable = new Demo03();
        FutureTask<Person> task = new FutureTask<Person>(callable);
        new Thread(task).start();//	启动线程
        try {
            //get()方法返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
            Person person = task.get();
            System.out.println(person);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}
