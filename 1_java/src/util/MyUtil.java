package util;

public class MyUtil {

	//static 메소드
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

	//인스턴스 메소드 -> new필요
	public String rightPad(String str, int size, char padChar) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < (size - str.length()); i++)
			sb.append(padChar);
		String pad = sb.toString();
		String msg = String.format("%s%s", str, pad);
		System.out.printf("leftPad(\"%s\", %d, \'%c\')	", str, size, padChar);
		if (str.length() >= size)
			return str;
		else
			return msg;
	}

	public static int[] sort(int[] arr) {
		int[] res = arr.clone();

		for (int i = 0; i < res.length - 1; i++) {
			int minidx = i;
			for (int j = i + 1; j < res.length; j++)
				if (res[minidx] > res[j])
					minidx = j;
			if (i != minidx) {
				int temp = res[i];
				res[i] = res[minidx];
				res[minidx] = temp;
			}
		}

		return res;
	}
}
