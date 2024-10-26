package App;

public class Uzytkownik {

     private String nazwaUzytkownika;
    private  String haslo;

    public Uzytkownik (String nazwaUzytkownika, String haslo)
    {
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
    }

    public String getNazwaUzytkownika() {
        return nazwaUzytkownika;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setNazwaUzytkownika(String nazwaUzytkownika) {

        if (nazwaUzytkownika.length() >= 3)
        {
            this.nazwaUzytkownika = nazwaUzytkownika;

        }

        else
        {
            System.out.println("Nazwa uzytkownika jest za krotka - powinna zawierac co najmniej 3 znaki.");
        }
    }

    public void setHaslo(String haslo) {
        if (haslo.length() >= 5)
        {
            this.haslo = haslo;
        }
        else
        {
            System.out.println("Haslo jest za krotkie- powinno zawierac co najmniej 5 znakow");
        }
    }
}
