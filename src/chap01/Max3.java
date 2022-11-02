package chap01;

import java.util.Scanner;

//3개의 정숫값을 "일일이" 입력하고 최댓값을 구한다.
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : "); int a = stdIn.nextInt();//stdIn.nextInt():키보드로 입력한 값 중 '정숫값'을 얻어낸다.
		System.out.println("b의 값 : "); int b = stdIn.nextInt();
		System.out.println("c의 값 : "); int c = stdIn.nextInt();
		int max = a; // 1.max에 a 값을 넣는다.
		if (b > max) max = b; //2.b값이 max보다 크면 max에 b 값을 넣는다..
		if (c > max) max = c; //3.c값이 max보다 크면 max에 c 값을 넣는다..
		
		System.out.println("최댓값은 " + max + "입니다.");
		
	}

}
