package test;

class MyThread extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
		System.out.println(this.getId() +" "+ "My Thread");
		try {
			Thread.sleep(3000);// sleep is static method 
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		// System.out.println("My thread");
	}
}

public class threadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread t=new Thread(new MyNewThread()) ;
		MyThread th = new MyThread();
		th.setPriority(4);
		th.start();

		System.out.println("Main Method");
	}

}
