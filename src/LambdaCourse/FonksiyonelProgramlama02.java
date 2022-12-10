package LambdaCourse;

import java.util.ArrayList;
import java.util.List;

public class FonksiyonelProgramlama02 {
    /*
    Method Refarance :  Class ismi :: Method ismi (method parantezleri yoktur () )
     orn:
        String :: length
        ArrayList :: size


     */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(14);
        liste.add(7);
        liste.add(8);
        liste.add(68);
        liste.add(5);
        liste.add(90);
        liste.add(3);
        liste.add(6);
        liste.add(54);
        liste.add(15);

        System.out.println(liste);

        elemanlariAyniSatirdaYazdir(liste);
        System.out.println();

        ciftSayılarıAynıSatirdaYazdir(liste);
        System.out.println();

        tekSayılarinKupunuAl(liste);
        System.out.println();

        kupleriToplami(liste);
        System.out.println();

        minSayiDegeri(liste);
        System.out.println();

        // 1.soru= list elemanları bir bosluk bırakarak aynı satırda yazdıran bir method olusturun ( functional)

    }
    // 1.soru= list elemanları bir bosluk bırakarak aynı satırda yazdıran bir method olusturun ( functional)
public static void elemanlariAyniSatirdaYazdir(List<Integer> liste){
        liste.stream().forEach(Utils::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);
}

public static void ciftSayılarıAynıSatirdaYazdir(List<Integer> liste){
        liste.stream().filter(Utils::ciftSayilariYazdir).forEach(Utils::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);
}

//tek sayilarin kupunu alan ve aynı satirdaa yazdiran bir method yaziniz
    public static void tekSayılarinKupunuAl(List<Integer> liste){
        liste.stream().filter(Utils::tekSayilariYazdir).map(Utils::sayininkupunuAl).forEach(Utils::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);
    }

// Çift sayilarin kupleri toplami yazdiran bir kod
    public static void kupleriToplami(List<Integer> liste){
     Integer toplam = liste.stream().filter(Utils::ciftSayilariYazdir).map(Utils::sayininkupunuAl).reduce(0,Math::addExact);
        System.out.println(toplam);
    }

//List'in elemanlarından en küçük degeri bulan bir method oluşturunuz

public static void minSayiDegeri(List<Integer> liste){
    System.out.println(liste.stream().reduce(Integer.MAX_VALUE,Math::min));
}


}
