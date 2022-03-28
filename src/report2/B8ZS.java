package report2;

import java.util.Scanner;

public class B8ZS {
	
	public static void Input_to_Output_Tx(int arr[]){	// Tx 변환 함수
		
		char outputArray [] = new char [arr.length];	// 출력 배열, 입력 배열 길이마큼
		
		boolean Bipolar = true;		// Bipolar 값 true : + , false : -
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0 && arr[i+1] == 0 && arr[i+2] == 0 && arr[i+3] == 0 && arr[i+4] == 0 && arr[i+5] == 0 && arr[i+6] == 0 && arr[i+7] == 0) {
				if(Bipolar == false) {
					outputArray[i] = '0';
					outputArray[i+1] = '0';
					outputArray[i+2] = '0';
					outputArray[i+3] = '+';
					outputArray[i+4] = '-';
					outputArray[i+5] = '0';
					outputArray[i+6] = '-';
					outputArray[i+7] = '+';
				}
				else if(Bipolar == true) {
					outputArray[i] = '0';
					outputArray[i+1] = '0';
					outputArray[i+2] = '0';
					outputArray[i+3] = '-';
					outputArray[i+4] = '+';
					outputArray[i+5] = '0';
					outputArray[i+6] = '+';
					outputArray[i+7] = '-';
				}
				if((i+8) > arr.length) {
					i++;
				}else
					i = i + 7;
				
			}
			else if(arr[i] == 0) {
				outputArray[i] = '0';
			}
			else if(arr[i] == 1) {
				if(Bipolar == true) {
					outputArray[i] = '+';
					Bipolar = false;
				}
				else if(Bipolar == false) {
					outputArray[i] = '-';
					Bipolar = true;
				}
			}
			
		}
		
		for(int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i] + " ");
		}
		
	}
	
	public static void Input_to_Output_Rx(String InputStr) {		// Rx 변환 함수
		
		char subArray [] = new char[InputStr.length()];
		
		
		for(int i = 0; i < InputStr.length(); i++) {	// InputStr 문자열을 문자 배열로 변환화는 과정
			subArray[i] = InputStr.charAt(i);
		}
	
		int outputArray [] = new int [subArray.length];
		
		for(int i = 0; i < subArray.length; i++) {
			if(subArray[i] == '0' && subArray[i+1] == '0' && subArray[i+2] == '0' && subArray[i+3] == '+' && subArray[i+4] == '-' 
					&& subArray[i+5] == '0' && subArray[i+6] == '-' && subArray[i+7] == '+') {
				outputArray[i] = 0;
				outputArray[i+1] = 0;
				outputArray[i+2] = 0;
				outputArray[i+3] = 0;
				outputArray[i+4] = 0;
				outputArray[i+5] = 0;
				outputArray[i+6] = 0;
				outputArray[i+7] = 0;
				if((i+8) > subArray.length)
					i++;
				else
					i = i + 7;
			}
			else if(subArray[i] == '0' && subArray[i+1] == '0' && subArray[i+2] == '0' && subArray[i+3] == '-' && subArray[i+4] == '+' 
					&& subArray[i+5] == '0' && subArray[i+6] == '+' && subArray[i+7] == '-') {
				outputArray[i] = 0;
				outputArray[i+1] = 0;
				outputArray[i+2] = 0;
				outputArray[i+3] = 0;
				outputArray[i+4] = 0;
				outputArray[i+5] = 0;
				outputArray[i+6] = 0;
				outputArray[i+7] = 0;
				if((i+8) > subArray.length)
					i++;
				else
					i = i + 7;
			}
			else if (subArray[i] == '+')
				outputArray[i] = 1;
			else if (subArray[i] == '-')
				outputArray[i] = 1;
			else if (subArray[i] == '0')
				outputArray[i] = 0;
		}
	
		for(int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tx에서는 띄어쓰기 가능, Rx에서는 띄어쓰기 불가능");
		System.out.println("디지털 신호는 13개만 입력!");
		
		// Tx 예시 입력 및 출력
//		System.out.println("Tx");
//		
//		int Tx_InputArray [][] = new int[10][13];
//		
//		for(int i = 0; i < Tx_InputArray.length; i++) {
//			System.out.print(i+1 + "번 예시 입력 : D ");
//			for(int j = 0; j < Tx_InputArray[i].length; j++) {
//				Tx_InputArray[i][j] = input.nextInt();
//			}
//			System.out.print(i+1 + "번 예시 출력 : S ");
//			Input_to_Output_Tx(Tx_InputArray[i]);
//			System.out.println();
//		}
		
		// Rx 예시 입력 및 출력
		System.out.println("Rx");
		
		String Rx_Input;
		for(int i = 1; i < 11; i++) {
			System.out.print(i + "번 예시 입력 : S ");
			Rx_Input = input.nextLine();
			System.out.print(i + "번 예시 출력 : D ");
			Input_to_Output_Rx(Rx_Input);
			System.out.println();
		}
		
		input.close();
	}

}













