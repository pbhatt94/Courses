package com.somethingrandom.deadlock;

public class DeadlockRunner {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Started Main....\n");
		String lock1 = new String("Lock1");
		String lock2 = new String("Lock2");

		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (lock2) {
					System.out.println("Lock2 acquired by T1 \n");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (lock2) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (lock1) {
					System.out.println("Lock1 acquired by T2 \n");
				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Ended Main....\n");
	}
}
