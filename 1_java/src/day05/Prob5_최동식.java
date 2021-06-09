package day05;

import util.MyUtil;

//문제1. Prob5내에 leftPad 메쏘드를 작성하십시오. 
//leftPad 메쏘드의 속성은 다음과 같습니다.
//
//1.	메소드 시그니처 : 
// public static String leftPad(String str, int size, char padChar)
//
//2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
// 문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.
//
//3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
//      큰 경우에는 원본 문자열(str)을 그대로 리턴한다.
//
//실행 예) 
//leftPad(“SDS”, 6, ‘#’)    ###SDS 
//leftPad(“SDS”, 5, ‘$’)    $$SDS
//leftPad(“SDS”, 2, ‘&’)    SDS
public class Prob5_최동식 {
	public static void main(String args[]) {
		System.out.println(Prob5_최동식.leftPad("SDS", 6, '#'));
		System.out.println(Prob5_최동식.leftPad("SDS", 5, '$'));
		System.out.println(Prob5_최동식.leftPad("SDS", 2, '&'));

		int[] arr = { 3, 6, 1, 8, 2, 4 };
		printArray(arr);
		selectionSort(arr);
		printArray(arr);

		int[] res = MyUtil.sort(arr);
		System.out.println(res);
	}

	public static String leftPad(String str, int size, char padChar) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < (size - str.length()); i++)
			sb.append(padChar);
		String pad = sb.toString();
		String msg = String.format("%s%s", pad, str);
		System.out.printf("leftPad(\"%s\", %d, \'%c\')	", str, size, padChar);
		if (str.length() >= size)
			return str;
		else
			return msg;
	}

	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
	}

	private static void selectionSort(int[] arr, int start) {
		if (start < arr.length - 1) {
			int min_index = start;
			for (int i = start; i < arr.length; i++) {
				if (arr[i] < arr[min_index])
					min_index = i;
			}
			swap(arr, start, min_index);
			selectionSort(arr, start + 1);
		}
	}

	private static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}
}

//sort  함수 추가  선언부를 고민해 보세요 ? 
//1. 정렬할 int 배열을 넘겨 받고 
//  오름 차순으로 정렬후  정렬 결과를 리턴한다.
