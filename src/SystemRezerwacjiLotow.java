import java.util.ArrayList;
import java.util.List;
public interface SystemRezerwacjiLotow {

    void rezerwacja(Lot lot);
    void anulowanieRezerwacji(Lot lot);
    void wyszukiwanieLotow(List<Lot> loty);
    void wyswietl();


}