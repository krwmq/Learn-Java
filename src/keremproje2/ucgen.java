package keremproje2;

public class ucgen {
	
	public ucgen() {
		
	}
		public void alanHesaplama(Double a, Double b) {
			a = (a*b)/2;
			System.out.println("ucgenin alanı "+a+"cm");
		}
		public void cevreHesaplama(Double a, Double b) {
			a = Math.sqrt((a*a)+(b*b))+a+b;
			System.out.println("ucgenin çevresi "+a+"cm");
			
		
	}
	
}
