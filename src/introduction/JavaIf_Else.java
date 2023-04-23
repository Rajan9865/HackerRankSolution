package introduction;

import java.util.Scanner;

public class JavaIf_Else {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scanner.nextInt();
		if (N%2!=0) {
			System.out.println("weired");
		}else if (N>=2&&N<=20) {
			System.out.println("not weired");
		} else if (N>=6&&N<=20) {
			System.out.println("weired");
		}else if (N>20) {
			System.out.println("not weired");
		}
		scanner.close();
	}
}
