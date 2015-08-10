package oop_les6_hw;

public class Main {

	public static void main(String[] args) {
		Thread[] threadArray = new Thread[100];
		
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new Thread(new FactorialThread(i));
			threadArray[i].start();
		}
	}
}
