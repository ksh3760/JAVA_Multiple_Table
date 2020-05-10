import java.util.Scanner;

public class Multiple_Table {

	public static void main(String[] args) {
		// 구구단 출력 프로그램
		
		Scanner scn = new Scanner(System.in);
		
		boolean flag = true;
		boolean flag1 = true;		// 올바른 값을 입력했는지 확인하는 변수
		boolean flag2 = true;		// 올바른 값을 입력했는지 확인하는 변수
		
		int input_number;			// 사용자로 부터 입력받는 메뉴 정수
		int input_number1 = 0;		// 사용자로 부터 입력받는 구구단의 단 수
		
		while(flag) {
			
			flag1 = true;
			flag2 = true;
			
			// 메뉴 출력
			System.out.println("--------------");
			System.out.println("1. 구구단 출력");
			System.out.println("2. 프로그램 종료");
			System.out.println("--------------");
			
			
			// 사용자로 부터 메뉴 입력 부분
			do {
				input_number = scn.nextInt();	
				
				if(input_number == 1) {		// 구구단 출력
					flag1= false;
					System.out.println("출력할 구구단의 단을 입력하세요 .구구단의 단은 2~9 사이 입력");
				}
				
				if(input_number == 2) {		// 프로그램 종료
					flag = false;
					flag1 = false;
					flag2 = false;
				}
				// 1, 2외의 값을 입력했을 시 
				if(input_number != 1 && input_number != 2)
				{			
					System.out.println("잘못된 값을 입력하셨습니다. 다시 입력하세요.");
				}
				
			} while(flag1);
			
			
			// 구구단 단 선택 부분
			while(flag2) {
				input_number1 = scn.nextInt();
				
				if(input_number1 < 2 || input_number1 > 9) {
					System.out.println("2~9사이의 정수를 입력하세요.");
				} else {
					flag2 = false;
					
					// 구구단 출력 부분
					System.out.println("--------------");
					for(int i = 1 ; i <= 9 ; i++) {
						System.out.printf("%d x %d = %d \n", input_number1, i, input_number1 * i);
					}
					
				}
				
			} // end while flag2
			
			
		};
		
		System.out.println("이용해주셔서 감사합니다.");

	}// main

}// class
