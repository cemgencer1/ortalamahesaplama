import java.util.Scanner;
public class ortalama {
    public static void main(String[] args)
    {
int mat,fizik,kimya,turkce,tarih,muzik;
Scanner inp = new Scanner(System.in);

System.out.print("Matematik Ders Notunuzu Giriniz :");
mat = inp.nextInt();

System.out.print("Fizik Ders Notunuzu Giriniz :");
fizik = inp.nextInt();

System.out.print("Kimya Ders Notunuzu Giriniz :");
kimya = inp.nextInt();

System.out.print("Türkçe Ders Notunuzu Giriniz :");
turkce =inp.nextInt();

System.out.print("Tarih Ders Notunuzu Giriniz :");
tarih = inp.nextInt();

System.out.print("Müzik Ders Notunuzu Giriniz :");
muzik = inp.nextInt();

int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
double sonuc = toplam / 6 ;
System.out.print("Derslerinizin Notlatının Ortalaması :" + sonuc);

boolean ortalama = sonuc >= 60 ;
String str = ortalama ? "Sınıfınızı Geçtiniz" : "Sınıfta Kaldınz";
System.out.println(str);
    }
}



