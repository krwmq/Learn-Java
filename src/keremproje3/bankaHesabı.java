package keremproje3;

public class bankaHesabı {

	public String ad1;
	public int hesapno1;
	public int bakiye1;
	public String ad2;
	public int hesapno2;
	public int bakiye2;
	public String ad3;
	public int hesapno3;
	public int bakiye3;

	public bankaHesabı() {
		
	}

	public bankaHesabı(String ad1, int hesapno1, int bakiye1, String ad2, int hesapno2, int bakiye2, String ad3,
			int hesapno3, int bakiye3) {
		super();
		this.ad1 = ad1;
		this.hesapno1 = hesapno1;
		this.bakiye1 = bakiye1;
		this.ad2 = ad2;
		this.hesapno2 = hesapno2;
		this.bakiye2 = bakiye2;
		this.ad3 = ad3;
		this.hesapno3 = hesapno3;
		this.bakiye3 = bakiye3;
	}

	public void paraCekme(String ad, int a) {

		if (ad1.equals(ad)) {
			bakiye1 += a;
			System.out.println("Banka hesabına " + a + " Para Yatırma İşleminiz Gerçekleştirilmiştir");
			System.out.println();
			System.out.println("Ad: " + ad1 + ", Hesap Numarası: " + hesapno1 + ", Güncel Bakiye: " + bakiye1);
		} else if (ad2.equals(ad)) {
			bakiye2 += a;
			System.out.println("Banka hesabına " + a + " Para Yatırma İşleminiz Gerçekleştirilmiştir");
			System.out.println();
			System.out.println("Ad: " + ad2 + ", Hesap Numarası: " + hesapno2 + ", Güncel Bakiye: " + bakiye2);
		} else if (ad3.equals(ad)) {
			bakiye3 += a;
			System.out.println("Banka hesabına " + a + " Para Yatırma İşleminiz Gerçekleştirilmiştir");
			System.out.println();
			System.out.println("Ad: " + ad3 + ", Hesap Numarası: " + hesapno3 + ", Güncel Bakiye: " + bakiye3);
		}
	}

	public void paraYatırma(String ad, int a) {

		if (ad1.equals(ad)) {
			bakiye1 -= a;
			System.out.println("Banka hesabına " + a + " Para Çekme İşleminiz Gerçekleştirilmiştir");
			System.out.println();
			System.out.println("Ad: " + ad1 + ", Hesap Numarası: " + hesapno1 + ", Güncel Bakiye: " + bakiye1);
		} else if (ad2.equals(ad)) {
			bakiye2 -= a;
			System.out.println("Banka hesabına " + a + " Para Çekme İşleminiz Gerçekleştirilmiştir");
			System.out.println();
			System.out.println("Ad: " + ad2 + ", Hesap Numarası: " + hesapno2 + ", Güncel Bakiye: " + bakiye2);
		} else if (ad3.equals(ad)) {
			bakiye3 -= a;
			System.out.println("Banka hesabına " + a + " Para Çekme İşleminiz Gerçekleştirilmiştir");
			System.out.println();
			System.out.println("Ad: " + ad3 + ", Hesap Numarası: " + hesapno3 + ", Güncel Bakiye: " + bakiye3);
		}
	}

}
