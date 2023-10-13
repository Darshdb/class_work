//Q.2)Write a Java program to create multiple thread in Java.Apply thread properties too.(priority,name


class MyThread extends Thread {							//thread class is created
    public MyThread(String name, int priority) {					//parameterize constructor initialize for variable declaration
        super(name);
        setPriority(priority);
    }

    public void run() {										//run method created for run the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " running: " + i);
            try {
                Thread.sleep(1000);								//using sleep method thread sleep automatically 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PriorityThread1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1", Thread.MIN_PRIORITY);			//value asign to class constructor and set priorities
        MyThread thread2 = new MyThread("Thread 2", Thread.NORM_PRIORITY);
        MyThread thread3 = new MyThread("Thread 3", Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();														//using thread class object run method is called
    }
}
