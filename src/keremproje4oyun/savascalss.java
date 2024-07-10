package keremproje4oyun;

import java.util.Scanner;

public class savascalss {

	public String kullanıcı;
	public String rakip;

	public int hp1;
	public int damage1;
	public boolean hayattami1;
	public int hp2;
	public int damage2;
	public boolean hayattami2;

	public savascalss() {

	}

	public void savasci1(int hp1, int damage1, boolean hayattami1, String kullanıcı) {
		this.hp1 = hp1;
		this.damage1 = damage1;
		this.hayattami1 = hayattami1;
		this.kullanıcı = kullanıcı;
	}

	public void savasci2(int hp2, int damage2, boolean hayattami2, String rakip) {
		this.hp2 = hp2;
		this.damage2 = damage2;
		this.hayattami2 = hayattami2;
		this.rakip = rakip;
	}
	
	public void SAVAS() {
		Scanner scanner = new Scanner(System.in);
		int toplamhasar1, toplamhasar2;
		int hasar1 = 0;
		int hasar2 = 0;
		int randomhasar;
		int anlıkhasar = 0;
		while (this.hayattami1 && this.hayattami2) {
			hasar2 = 0;
			anlıkhasar = 0;
			System.out.println("Rakibe vurmak için '1' ");
			System.out.println("Guard almak için '2' ");
			int hamle = scanner.nextInt();

			if (hamle == 1) {
				randomhasar = (int) (Math.random() * 4);
				toplamhasar1 = randomhasar * this.damage1;
				hasar1 += toplamhasar1;
				if (randomhasar == 0) {
					hasar1 = 0;
				} else {
					this.hp2 -= hasar1;
					anlıkhasar = hasar1;
					hasar1 = 0;
				}
				randomhasar = (int) (Math.random() * 4);
				toplamhasar2 = randomhasar * this.damage2;
				hasar2 = toplamhasar2;
				this.hp1 -= hasar2;
			} else if (hamle == 2) {
				randomhasar = (int) (Math.random() * 4);
				toplamhasar1 = randomhasar * this.damage1;
				if (randomhasar == 0) {
					hasar1 = 0;
				} else {
					hasar1 += toplamhasar1;
				}
				randomhasar = (int) (Math.random() * 4);
				toplamhasar2 = randomhasar * this.damage2;
				hasar2 = toplamhasar2;
				this.hp1 -= hasar2 / 2;
			}

			if (this.hp1 <= 0) {
				this.hayattami1 = false;

			}
			if (this.hp2 <= 0) {
				this.hayattami2 = false;

			}
			System.out.print(this.kullanıcı + " 'in canı " + this.hp1 + " --- ");
			System.out.println(this.rakip + " 'in canı " + this.hp2);
			if (hamle == 1) {
				System.out.print(this.kullanıcı + " " + hasar2 + " hasar yedi --- ");
				System.out.println(this.rakip + " " + anlıkhasar + " hasar yedi");
			} else if (hamle == 2) {
				System.out.println(this.kullanıcı + " 'in biriktirilen gücü: " + hasar1);
				System.out.println(this.kullanıcı + " " + hasar2 / 2 + " hasar yedi");

			}
		}
		if (hayattami1) {
			System.out.println(this.kullanıcı + " kazandı");
		}
		if (hayattami2) {
			System.out.println(this.rakip + " kazandı");
			System.out.println("     .... NO! ...       DEAD       ... MNO! ...\n"
		+ "   ..... MNO!! ...................... MNNOO! ...\n"
		+ " ..... MMNO! ......................... MNNOO!! .\n"
		+ ".... MNOONNOO!   MMMMMMMMMMPPPOII!   MNNO!!!! .\n"
		+ " ... !O! NNO! MMMMMMMMMMMMMPPPOOOII!! NO! ....\n"
		+ "    ...... ! MMMMMMMMMMMMMPPPPOOOOIII! ! ...\n"
		+ "   ........ MMMMMMMMMMMMPPPPPOOOOOOII!! .....\n"
		+ "   ........ MMMMMOOOOOOPPPPPPPPOOOOMII! ...  \n"
		+ "    ....... MMMMM..    OPPMMP    .,OMI! ....\n"
		+ "     ...... MMMM::   o.,OPMP,.o   ::I!! ...\n"
		+ "         .... NNM:::.,,OOPM!P,.::::!! ....\n"
		+ "          .. MMNNNNNOOOOPMO!!IIPPO!!O! .....\n"
		+ "         ... MMMMMNNNNOO:!!:!!IPPPPOO! ....\n"
		+ "           .. MMMMMNNOOMMNNIIIPPPOO!! ......\n"
		+ "          ...... MMMONNMMNNNIIIOO!..........\n"
		+ "       ....... MN MOMMMNNNIIIIIO! OO ..........\n"
		+ "    ......... MNO! IiiiiiiiiiiiI OOOO ...........\n"
		+ "  ...... NNN.MNO! . O!!!!!!!!!O . OONO NO! ........\n"
		+ "   .... MNNNNNO! ...OOOOOOOOOOO .  MMNNON!........\n"
		+ "   ...... MNNNNO! .. PPPPPPPPP .. MMNON!........\n"
		+ "      ...... OO! ................. ON! .......\n"
		+ "         ................................\n"
		+ "");
		}
	}

}
