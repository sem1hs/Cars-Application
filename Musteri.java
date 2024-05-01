
public class Musteri extends Main{
	protected String MusteriIsim;
	protected String MusteriEhliyet;
	
	public Musteri(String MusteriIsim,String MusteriEhliyet)
	{
		this.MusteriIsim = MusteriIsim;
		this.MusteriEhliyet = MusteriEhliyet;
	};
	public void MusteriBilgi()
	{
		System.out.println("İsminiz : " + MusteriIsim + "  Ehliyet : " + MusteriEhliyet);
	}
	/* Helper Functions */
	public static int AracSecim()
	{
		int Secim;
		System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçin !\n");
		System.out.println("1)Araç Bilgi Göster\n2)Parça İşlemleri\n3)Kaza Yap\n4)Tamir Et\n5)Teker İşlemleri\n6)Sigorta İşlemleri\n0)Kapat");
		Secim = SayiAl();
		return Secim;
	}
	public static void GecersizIslem()
	{
		System.out.println("Lütfen Geçerli Bir İşlem Yapınız...");
		KayitOl();
		Musteri musteri1 = new Musteri(İsim,Ehliyet);
		System.out.println("Kiralayabileceğiniz Araçlar \n");
		musteri1.AracKirala();
	}
	public static String KiralamaSoru()
	{
		System.out.println("Kiralamak İster Misiniz (Evet/Hayır) : ");
		String Temp = KarakterAl();
		return Temp;
	}
	/* Helper Functions */
	public void AracKirala()
	{
		if(MusteriEhliyet.toUpperCase().equals("A"))
		{
			System.out.println("Otomobil");
			String Temp = KiralamaSoru();
			if(Temp.toLowerCase().equals("evet"))
			{
				MenuArac(1);
			}
			else if(Temp.toLowerCase().equals("hayır"))
			{
				System.out.println("Hoşçakalın...");
			}
			else
			{
				GecersizIslem();
			}
		}
		else if(Ehliyet.toUpperCase().equals("B"))
		{
			System.out.println("1)Otomobil - 2)Kamyon");
			int Temp = SayiAl();
			String Temp1 = KiralamaSoru();
			if(Temp1.toLowerCase().equals("evet") && Temp == 1)
			{
				MenuArac(1);
			}
			else if(Temp1.toLowerCase().equals("evet") && Temp == 2)
			{
				MenuArac(2);
			}
			else if(Temp1.toLowerCase().equals("hayır"))
			{
				System.out.println("Hoşçakalın...");
			}
			else
			{
				GecersizIslem();
			}
		}
		else if(Ehliyet.toUpperCase().equals("C"))
		{
			System.out.println("Kamyon");
			String Temp = KiralamaSoru();
			if(Temp.toLowerCase().equals("evet"))
			{
				MenuArac(2);
			}
			else if(Temp.toLowerCase().equals("hayır"))
			{
				System.out.println("Hoşçakalın...");
			}
			else
			{
				GecersizIslem();
			}
		}
		else if(Ehliyet.toUpperCase().equals("D"))
		{
			System.out.println("1)Otobüs - 2)Minibüs");
			int Temp = SayiAl();
			String Temp1 = KiralamaSoru();
			if(Temp1.toLowerCase().equals("evet") && Temp == 1)
			{
				MenuArac(3);
			}
			else if(Temp1.toLowerCase().equals("evet") && Temp == 2)
			{
				MenuArac(4);
			}
			else if(Temp1.toLowerCase().equals("hayır"))
			{
				System.out.println("Hoşçakalın...");
			}
			else
			{
				GecersizIslem();
			}
		}
		
	}
	public static void MenuArac(int TempInt)
	{
		if(TempInt == 1)
		{
			int secim = 1;
			while(secim != 0)
			{
				secim = AracSecim();
				switch(secim)
				{
					case 0:
					{
						break;
					}
					case 1:
					{
						arac1.AracBilgiGoster();
						break;
					}
					case 2:
					{
						System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac1.ParcaKontrol();
									break;
								}
								case 2:
								{
									System.out.print("Değiştirmek İstediğiniz Parça : ");
									String Temp = KarakterAl();
									arac1.ParcaDegis(Temp);
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 3:
					{
						arac1.KazaYap();
						break;
					}
					case 4:
					{
						arac1.TamirEt();
						break;
					}
					case 5:
					{
						System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac1.TekerDurum();
									break;
								}
								case 2:
								{
									arac1.TekerDegis();
									break;
								}
								case 3:
								{
									arac1.TekerPatlat();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 6:
					{
						System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac1.SigortaDurum();
									break;
								}
								case 2:
								{
									arac1.SigortaYap();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
				}
			}
		}
		else if(TempInt == 2)
		{
			int secim = 1;
			while(secim != 0)
			{
				secim = AracSecim();
				switch(secim)
				{
					case 0:
					{
						break;
					}
					case 1:
					{
						arac2.AracBilgiGoster();
						break;
					}
					case 2:
					{
						System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac2.ParcaKontrol();
									break;
								}
								case 2:
								{
									System.out.print("Değiştirmek İstediğiniz Parça : ");
									String Temp = KarakterAl();
									arac2.ParcaDegis(Temp);
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 3:
					{
						arac2.KazaYap();
						break;
					}
					case 4:
					{
						arac2.TamirEt();
						break;
					}
					case 5:
					{
						System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac2.TekerDurum();
									break;
								}
								case 2:
								{
									arac2.TekerDegis();
									break;
								}
								case 3:
								{
									arac2.TekerPatlat();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 6:
					{
						System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac2.SigortaDurum();
									break;
								}
								case 2:
								{
									arac2.SigortaYap();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
				}
			}
		}
		else if(TempInt == 3)
		{
			int secim = 1;
			while(secim != 0)
			{
				secim = AracSecim();
				switch(secim)
				{
					case 0:
					{
						break;
					}
					case 1:
					{
						arac3.AracBilgiGoster();
						break;
					}
					case 2:
					{
						System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac3.ParcaKontrol();
									break;
								}
								case 2:
								{
									System.out.print("Değiştirmek İstediğiniz Parça : ");
									String Temp = KarakterAl();
									arac3.ParcaDegis(Temp);
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 3:
					{
						arac3.KazaYap();
						break;
					}
					case 4:
					{
						arac3.TamirEt();
						break;
					}
					case 5:
					{
						System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac3.TekerDurum();
									break;
								}
								case 2:
								{
									arac3.TekerDegis();
									break;
								}
								case 3:
								{
									arac3.TekerPatlat();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 6:
					{
						System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac3.SigortaDurum();
									break;
								}
								case 2:
								{
									arac3.SigortaYap();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
				}
			}
		}
		else if(TempInt == 4)
		{
			int secim = 1;
			while(secim != 0)
			{
				secim = AracSecim();
				switch(secim)
				{
					case 0:
					{
						break;
					}
					case 1:
					{
						arac4.AracBilgiGoster();
						break;
					}
					case 2:
					{
						System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac4.ParcaKontrol();
									break;
								}
								case 2:
								{
									System.out.print("Değiştirmek İstediğiniz Parça : ");
									String Temp = KarakterAl();
									arac4.ParcaDegis(Temp);
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Parça Kontrol\n2)Parça Değiş\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 3:
					{
						arac4.KazaYap();
						break;
					}
					case 4:
					{
						arac4.TamirEt();
						break;
					}
					case 5:
					{
						System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac4.TekerDurum();
									break;
								}
								case 2:
								{
									arac4.TekerDegis();
									break;
								}
								case 3:
								{
									arac4.TekerPatlat();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Teker Durum\n2)Teker Değiş\n3)Teker Patlat\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
					case 6:
					{
						System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
						int secim1 = SayiAl();
						while(secim1!=0)
						{
							switch(secim1)
							{
								case 0:
								{
									break;
								}
								case 1:
								{
									arac4.SigortaDurum();
									break;
								}
								case 2:
								{
									arac4.SigortaYap();
									break;
								}
								default:{
									System.out.println("Lütfen Geçerli Bir İşlem Yapınız !");
									break;
								}
							}
							System.out.println("1)Sigorta Durum\n2)Sigorta Yap\n0)Kapat");
							secim1 = SayiAl();
						}
						break;
					}
				}
			}
		}
	}
}
