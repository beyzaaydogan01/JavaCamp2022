package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'İ';
		
		String mesaj1 = "Kalın harf";
		String mesaj2 = "İnce harf";
		String mesaj3 = "Kalın veya ince harf değildir";
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(mesaj1);
				break;
			default:
				System.out.println(mesaj2);
		}
		
	
		
		System.out.println("--------------------------");
		
		
		
		if(harf == 'A' || harf =='I'|| harf =='O'|| harf =='U') {
			System.out.println(mesaj1);
		}
		else if(harf == 'E'|| harf =='İ'|| harf =='Ö'|| harf =='Ü') {
			System.out.println(mesaj2);
		}
		else {
			System.out.println(mesaj3);
		}
		
		
		System.out.println("------------------------------");
		
		char harf1 = 'C';
		char[] kalinSesli = {'A','I','O','U'};
		char[] inceSesli = {'E','İ','Ö','Ü'};
		
		
		for(int i=0; i<4;i++) {
			if(harf1 == kalinSesli[i]) {
				System.out.println("Kalın sesli bir harftir");
				return;
			}
			else if(harf1 == inceSesli[i]) {
				System.out.println("İnce sesli bir harftir");
				return;
				
			}else {
				System.out.println("Geçersiz harf");
				return;
			}
		}
	
	}

}
