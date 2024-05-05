
public class Rezerwacja extends SystemZaklepywaniaLotow{
    private String imie;
    private String nazwisko;
    private String pesel;
    private String numerTelefonu;
    private final float cenaBiletu;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }


    public float getCenaBiletu() {
        return cenaBiletu;
    }

    public Rezerwacja(String imie, String nazwisko, String pesel, String numerTelefonu, float cenaBiletu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.numerTelefonu = numerTelefonu;
        this.cenaBiletu = cenaBiletu;
    }
    @Override
    public String toString() {
        return String.format("Imie: %s, Nazwisko: %s, Pesel: %s, Numer telefonu: %s, Cena biletu: %f", imie, nazwisko, pesel, numerTelefonu, cenaBiletu);
    }
}
