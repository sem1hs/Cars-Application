import java.util.*;
public class Main {

	static String İsim;
	static String Ehliyet;
	
	static Otomobil arac1 = new Otomobil("Toyota","Corolla","2018","1.6","20.000","4","Dizel","Manuel");
	static Kamyon arac2 = new Kamyon("Man","14M3","2022","3.6","6.000","5 Ton");
	static Otobüs arac3 = new Otobüs("Mercedes","Travego","2017","3.6","100.000","43","2");
	static Minibus arac4 = new Minibus("Fiat","Ducato","2023","1.8","5052","16","Şehir İçi");
	
	public static void main(String[] args) 
	{
		KayitOl();
		Musteri musteri1 = new Musteri(İsim,Ehliyet);
		musteri1.MusteriBilgi();
		System.out.println("Kiralayabileceğiniz Araçlar \n");
		musteri1.AracKirala();
	}
	public static void KayitOl()
	{
		System.out.print("Adınız : ");
		İsim = KarakterAl();
		System.out.print("Ehliyetiniz(A-B-C-D) : ");
		Ehliyet = KarakterAl();
	}
	public static String KarakterAl()
	{
		Scanner scn = new Scanner(System.in);
		String Temp = scn.next();
		return Temp;
	}

	public static int SayiAl()
	{
		Scanner scn = new Scanner(System.in);
		int Temp = scn.nextInt();
		return Temp;
	}
}