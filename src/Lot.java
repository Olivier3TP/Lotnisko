public class Lot {
    private String miejsceDocelowe;
    private String miejsceWylotu;
    private String dataWylotu;
    private String czasLotu;
    private int liczbaDostepnychMiejsc;

    public String getDataWylotu() {
        return dataWylotu;
    }

    public void setDataWylotu(String dataWylotu) {
        this.dataWylotu = dataWylotu;
    }

    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    public void setMiejsceDocelowe(String miejsceDocelowe) {
        this.miejsceDocelowe = miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return miejsceWylotu;
    }

    public void setMiejsceWylotu(String miejsceWylotu) {
        this.miejsceWylotu = miejsceWylotu;
    }

    public String getCzasLotu() {
        return czasLotu;
    }

    public void setCzasLotu(String czasLotu) {
        this.czasLotu = czasLotu;
    }

    public int getLiczbaDostepnychMiejsc() {
        return liczbaDostepnychMiejsc;
    }

    public void setLiczbaDostepnychMiejsc(int liczbaDostepnychMiejsc) {
        this.liczbaDostepnychMiejsc = liczbaDostepnychMiejsc;
    }

    public static int getNumerLotu() {
        return numerLotu;
    }
}
