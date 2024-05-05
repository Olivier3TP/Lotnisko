import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Lot> loty = new ArrayList<Lot>();

        Lot lot_1 = new Lot("Warszawa", "Wroclaw", "01.12.2022", 140, 20);
        Lot lot_2 = new Lot("Berlin", "katowice", "02.02.2022", 180, 30);
        Lot lot_3 = new Lot("Amsterdam", "Gdansk", "07.11.2022", 240, 50);

        Rezerwacja julek = new Rezerwacja("Juliusz", "Slowacki", "12343223411", "123234321", 66);
        Rezerwacja adas = new Rezerwacja("Adam", "Mickiewicz", "15486225832", "1542653690", 120);

        loty.add(lot_1);
        loty.add(lot_2);
        loty.add(lot_3);

        julek.rezerwacja(lot_1);
        lot_1.wyswietl();
        julek.anulowanieRezerwacji(lot_1);
        adas.rezerwacja(lot_3);
        lot_3.wyswietl();
        adas.anulowanieRezerwacji(lot_3);
    }
}