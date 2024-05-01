
public class Otomobil extends Arac{
	private String KapiSayisi;
	private String AracTür;
	private String VitesTür;
	
	private String[] Teker = {"Sağ Ön","Sol Ön","Sağ Arka","Sol Arka"}; 
	private int[] TekerDurum = {0,0,0,0};
	private int Sigorta=0;
	
	public Otomobil(String AracMarka, String AracModel, String AracUretimYil, String AracMotor, String AracKilometre,String KapiSayisi,String AracTür,String VitesTür) {
		super(AracMarka, AracModel, AracUretimYil, AracMotor, AracKilometre);
		this.KapiSayisi = KapiSayisi;
		this.AracTür = AracTür;
		this.VitesTür = VitesTür;
	}
	public void AracBilgiGoster()
	{
		super.AracBilgiGoster();
		System.out.println("Kapı Sayısı : " + this.KapiSayisi + " Araç Türü : " + this.AracTür + "  Vites Türü : " + this.VitesTür);
	}
	
	public void TekerDurum()
	{
		for(int i=0;i<4;i++)
		{
			String Temp = (TekerDurum[i] == 1) ? "Patlak" : "Sağlam";
			System.out.println(Teker[i] + " Teker : " + Temp);
		}
	}
	public void TekerDegis()
	{
		for(int i=0;i<4;i++)
		{
			if(TekerDurum[i]==0)
			{
				continue;
			}
			else
			{
				TekerDurum[i] = 0;
				System.out.println(Teker[i] + " Teker Değişildi !");
			}
		}
	}
	public void TekerPatlat()
	{
		int rndInt = super.SayiUret();
		System.out.println(Teker[rndInt] + " Teker Patladı !");
		TekerDurum[rndInt] = 1;
	}
	public void SigortaDurum()
	{
		String Temp = (Sigorta == 0) ? "Yok" : "Var";
		System.out.println("Sigortanız " + Temp + " !");
	}
	public void SigortaYap()
	{
		if(Sigorta==0)
		{
			System.out.println("Sigorta Yapıldı !");
			Sigorta=1;
		}
		else
		{
			System.out.println("Sigorta Yapılmış !");
		}
	}
}
