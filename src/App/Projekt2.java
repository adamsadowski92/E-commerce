package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projekt2 {

    public static void main(String[] args){

        Logowanie systemLogowania = new Logowanie();
        Scanner scanner = new Scanner(System.in);


        while (true)
        {
            System.out.println("1. Zaloguj sie");
            System.out.println("2. Zarejestruj sie");
            int wybor = scanner.nextInt();
            scanner.nextLine();

            if (wybor == 1)
            {
                System.out.println("Podaj nazwe uzytkownika: ");
                String nazwaUzytkownika = scanner.nextLine();
                System.out.println("Podaj haslo: ");
                String haslo = scanner.nextLine();

                if(systemLogowania.logowanie(nazwaUzytkownika,haslo))
                {
                    break;
                }

            } else if (wybor == 2) {

                System.out.println("Podaj nazwe uzytkownika: ");
                String nowyUzytkownik = scanner.nextLine();
                System.out.println("Podaj haslo: ");
                String noweHaslo = scanner.nextLine();

                systemLogowania.rejestracja(nowyUzytkownik,noweHaslo);

            }

        }

        Uzytkownik zalogowanyUzytkownik = systemLogowania.getZalogowanyUzytkownik();
        System.out.println(" Witaj " + zalogowanyUzytkownik.getNazwaUzytkownika() +" !!!");


        Koszyk koszyk = new Koszyk();

        List<Produkt> produktyDostepne = new ArrayList<>();
        produktyDostepne.add(new Produkt("Laptop",3000, "Elektronika"));
        produktyDostepne.add(new Produkt("Telefon",2000, "Elektronika"));
        produktyDostepne.add(new Produkt("Bluza",500, "Odziez"));
        produktyDostepne.add(new Produkt("Klej do tapet",18.99, "Budowlanka"));
        produktyDostepne.add(new Produkt("Stol ogrodowy",1400.99, "Dom i ogrod"));



        while (true)
        {
            System.out.println("\n------ MENU -------- ");
            System.out.println();

            System.out.println("1. Dodaj produkty do koszyka");
            System.out.println("2. Usun produkty z koszyka");
            System.out.println("3. Wyswietl koszyk");
            System.out.println("4. Zloz zamowienie");
            System.out.println("5. Wyloguj sie i zakoncz");

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch(wybor)
            {
                case 1:
                    System.out.println("Dostepne produkty: ");
                    for (int i = 0; i<produktyDostepne.size(); i++)
                    {
                        Produkt produkt = produktyDostepne.get(i);
                        System.out.println((i+1) + ". " + produkt.getNazwa() + " - " + produkt.getCena() + " PLN");
                    }
                    System.out.println("Wybierz nr produktu do dodania ");
                    int wybranyProdukt = scanner.nextInt();
                    scanner.nextLine();

                    if(wybranyProdukt > 0 && wybranyProdukt <= produktyDostepne.size())
                    {
                        Produkt produktDoDodania = produktyDostepne.get(wybranyProdukt - 1);
                        koszyk.dodajProdukt(produktDoDodania);
                    }
                    else
                    {
                        System.out.println("Nieprawidlowy wybor produktu");
                    }
                    break;

                case 2:
                    if (koszyk.produktyKoszyk.isEmpty())
                    {
                        System.out.println("Koszyk jest pusty");
                    }
                    else
                    {
                        System.out.println("Produkty w koszyku: ");
                        for (int i = 0; i < koszyk.produktyKoszyk.size(); i++ )
                        {
                            System.out.println((i+1) + ". " + koszyk.produktyKoszyk.get(i));
                        }
                        System.out.println("Podaj numer produktu do usuniecia");
                        int wybranyProduktdoUsuniecia = scanner.nextInt();
                        scanner.nextLine();

                        if(wybranyProduktdoUsuniecia > 0 && wybranyProduktdoUsuniecia <= koszyk.produktyKoszyk.size())
                        {
                            Produkt produktDoUsuniecia = koszyk.produktyKoszyk.get(wybranyProduktdoUsuniecia-1);
                            koszyk.usunProdukt(produktDoUsuniecia);
                        }
                        else
                        {
                            System.out.println("Nieprawidlowy numer produktu");
                        }
                        break;

                    }

                case 3:
                    koszyk.wyswietlKoszyk();
                    break;

                case 4:
                    Zamowienie zamowienie = new Zamowienie(koszyk);
                    zamowienie.zlozZamowienie();
                    break;

                case 5:
                    systemLogowania.wylogowanie();
                    return;

                default:
                    System.out.println("Nieprawidlowy wybor");

            }





            }


        }



    }


