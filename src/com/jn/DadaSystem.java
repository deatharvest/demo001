package com.jn;

import java.util.Scanner;

public class DadaSystem {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;//�⳵������
		int day;//����
		String str="";
		int allprice=0;
		int allboatload=0;
		int allmanned=0;
		Scanner reader=new Scanner(System.in);
		if(initial()==1){
		//if(true){
			Car[] c={new Auto("�µ�A4",500,4,0),new Auto("���Դ�6",400,4,0),
					new Pickup("Ƥ��ѩ6",450,4,2),new Auto("����",800,20,0),
					new Truck("�ɻ���",400,0,4),new Truck("��ά��",1000,0,20)};
			System.out.println("�����⳵�����ͼ���Ŀ��");
			System.out.println("���"+"	��������"+"	���"+"	����"+"	����");
			for(Car a:c){
				a.print();
			}
			System.out.println("��������Ҫ�⳵��������");

			num=reader.nextInt();

			System.out.println("��������Ҫ�⳵��������");

			day=reader.nextInt();
			for(int i=1;i<num+1;i++){
				System.out.println("�������"+i+"��������ţ�");
				
				int j = reader.nextInt();
				str=str+"  "+c[j-1].name;
				allprice=allprice+c[j-1].price;
				allboatload+=c[j-1].boatload;
				allmanned += c[j-1].manned;
			}
			allprice = allprice*day;
			System.out.println("�����˵���");
			System.out.println("***���ͣ�"+str);
			System.out.println("***���ػ�����"+allboatload);
			System.out.println("***���ؿ�����"+allmanned);
			System.out.println("***���ã�"+allprice+"Ԫ");
			System.out.println("***������"+ day);
			reader.close();
		}


	}
	public static int initial(){
		System.out.println("��ӭʹ��DADA�⳵ϵͳ��");
		System.out.println("���Ƿ���Ҫ�⳵��1�� 0��");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		return n;
	}
}
