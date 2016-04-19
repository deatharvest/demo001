package com.jn;

public abstract class Car {
	public String name;
	public int price;
	public int boatload;
	public int manned;
	protected static int allnumber=0;
	protected int number;
	public void print(){
		System.out.println(this);
	}
	public String toString() {
		return  number + ".	" + name + " 	" + price + "	" + boatload
				+ "	" + manned;
	} 
	public Car(){
		allnumber++;
	}
//	public abstract void setmessage(String name,int price,int boatload,int manned);

}
