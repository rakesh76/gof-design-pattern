package com.gof.design.pattern.creational.singleton;

public enum SingletonEnum  {
	INSTANCE;

	public void doStuff(){
		System.out.println("Do Some Stuff");
	}
	
	public static void main (String args[]){
		
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		System.out.println(instance1.hashCode());
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		System.out.println(instance2.hashCode());
	}
}