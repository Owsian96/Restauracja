import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main {
    static int mealNumber = 0;
    static int choice=0;
    static int[][] order = new int[2][18];
    static int price;
    static String word;

    public  static void PizzaAddon() {

        int pizzaAddon;
        System.out.println("Każdy dodatek kosztuje 2 ZŁ");
        System.out.println("Czy chcesz dodatkowo podwójny ser ? 1 -> Tak 2 -> Nie");
        pizzaAddon = scan.nextInt();
        if(pizzaAddon==1) order[1][4]+=1;
        System.out.println("Czy chcesz dodatkowo salami ? 1 -> Tak 2 -> Nie");
        pizzaAddon = scan.nextInt();
        if(pizzaAddon==1) order[1][5]+=1;
        System.out.println("Czy chcesz dodatkowo szynkę ? 1 -> Tak 2 -> Nie");
        pizzaAddon = scan.nextInt();
        if(pizzaAddon==1) order[1][6]+=1;
        System.out.println("Czy chcesz dodatkowo pieczarki ? 1 -> Tak 2 -> Nie");
        pizzaAddon = scan.nextInt();
        if(pizzaAddon==1) order[1][7]+=1;
        Clear();
    }

    public  static void MainMealAddon() {
        Clear();
        int mainMealAddon;
        System.out.println("Czy chcesz dodatkowo otrzymać bar sałatkowy - 5 ZŁ ? 1 -> Tak 2 -> Nie");
        mainMealAddon = scan.nextInt();
        if(mainMealAddon==1) order[1][11]+=1;
        System.out.println("Czy chcesz zestaw sosow - 6 ZŁ? 1 -> Tak 2 -> Nie");
        mainMealAddon = scan.nextInt();
        if(mainMealAddon==1) order[1][12]+=1;
    }



        public static void Zapisz () throws FileNotFoundException
        {
            try {
            PrintWriter zapis = new PrintWriter("zamowienie.txt");
            zapis.println("Zamowienie");
            for (int i = 0; i < 2; i++) {
                zapis.println();
                for (int j = 0; j < 18; j++)
                {
                    zapis.print(order[i][j]+",");
                }

            }
            zapis.println();
            zapis.println(price+"ZŁ");
            zapis.println(word);


        zapis.close();
        }
        catch (Exception e) {
        System.out.println("Something went wrong.");
        }
        }




public static Scanner scan = new Scanner(System.in);
public static void main(String[] args) throws FileNotFoundException {





        order[0][0]=20;   order[1][0]=0;
        order[0][1]=22 ;  order[1][1]=0;
        order[0][2]=25;   order[1][2]=0;
        order[0][3]=25;   order[1][3]=0;
        order[0][4]=2 ;   order[1][4]=0;
        order[0][5]=2 ;   order[1][5]=0;
        order[0][6]=2 ;   order[1][6]=0;
        order[0][7]=2 ;   order[1][7]=0;
        order[0][8]=30 ;  order[1][8]=0;
        order[0][9]=28 ;  order[1][9]=0;
        order[0][10]=27;  order[1][10]=0;
        order[0][11]=5 ;  order[1][11]=0;
        order[0][12]=6 ;  order[1][12]=0;
        order[0][13]=12;  order[1][13]=0;
        order[0][14]=10;  order[1][14]=0;
        order[0][15]=5 ;  order[1][15]=0;
        order[0][16]=5 ;  order[1][16]=0;
        order[0][17]=5 ;  order[1][17]=0;

        while(choice!=6)
        {

        WypiszMenu();
        price=Bill(order);
        System.out.println("Kwota : " + price + " ZŁ");
        System.out.println("6 - Zamów");

        choice = scan.nextInt();
        if(choice!=6) Choice(choice);

        }
        Zapisz();

        }


public static void WypiszMenu() {
        Clear();
        System.out.println();
        System.out.println("1 - Pizza");
        System.out.println("Margheritta                             20 ZŁ");
        System.out.println("Vegetariana                             22 ZŁ");
        System.out.println("Tosca                                   25 ZŁ");
        System.out.println("Venecia                                 25 ZŁ");

        System.out.println();
        System.out.println("2 - Dania główne");
        System.out.println("Schabowy z frytkami/ryżem/ziemniakami   30 ZŁ");
        System.out.println("Ryba z frytkami                         28 ZŁ");
        System.out.println("Placek po węgiersku                     27 ZŁ");

        System.out.println();
        System.out.println("3 - Zupy");
        System.out.println("Pomidorowa                              12 ZŁ");
        System.out.println("Rosół                                   10 ZŁ");

        System.out.println();
        System.out.println("4 - Napoje                               5 ZŁ");
        System.out.println("Kawa");
        System.out.println("Herbata");
        System.out.println("Cola");

        System.out.println();
        System.out.println("5 - Uwagi do zamówienia");
        }

public static void Choice(int number)
        {
        switch (number) {
        case 1:
        Clear();

        System.out.println("Pizza");
        System.out.println("1 - Margheritta                             20 ZŁ");
        System.out.println("2 - Vegetariana                             22 ZŁ");
        System.out.println("3 - Tosca                                   25 ZŁ");
        System.out.println("4 - Venecia                                 25 ZŁ");

        int pizzaChoice;
        pizzaChoice = scan.nextInt();

        switch (pizzaChoice) {
        case 1:
        Clear();
        System.out.println("Margheritta");
        System.out.println("Wybierz Dodatki");
        order[1][0]+=1;
        PizzaAddon();
        break;

        case 2:
        Clear();
        System.out.println("Vegetariana");
        System.out.println("Wybierz Dodatki");
        order[1][1]+=1;
        PizzaAddon();
        break;

        case 3:
        Clear();
        System.out.println("Tosca");
        System.out.println("Wybierz Dodatki");
        order[1][2]+=1;
        PizzaAddon();
        break;

        case 4:
        Clear();
        System.out.println("Venecia");
        System.out.println("Wybierz Dodatki");
        order[1][3]+=1;
        PizzaAddon();
        break;

        case 5:
        Clear();

default:
        System.out.println("Wybierz jedna z podanych możliwości.");
        break;
        }
        break;


        case 2:
        Clear();

        System.out.println("Dania główne");
        System.out.println("1 - Schabowy z frytkami/ryżem/ziemniakami   30 ZŁ");
        System.out.println("2 - Ryba z frytkami                         28 ZŁ");
        System.out.println("2 - Placek po węgiersku                     27 ZŁ");

        int mainMealChoice;
        mainMealChoice = scan.nextInt();

        switch (mainMealChoice) {
        case 1:
        Clear();
        System.out.println("Wybrano Schabowy z frytkami/ryżem/ziemniakami");
        System.out.println("Wybierz dodatki");
        order[1][8]+=1;
        MainMealAddon();
        break;

        case 2:
        Clear();
        System.out.println("Wybrano Ryba z frytkami ");
        System.out.println("Wybierz dodatki");
        order[1][9]+=1;
        MainMealAddon();
        break;

        case 3:
        Clear();
        System.out.println("Wybrano Placek po węgiersku");
        System.out.println("Wybierz dodatki");
        order[1][10]+=1;
        MainMealAddon();
        break;

        case 4:
        Clear();
        System.out.println("Zrezygnowano");
        break;

default:
        Clear();
        System.out.println("Wybierz odpowiedni numer");
        break;
        }

        break;
        case 3:
        Clear();

        System.out.println("Zupy");
        System.out.println("1 - Pomidorowa                              12 ZŁ");
        System.out.println("2 - Rosół                                   10 ZŁ");

        int soupChoice;
        soupChoice = scan.nextInt();
        switch (soupChoice){
        case 1:
        Clear();
        System.out.println("Wybrano Pomidorowa");
        order[1][13]+=1;

        break;

        case 2:
        Clear();
        System.out.println("Wybrano Pomidorowa");
        order[1][14]+=1;
        break;

        case 3:
        Clear();
        System.out.println("Zrezygnowano");
        break;

default:
        Clear();
        System.out.println("Wybierz odpowiedni numer");
        break;
        }

        break;
        case 4:
        Clear();

        System.out.println("Napoje                               5 ZŁ");
        System.out.println("1 - Kawa");
        System.out.println("2 - Herbata");
        System.out.println("3 - Cola");

        int drinkChoice;
        drinkChoice = scan.nextInt();
        switch (drinkChoice){
        case 1:
        Clear();
        System.out.println("Kawe");
        System.out.println("Dodaj do kosztow");
        order[1][15]+=1;
        break;

        case 2:
        Clear();
        System.out.println("Herbate");
        System.out.println("Dodaj do kosztow");
        order[1][16]+=1;
        break;

        case 3:
        Clear();
        System.out.println("Wybrano Cole");
        System.out.println("Wybrano Pomidorowa");
        order[1][17]+=1;
        break;

        case 4:
        Clear();
        System.out.println("Zrezygnowano");
        break;

default:
        Clear();
        System.out.println("Wybierz odpowiedni numer");
        break;
        }

        break;
        case 5:
        scan.nextLine();
        System.out.println("Wprowadz swoje uwagi, wcześniej dodane uwagi zostaną nadpisane");
        word = scan.nextLine();
        break;

default:
        Clear();
        System.out.println("Wybierz jeden z możliwych wyborów");
        }
        }

public static void Clear()
        {
        for(int i=0; i<40; i++)
        {
        System.out.println();
        }
        }

public static int Bill(int tab[][])
        {
        int bill=0;
        for(int i=0; i<=17; i++)
        {
        bill=bill+(tab[0][i]*tab[1][i]);
        }
        return bill;

        }




        }

