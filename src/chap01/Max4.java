package chap01;

import java.util.Scanner;

//네 값의 최댓값을 구하여 출력
public class Max4 {
	
	//a,b,c,d의 최댓값을 구하여 반환
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b> max) 
			max= b;
		if (c> max)
			max= c;
		if (d> max)
			max= d;
		
		return max;
	}
	
	public static void main(String[] args) {
			Scanner stdln=new Scanner(System.in);
			int a,b,c,d;
		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.println("a의 값: "); 
		a=stdln.nextInt();
		System.out.println("b의 값: "); 
		b=stdln.nextInt();
		System.out.println("c의 값: "); 
		c=stdln.nextInt();
		System.out.println("d의 값: "); 
		d=stdln.nextInt();
		
		int max=max4(a,b,c,d);//a,b,c,d의 최댓값

		System.out.println("최댓값은 "+max+"입니다.");
	
	}
}
