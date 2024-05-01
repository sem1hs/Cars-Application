
public class Kamyon extends Arac{
	
	private String Yuk;
	
	private String[] Teker = {"Sağ","Sol","Ön","Arka"}; 
	private int[] TekerDurum = {0,0,0,0};
	private int Sigorta=0;
	
	public Kamyon(String AracMarka,String AracModel,String AracUretimYil,String AracMotor,String AracKilometre,String Yuk)
	{
		super(AracMarka,AracModel,AracUretimYil,AracMotor,AracKilometre);
		this.Yuk = Yuk;
	}
	public void AracBilgiGoster()
	{
		super.AracBilgiGoster();
		System.out.println("Alabileceği Yük : " + this.Yuk);
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
		if(Sigorta!=0)
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
