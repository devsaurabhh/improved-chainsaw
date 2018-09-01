package org.btm.reverse;
import java.util.Random;
import java.util.Scanner;
public class TickTac 
{
	static char a[][]=new char[3][3];
	static  int t;
	static void format()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				a[i][j]='-';
		}
	}
	public static void main(String[] args) 
	{
		format();
		int i=0;
		while(i<9)
		{
			if(i%2==0)
			{
				random();
				display();
				logic();
				if(t==1)
					return;
			}
			else
			{  
				tSetValues();
				display();
				logic();
				if(t==1)
					return;
			}
			i++;
		}
		System.out.println("DRAW");
	}
	private static void tSetValues() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("row? and col?");
		int i=sc.nextInt();
		int j=sc.nextInt();
		if(a[i][j]=='-')
		{
			a[i][j]='X';
		}
		else
		{
			System.out.println("choose next location");
			tSetValues();
		}		
	}
	private static void logic() 
	{
		     if((a[0][0]=='X'&& a[0][1]=='X' && a[0][2]=='X')|| 
				(a[1][0]=='X'&& a[1][1]=='X' && a[1][2]=='X')||
				(a[2][0]=='X'&& a[2][1]=='X' && a[2][2]=='X')||
				(a[0][0]=='X'&& a[1][0]=='X' && a[2][0]=='X')||
				(a[0][1]=='X'&& a[1][1]=='X' && a[2][1]=='X')||
				(a[0][2]=='X'&& a[1][2]=='X' && a[2][2]=='X')||
				(a[0][0]=='X'&& a[1][1]=='X' && a[2][2]=='X')||
				(a[0][2]=='X'&& a[1][1]=='X' && a[2][0]=='X'))
		{
			System.out.println(":) CONGRATS YOU WON");
			t=1;
		}
		else if((a[0][0]=='1'&& a[0][1]=='1' && a[0][2]=='1')|| 
				(a[1][0]=='1'&& a[1][1]=='1' && a[1][2]=='1')||
				(a[2][0]=='1'&& a[2][1]=='1' && a[2][2]=='1')||
				(a[0][0]=='1'&& a[1][0]=='1' && a[2][0]=='1')||
				(a[0][1]=='1'&& a[1][1]=='1' && a[2][1]=='1')||
				(a[0][2]=='1'&& a[1][2]=='1' && a[2][2]=='1')||
				(a[0][0]=='1'&& a[1][1]=='1' && a[2][2]=='1')||
				(a[0][2]=='1'&& a[1][1]=='1' && a[2][0]=='1'))
		{
			System.out.println(":) CONGRATS COMPUTER WON");
			t=1;
		}		
	}
	private static void display() 
	{
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
	}
	private static void random() 
	{
		Random r=new Random();
		int i=r.nextInt(3);
		int  j=r.nextInt(3);
		if(a[i][j]=='-'){
			a[i][j]='1';
		}
		else
			random();
	}
}
