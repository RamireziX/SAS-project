package sas;

public class OutputData {

    private String grupa_produktowa;
    private String platnosc;
    private String wojewodztwo;
    private String miesiac_i_rok;
    private float sprzedazSr;
    private float sprzedazMed;
    private float sprzedazMin;
    private float sprzedazMax;
    private float sprzedazOdch;

    public OutputData(
            String grupa_produktowa,
            String platnosc,
            String wojewodztwo,
            String miesiac_i_rok,
            float sprzedazSr,
            float sprzedazMed,
            float sprzedazMin,
            float sprzedazMax,
            float sprzedazOdch
    )
    {
        this.grupa_produktowa = grupa_produktowa;
        this.platnosc = platnosc;
        this.wojewodztwo = wojewodztwo;
        this.miesiac_i_rok = miesiac_i_rok;
        this.sprzedazSr = sprzedazSr;
        this.sprzedazMed = sprzedazMed;
        this.sprzedazMin = sprzedazMin;
        this.sprzedazMax = sprzedazMax;
        this.sprzedazOdch = sprzedazOdch;
    }
}
