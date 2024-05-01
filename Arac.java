import java.util.*;

public class Arac {
	protected String AracMarka;
	protected String AracModel;
	protected String AracUretimYil;
	protected String AracMotor;
	protected String AracKilometre;
	
	private String[] Parca = {"Tampon","Kaput","Kapı","Çamurluk"};
	private int[] ParcaKontrol = {0,0,0,0};
	
	public Arac(String AracMarka,String AracModel,String AracUretimYil,String AracMotor,String AracKilometre)
	{
		this.AracMarka = AracMarka;
		this.AracModel = AracModel;
		this.AracUretimYil = AracUretimYil;
		this.AracMotor = AracMotor;
		this.AracKilometre = AracKilometre;
	}
	public void AracBilgiGoster(){
		System.out.println("Araç Marka : " + AracMarka + " Araç Model : " + AracModel + " Üretim Yılı : " + AracUretimYil);
		System.out.println("Araç Motor : " + AracMotor + " Araç Kilometre : " + AracKilometre);
	};
	public int SayiUret()
	{
		Random rnd = new Random();
		int rndInt = rnd.nextInt(4);
		return rndInt;
	}
	public void ParcaKontrol()
	{
		for(int i=0;i<4;i++)
		{
			if(ParcaKontrol[i] != 0)
			{
				String Temp = (ParcaKontrol[i] == 1) ? "Değişen" : "Boyalı";
				System.out.println("Parça : " + Parca[i] + "  Durumu : " + Temp);
			}
			else {
					System.out.println("Parça : " + Parca[i]+ "  Durumu : Orijinal");
			}
		}
	}
	public void ParcaDegis(String DegisenParca)
	{
		for(int i=0;i<4;i++)
		{
			if(this.Parca[i].equals(DegisenParca))
			{
				if(ParcaKontrol[i] != 0)
				{
					ParcaKontrol[i] = 1;
					System.out.println("Parçanız Başarıyla Değiştirildi !");
				}
				else
				{
					System.out.println("Bu Parça Zaten Değişmiş veya Orijinal !");
				}
			}
		}
	}
	public void KazaYap()
	{		
		int rndInt = SayiUret();
		if(ParcaKontrol[rndInt]!=2)
		{
			System.out.println(Parca[rndInt] + " Hasar Aldı ! ");
			ParcaKontrol[rndInt] = 2;
		}
		else
		{
			System.out.println("Lütfen " + Parca[rndInt] + " Tamir Edin ! ");
		}
	}
	public void TamirEt()
	{
		int Temp = 0;
		for(int i=0;i<4;i++)
		{
			if(ParcaKontrol[i] != 0)
			{
				ParcaKontrol[i] = 0;
				Temp =1;
			}
		}
		if(Temp != 1 )
		{
			System.out.println("Arabada Tamir Edilebilecek Parça Yok ! ");
		}
		else {
			System.out.println("Arabada Tamir Edildi ! ");
		}
	}
}
