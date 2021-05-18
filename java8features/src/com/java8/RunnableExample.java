package com.java8;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				Integer sum = 0;
				for (int i = 0; i < 10; i++) {
					sum = sum + i;
				}
				System.out.println(sum);
			}
		};
		new Thread(r).start();

		Runnable runnable = () -> {
			Integer sum = 0;
			for (int i = 0; i < 9; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		};
		new Thread(runnable).start();
		new Thread(() -> {
			Integer sum = 0;
			for (int i = 0; i < 15; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}).start();
	}

}
