package com.wajahat.learn.java8.unit2;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println(i);
			System.out.println(this);
		});
	}
	
	@Override
	public String toString() {
		return "This is the main class";
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i);
				System.out.println(this); // reference to anonymous inner class
			}
			
			@Override
			public String toString() {
				return "This is the inner class of process";
			}
		});
		
		thisReferenceExample.doProcess(10, i -> {
			System.out.println(i);
			//System.out.println(this); // cannot use in static 
		});
		
		thisReferenceExample.execute();
	}

}
