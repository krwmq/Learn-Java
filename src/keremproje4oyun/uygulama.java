package keremproje4oyun;

public class uygulama extends savascalss {

	private String ad;
	public int hpA;
	public int damageA;
	public boolean hayattamiA;
	public int hpB;
	public int damageB;
	public boolean hayattamiB;
	public int hpC;
	public int damageC;
	public boolean hayattamiC;
	public String heroA;
	public String heroB;
	public String heroC;

	public uygulama() {

	}

	public uygulama(int hpA, int damageA, boolean hayattamiA, String heroA, int hpB, int damageB, boolean hayattamiB, String heroB, int hpC,
			int damageC, boolean hayattamiC, String heroC) {
		super();
		this.hpA = hpA;
		this.damageA = damageA;
		this.hayattamiA = hayattamiA;
		this.hpB = hpB;
		this.damageB = damageB;
		this.hayattamiB = hayattamiB;
		this.hpC = hpC;
		this.damageC = damageC;
		this.hayattamiC = hayattamiC;
		
		this.heroA = heroA;
		this.heroB = heroB;
		this.heroC = heroC;
		
		
	}

	public void Hero(String ad) {
		savascalss savas = new savascalss();
		if (ad.equals(heroA)) {
			this.hayattamiA = true;
			savasci1(hpA, damageA, hayattamiA, heroA);
		} else if (ad.equals(heroB)) {
			this.hayattamiB = true;
			savasci1(hpB, damageB, hayattamiB, heroB);
		} else if (ad.equals(heroC)) {
			this.hayattamiC = true;
			savasci1(hpC, damageC, hayattamiC, heroC);
		} else {
			System.out.println("Hero seçimi yapamadınız");
		}

	}

	public void Rakip(String ad) {
		savascalss savas = new savascalss();
		if (ad.equals(heroA)) {
			this.hayattamiA = true;
			savasci2(hpA, damageA, hayattamiA, heroA);
		} else if (ad.equals(heroB)) {
			this.hayattamiB = true;
			savasci2(hpB, damageB, hayattamiB, heroB);
		} else if (ad.equals(heroC)) {
			this.hayattamiC = true;
			savasci2(hpC, damageC, hayattamiC, heroC);
		} else {
			System.out.println("Hero seçimi yapamadınız");
		}

	}

	public void setId(String ad) {
		this.ad = ad;
	}

	public String getId() {
		return ad;
	}

	public void basla() {
		SAVAS();
	}

	public void kurallar() {
		System.out.println(" iyi oyunlar");
		System.out.println("         ↓↓↓ Oyunun kuralları aşağida listelenmiştir ↓↓↓");
		System.out.println("- Her tur 0 ile 3 arasında zar atılır ve bu sayı heroların gücüyle çarpılarak hasara dönüşür");
		System.out.println("- Rakibe vurursan seçtiğin heronun gücüyle doğru orantılı hasar verirsin");
		System.out.println("- Seçilen rakip aynı şekilde sana gücüyle doğru orantılı hasar verir");
		System.out.println("- Eğer guard alırsan rakipten alacağın hasarın yarısını savurursun");
		System.out.println("- Guard aldığın her tur rakibe verilecek hasar biriktirilir");
		System.out.println("- Eğer zardan 0 çekilirse biriktirilen güç sıfırlanır");
	}

}
