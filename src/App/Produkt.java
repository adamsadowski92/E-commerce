package App;

public class Produkt {
    private String nazwa;
    private  double cena;
    private  String kategoria;

    public Produkt(String nazwa, double cena, String kategoria)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
    }

    public String getNazwa()
    {
        return nazwa;
    }

    public double getCena()
    {
        return cena;
    }

    public String getKategoria()
    {
        return kategoria;
    }

    public String toString()
    {
        return nazwa + "  " + cena + " PLN  " + kategoria + " ";
    }

}
