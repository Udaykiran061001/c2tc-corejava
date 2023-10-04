package com.cg.multithreadingselfstudy2;

public class ThreadPrioritiesDemo {

	public static void main(String[] args) {

//		Ready Queue: T1 T2 T3 T4 T5
		MyThr t1 = new MyThr("Uday1");
		MyThr t2 = new MyThr("Uday2");
		MyThr t3 = new MyThr("Uday3");
		MyThr t4 = new MyThr("Uday4");
		MyThr t5 = new MyThr("Uday5 (Most Important)");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
