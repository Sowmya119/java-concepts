// for parallel execution, only a suggestion can be given to the OS by defining priority (or) giving a sleep time in between

class A extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(5);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class B extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(5);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Threads {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
                Thread.sleep(10);
            }
            catch(InterruptedException e) {
                System.out.println(3);
            }
        obj2.start();
        try {
                Thread.sleep(3);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
    }    
}


/* 
class A extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("hi");
        }
    }
}
class B extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("hello");
        }
    }
}
public class Threads {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }    
}
*/

/*
THREAD STATES

New ---start()---> Runnable ---run()----> Running ---sleep() or wait()---> Waiting

Runnable ---run()---> Running ---sleep() or wait()---> Waiting ---notify()---> Runnable

Running ---stop()---> Dead

Running ---stop()---> Dead


 */