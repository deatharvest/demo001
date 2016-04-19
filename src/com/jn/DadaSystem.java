package com.jn;

import java.util.Scanner;

public class DadaSystem {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;//租车的数量
		int day;//天数
		String str="";
		int allprice=0;
		int allboatload=0;
		int allmanned=0;
		Scanner reader=new Scanner(System.in);
		if(initial()==1){
		//if(true){
			Car[] c={new Auto("奥迪A4",500,4,0),new Auto("马自达6",400,4,0),
					new Pickup("皮卡雪6",450,4,2),new Auto("金龙",800,20,0),
					new Truck("松花江",400,0,4),new Truck("依维柯",1000,0,20)};
			System.out.println("您可租车的类型及价目表");
			System.out.println("序号"+"	汽车名称"+"	租金"+"	容量"+"	人数");
			for(Car a:c){
				a.print();
			}
			System.out.println("请输入您要租车的数量：");

			num=reader.nextInt();

			System.out.println("请输入您要租车的天数：");

			day=reader.nextInt();
			for(int i=1;i<num+1;i++){
				System.out.println("请输入第"+i+"辆车的序号：");
				
				int j = reader.nextInt();
				str=str+"  "+c[j-1].name;
				allprice=allprice+c[j-1].price;
				allboatload+=c[j-1].boatload;
				allmanned += c[j-1].manned;
			}
			allprice = allprice*day;
			System.out.println("您的账单：");
			System.out.println("***车型："+str);
			System.out.println("***总载货量："+allboatload);
			System.out.println("***总载客量："+allmanned);
			System.out.println("***费用："+allprice+"元");
			System.out.println("***天数："+ day);
			reader.close();
		}


	}
	public static int initial(){
		System.out.println("欢迎使用DADA租车系统：");
		System.out.println("您是否需要租车：1是 0否");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		return n;
	}
}
