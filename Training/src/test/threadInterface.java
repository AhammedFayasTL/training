package test;

class MyNewThread implements Runnable {

	public void run() {
		System.out.println("I am new Thread");

	}

}

public class threadInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method start");
		
		 MyNewThread obj=new MyNewThread();
		 Thread t=new Thread(obj);
		 // Thread t = new Thread(new MyNewThread());

		t.start();
		// t.run();//it runs thread in separate memory location
		// t.start(); //error
		System.out.println("Main Method Stop");

	}

}
