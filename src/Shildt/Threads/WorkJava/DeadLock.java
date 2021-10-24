package Shildt.Threads.WorkJava;

//10-43
public class DeadLock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyThread_1 myThread_1 = new MyThread_1();
        MyThread_2 myThread_2 = new MyThread_2();
        myThread_1.resourceA = resourceA;
        myThread_2.resourceB = resourceB;
        myThread_1.start();
        myThread_2.start();


    }
}

class MyThread_1 extends Thread {
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}

class MyThread_2 extends Thread {
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}

class ResourceA {
    ResourceB resourceB;

    public synchronized int getI() {
        return resourceB.returnI();
    }

    public static int returnI() {
        return 1;
    }
}

class ResourceB {
    ResourceA resourceA;

    public synchronized int getI() {
        return resourceA.returnI();
    }

    public static int returnI() {
        return 2;
    }
}