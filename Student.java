import java.util.Scanner;

public class Student{
    Course ders1;
    Course ders2;
    Course ders3;
    String isim;
    String ogrenciNumarasi;
    String sinifi;
    double ortalama;
    boolean miGecti;


    Student(String isim, String ogrenciNumarasi,String sinifi,Course ders1, Course ders2, Course ders3){
        
        this.isim=isim;
        this.ogrenciNumarasi=ogrenciNumarasi;
        this.sinifi=sinifi;
        this.ders1=ders1;
        this.ders2=ders2;
        this.ders3=ders3;
        this.ortalama=0;
        this.miGecti=false;
        

    }

    void addBulSinavNotu(int note1,int note2,int note3){

        if(note1>=0 && note1<=100){
        ders1.note=note1;
        }

        if(note2>=0 && note2<=100){
            ders2.note=note2;
        }

        if(note3>=0 && note3<=100){
            ders3.note=note3;
        }

    }

    void miGecti(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tarih Yazili Notunuzu Girniz");
        int note1Yazili=scanner.nextInt();
        System.out.println("Tarih Sozlu Notunuzu Girniz");
        int note1Sozlu=scanner.nextInt();
        System.out.println("Fizik Yazili Notunuzu Girniz");
        int note2Yazili=scanner.nextInt();
        System.out.println("Fizik Sozlu Notunuzu Girniz");
        int note2Sozlu=scanner.nextInt();
        System.out.println("Kimya Yazili Notunuzu Girniz");
        int note3Yazili=scanner.nextInt();
        System.out.println("Kimya Sozlu Notunuzu Girniz");
        int note3Sozlu=scanner.nextInt();
        this.ders1.note=note1Sozlu * 0.2 +note1Yazili * 0.8;
        this.ders2.note=note2Sozlu * 0.2 +note2Yazili * 0.8;
        this.ders3.note=note3Sozlu * 0.2 +note3Yazili * 0.8;
        this.ortalama=(this.ders1.note+this.ders2.note+this.ders3.note)/3;
        if(this.ortalama>=55){
            System.out.println("Sinifi Basarili Sekilde Gectiniz");
            this.miGecti=true;
        }
        else{
            System.out.println("KALDINIZ !");
            this.miGecti=false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.ders1.name+ "Notu\t:"+this.ders1.note);
        System.out.println(this.ders2.name+ "Notu\t:"+this.ders2.note);
        System.out.println(this.ders3.name+ "Notu\t:"+this.ders3.note);
        System.out.println("Ortalamaniz\t:"+this.ortalama);
    }
}