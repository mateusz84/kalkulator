import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
        int pierwsza_l;
        int druga_l;
        char znak;
        Scanner wej = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        pierwsza_l = wej.nextInt();
        System.out.println("podaj drugą liczbe:");
        druga_l = wej.nextInt();

        System.out.println("dodawanie dwóch liczb + ");
        System.out.println("odejmowanie dwóch liczb + ");
        System.out.println("mnozenie dwóch liczb * ");
        System.out.println("dzielenie dwóch liczb / ");
        System.out.println("operacja modulo dwóch liczb % ");

        znak = wej.next().charAt(0);
        switch(znak)
        {
            case '+':
            {
                System.out.println(pierwsza_l + druga_l);
            }
            case '-':
            {
                System.out.println(pierwsza_l - druga_l);
            }
            case '*':
            {
                System.out.println(pierwsza_l * druga_l);
            }
            case '/':
            {
                if(druga_l !=0) {
                    System.out.println(pierwsza_l / druga_l + "oraz reszty:" + pierwsza_l % druga_l);
                }
                else {
                    System.out.println("nie dzielimy przez zero!!");
                }
                break;
                }
            case'%':
            {
                if(druga_l !=0) {
                    System.out.println(pierwsza_l % druga_l);
                }
                else
                {
                    System.out.println("nie dzielimy przez zero!!!");
                }
            }
        }



    }
}