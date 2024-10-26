package App;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {

    List<Produkt>produktyKoszyk = new ArrayList<>();

    public void dodajProdukt(Produkt produkt)
    {
     produktyKoszyk.add(produkt);
     System.out.println("Produkt " + produkt.getNazwa() + " zostal dodany do koszyka");
    }

    public void usunProdukt(Produkt produkt)
    {
        produktyKoszyk.remove(produkt);
        System.out.println("Produkt " + produkt.getNazwa() + " zostal usuniety z koszyka");
    }

    public double obliczCene()
    {
        double suma = 0;

        for(Produkt p: produktyKoszyk)
        {
            suma += p.getCena();
        }
        return suma;

    }

    public void wyswietlKoszyk()
    {
        if (produktyKoszyk.isEmpty())
        {
            System.out.println("Koszyk jest pusty");
        }
        else
        {
            for(Produkt p: produktyKoszyk)
            {
                System.out.println(p);
            }

            System.out.println("Suma produktow: " + obliczCene() + " PLN");
        }
    }

}
