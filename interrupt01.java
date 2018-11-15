package high;

public class interrupt01 extends Thread {
	public void run() {
		System.out.println("started running");
		System.out.println(Thread.interrupted());

		try {
			Thread.sleep(10*1000);
			System.out.println("Finished sleeping!");
		} catch (InterruptedException e) {
			System.out.println("I am interrupted!");
			System.out.println("1 t1.interrupted() 1"+Thread.interrupted());
			interrupt();
			System.out.println("2 t1.interrupted() 2"+Thread.interrupted());
			System.out.println("3 t1.interrupted() 3"+Thread.interrupted());
			System.out.println("4 t1.interrupted() 4"+Thread.interrupted());
			interrupt();
			System.out.println("5 t1.interrupted() 5"+Thread.interrupted());
			System.out.println("6 t1.interrupted() 6"+Thread.interrupted());
			System.out.println("7 t1.interrupted() 7"+Thread.interrupted());
//			System.exit(0);
		}
		System.out.println("I AM FINISHED");
	}

	public static void main(String args[]) {
		interrupt01 t1 = new interrupt01();
		System.out.println("Before t1.interrupted() "+t1.isInterrupted());
		t1.start();
		System.out.println("t1.interrupted() "+Thread.interrupted());
		System.out.println("after run t1.interrupted() "+t1.isInterrupted());
		try {
			System.out.println("Begin ");
			Thread.sleep(3000);
			t1.interrupt();
		} catch (Exception e) {
			//System.out.println("in exception: t1.interrupted() "+t1.isInterrupted());
//			System.out.println("Exception handled " + e);
		}
	}
}
