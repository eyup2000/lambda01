package LambdaCourse;

public class Utils {
    public static void elemanlariAyniSatirdaBirBoslukBirakarakYazdir(Object w){
        System.out.print( w+" ");
    }

    public static Boolean ciftSayilariYazdir(int a){
        return a%2==0;

    }

    public static Boolean tekSayilariYazdir(int a){
        return a%2!=0;

    }

    public static Integer sayininKaresiniAl(int a){
        return a*a;

    }
    public static Integer sayininkupunuAl(int a){
        return a*a*a;

    }
    public static Double sayininYarisiniAl(int a){
        return a/2.0;

    }

    public static Integer rakamlarToplami(int a){
        int toplam=0;
        while (a!=0){
            toplam = toplam + a%10;
            a = a/10;
        }
    return toplam;
    }
}
