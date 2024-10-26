package App;

import java.util.HashMap;
import java.util.Map;

public class Logowanie {

    private Map<String, Uzytkownik> uzytkownicy = new HashMap<>();
    private Uzytkownik zalogowanyUzytkownik;


    public void rejestracja (String nazwaUzytkownika, String haslo)
    {
        if(!uzytkownicy.containsKey(nazwaUzytkownika))
        {
            Uzytkownik nowyUzytkownik = new Uzytkownik(nazwaUzytkownika,haslo);
            uzytkownicy.put(nazwaUzytkownika,nowyUzytkownik);
            System.out.println("Rejestracja zakonczona sukcesem");
        }
        else
        {
            System.out.println("Uzytkownik o tej nazwie juz istnieje");
        }
    }
    public boolean logowanie (String nazwaUzytkownika, String haslo)
    {
        Uzytkownik uzytkownik = uzytkownicy.get(nazwaUzytkownika);
        if(uzytkownik!= null && uzytkownik.getHaslo().equals(haslo))
        {
            zalogowanyUzytkownik = uzytkownik;
            System.out.println("Logowanie zakonczone sukcesem");
            System.out.println();
            return true;
        }

        else
        {
            System.out.println("Nieprawidlowa nazwa uzytkownika lub haslo");
            System.out.println();
            return false;
        }
    }

    public Uzytkownik getZalogowanyUzytkownik()
    {
        return zalogowanyUzytkownik;
    }
    public void wylogowanie()
    {
        zalogowanyUzytkownik = null;
        System.out.println("Wylogowano pomyslnie");
    }


}
