package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		//220-284 
		//kendileri hariç pozitif tam bölenleri toplamı diğer sayıya eşit sayılardır
		//220'nin bölenleri toplamı 284, 284'ün bölenleri toplamı 220
		
		
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for(int i=1;i<number1;i++) {
			if(number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for(int i=1;i<number2;i++) {
			if(number2 % i == 0) {
				total2 = total2 + i;
			}
		}
		
		System.out.println(total1);
		
		System.out.println(total2);
		
		if(total1 == number2 && total2 == number1) {
			System.out.println("Arkadaş sayılardır");
		}else {
			System.out.println("Arkadaş sayılar değildir");
		}
		
	}

}
