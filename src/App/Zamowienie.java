package App;

public class Zamowienie {

    private Koszyk koszyk;
    public Zamowienie(Koszyk koszyk)
    {
        this.koszyk = koszyk;
    }

    public void zlozZamowienie()
    {
        int liczbaProduktow = koszyk.produktyKoszyk.size();
        if(liczbaProduktow == 0)
        {
            System.out.println("Koszyk jest pusty, nie mozna zlozyc zamowienia");
        }
        else
        {
            System.out.println("Zamowienie zostalo zlozone. Laczna kwota to: " + koszyk.obliczCene() + " PLN");
            System.out.println("Liczba zamowionych produktow:  " + liczbaProduktow);
            koszyk.produktyKoszyk.clear();
            System.out.println("Koszyk zostal oprozniony");
        }
    }

    }

