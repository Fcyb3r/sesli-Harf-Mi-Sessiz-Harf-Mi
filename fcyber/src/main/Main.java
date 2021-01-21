package main;

public class Main {
	public static void main(String[] args) {

		char harf = 'a';

		System.out.println("Girdiğiniz harf= " + harf);
		switch (harf) {

		case 'a':
		case 'e':
		case 'ı':
		case 'i':
		case 'o':
		case 'ö':
		case 'u':
		case 'ü':
		case 'A':
		case 'E':
		case 'I':
		case 'İ':
		case 'O':
		case 'Ö':
		case 'U':
		case 'Ü':
			System.out.println("Sesli harf");
			break;
		default:
			System.out.println("Sessiz harf");

		}

	}
}