import java.util.Scanner;

public class Multiple_Table {

	public static void main(String[] args) {
		// ������ ��� ���α׷�
		
		Scanner scn = new Scanner(System.in);
		
		boolean flag = true;
		boolean flag1 = true;		// �ùٸ� ���� �Է��ߴ��� Ȯ���ϴ� ����
		boolean flag2 = true;		// �ùٸ� ���� �Է��ߴ��� Ȯ���ϴ� ����
		
		int input_number;			// ����ڷ� ���� �Է¹޴� �޴� ����
		int input_number1 = 0;		// ����ڷ� ���� �Է¹޴� �������� �� ��
		
		while(flag) {
			
			flag1 = true;
			flag2 = true;
			
			// �޴� ���
			System.out.println("--------------");
			System.out.println("1. ������ ���");
			System.out.println("2. ���α׷� ����");
			System.out.println("--------------");
			
			
			// ����ڷ� ���� �޴� �Է� �κ�
			do {
				input_number = scn.nextInt();	
				
				if(input_number == 1) {		// ������ ���
					flag1= false;
					System.out.println("����� �������� ���� �Է��ϼ��� .�������� ���� 2~9 ���� �Է�");
				}
				
				if(input_number == 2) {		// ���α׷� ����
					flag = false;
					flag1 = false;
					flag2 = false;
				}
				// 1, 2���� ���� �Է����� �� 
				if(input_number != 1 && input_number != 2)
				{			
					System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				}
				
			} while(flag1);
			
			
			// ������ �� ���� �κ�
			while(flag2) {
				input_number1 = scn.nextInt();
				
				if(input_number1 < 2 || input_number1 > 9) {
					System.out.println("2~9������ ������ �Է��ϼ���.");
				} else {
					flag2 = false;
					
					// ������ ��� �κ�
					System.out.println("--------------");
					for(int i = 1 ; i <= 9 ; i++) {
						System.out.printf("%d x %d = %d \n", input_number1, i, input_number1 * i);
					}
					
				}
				
			} // end while flag2
			
			
		};
		
		System.out.println("�̿����ּż� �����մϴ�.");

	}// main

}// class
