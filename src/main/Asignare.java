package main;

public class Asignare {

	public static void main(String[] args) {
		int a = 3;
		int b = (a=2)*a; // b = 2 * 2 = 4 , a = 2
		int c = b * (b=5); // c = 4 * 5, b = 5
		System.out.println("a=" + a + ", b = " + b + ", c=" + c);
		
		
		Ex2();
		Ex3();
		Ex4();
       	Ex5();
       	Ex6();
       	Ex7(5);
       	Ex8(3);
	}
	
	static void Ex2() {
		double d = 2.95;
		int i = 4;
		System.out.println(++d>i ? d : i);
		// 3.95 > 4 => 4
	}
	
	static void Ex3() {
		int a = 3;
		
		if (++a < 4) // 4 < 4
			if(a++ < 4)
				System.out.println(a);
			else
				System.out.println(a);
		
		// display nothing because there is no else
	}

	static void Ex4() {
		int suma = 0;	
		
		for (int i = 1; i < 10; i++) {
			suma += suma + i;
		}	
		
		System.out.println(suma);
	}
	
	static void Ex5() {
		int factorial = 1;
		int n=13;
		
		for (int i = 1; i < n; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("13!=" + factorial);
	}
	
	static void Ex6() {
		int a = 10, b = 20, c = 5;
		int min = a;
		
		if (b < min) {
			min = b;
		} else if (c < min) {
			min = c;
		}
		
		System.out.println(min);
	}
	
	static void Ex7(int a) {
		if (a % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	}
	
	static void Ex8(int day) {
		switch (day) {
			case 1: 
				System.out.println("Luni");
				break;
			case 2:
				System.out.println("Marti");
				break;
			case 3:
				System.out.println("Miercuri");
				break;
			case 4:
				System.out.println("Joi");
				break;
			case 5:
				System.out.println("vineri");
				break;
			case 6:
				System.out.println("Sambata");
				break;
			case 7:
				System.out.println("Duminica");
				break;
		}
	}
}
