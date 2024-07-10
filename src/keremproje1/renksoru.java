package keremproje1;

import java.util.ArrayList;
import java.util.Iterator;

public class renksoru {

	public static void main(String[] args) {
		ArrayList<String> renkler = new ArrayList<String>();
		renkler.add("Kırmızı");
		renkler.add("Turuncu");
		renkler.add("Sarı");
		renkler.add("Yeşil");
		renkler.add("Mor");
		renkler.add("Pembe");
		renkler.add("Lacivert");
		Iterator<String> tekrarlayıcı = renkler.iterator();
		for (String renk : renkler) {
			String tekrar = (String) tekrarlayıcı.next();
			if (tekrar.equals("Yeşil")) {

			} else {
				System.out.print(tekrar + " ");
			}

		}
		System.out.println();
		renkler.remove(renkler.size() / 2);
		renkler.add(renkler.size() / 2, "Turkuaz");
		for (String string : renkler) {

		}
		System.out.println(renkler);
		renkler.clear();

		System.out.println(renkler);

		
	}

}
