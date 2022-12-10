package LambdaCourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FonksiyonelProgramlama01  {
    /*
    1) Lambda Fonksiyonel bir programlamadır.
    2) Fonksiyonel programlama Java 8 once yoktu. dolayısıyla sonraki versiyonlarda lamba kullanılabilir.
       onceki versiyonlarda structrued programing kullanılıyordu. Java 8 den sonra hem yapıllanfırlımış hemde fonksiyonel programlama beraber kullanılır.

       3) Stractured programin bize bir şeyin nasıl yapılması gerektiği  fakat fonksiyonel programlama ise bize ne yapmamız gerktigini soyler.
       4)fonksiyonel programlama sadece collection ve Arrayslerle çalışıyor.





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
        System.out.println(liste);//[14, 11, 85, 16]

        elemanYazdır(liste);
        System.out.println();

        elemanYazdır01(liste);
        System.out.println();

        ciftYazdır(liste);
        System.out.println();

        ciftYazdır01(liste);
        System.out.println();

        ciftYazdırKareAl(liste);
        System.out.println();

        farklıTekSayılarınKupu(liste);
        System.out.println();

        tekSayılarınKupleriTopkamı(liste);
        System.out.println();

        enBuyukDeger(liste);
        System.out.println();

        ellidebBuyukCiftSayı(liste);
        System.out.println();

        ellidenBuyukEnKucukCiftSayı(liste);
        System.out.println();


    }

    //1.soru= list elemanları bir bosluk bırakarak aynı satırda yazdıran bir method olusturun ( structured)
    public static void elemanYazdır(List<Integer> liste) {
        for (Integer w : liste) {
            System.out.print(w + " ");
        }
    }

//lambda ile ;
// 1.soru= list elemanları bir bosluk bırakarak aynı satırda yazdıran bir method olusturun ( functional)

    public static void elemanYazdır01(List<Integer> liste) {
        liste.stream().forEach(t -> System.out.print(t + " "));
    }


//2-1 Liste elemenlarından cift olanları arada bir bosluk nurakarak bit methot oluşturun ( structured )

    public static void ciftYazdır(List<Integer> liste) {
        for (Integer w : liste) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }
//lambda ile ;
//2-2Liste elemenlarından cift olanları arada bir bosluk nurakarak bit methot oluşturun ( functional )

    public static void ciftYazdır01(List<Integer> liste) {
        liste.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //3. Liste elemanlarında cift olanların karalerini alabilen method oluşturun
    public static void ciftYazdırKareAl(List<Integer> liste) {
        liste.stream().filter(t -> t % 2 == 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //4. Liste elemanlarında birbirinden farklı olan tek sayıların kupunu alan ve aynı satırda yazdıran bir method oluşturun
    public static void farklıTekSayılarınKupu(List<Integer> liste) {
        // liste.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        /* daha hızlı çalışır */
        liste.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5. List elemanlarından birbirinden farklı olan tek sayıların kupunu alan ve bunlerı toplamını yazdıran bir method oluşturunuz
    public static void tekSayılarınKupleriTopkamı(List<Integer> liste) {
        Integer toplam = liste.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);
    }

    //6. List elemenlerınde en buyuk degeri bulrn bir method yazınız
    public static void enBuyukDeger(List<Integer> liste) {
        System.out.println(liste.stream().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u));
    }

    //7. elliden buyuk cift elemenalı yazıdr
    public static void ellidebBuyukCiftSayı(List<Integer> liste) {
        liste.stream().filter(t -> (t > 50 && t % 2 == 0)).forEach(t -> System.out.print(t + " "));
    }

    //8. 50'den buyuk en kucuk cift sayıyı yazdıran bir methodnoluşturun
    public static void ellidenBuyukEnKucukCiftSayı(List<Integer> liste) {
        //  System.out.println(liste.stream().filter(t->(t>50 && t%2==0)).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)-> u));
      Integer eleman = liste.stream().filter(t->(t>50 && t%2==0)).sorted().skip(1).findFirst().get();
        System.out.println(eleman);
    }
}