package sas;

public class InputData {

    private int rok;
    private int kwartal;
    private int miesiac;
    private int tydzien;
    private int dzienTygodnia;
    private int dzien;
    private String data;
    private char swieto;
    private int produkt_ID;
    private String kod;
    private String producent;
    private String grupa_produktowa;
    private String kategoria;
    private String miasto;
    private String wojewodztwo;
    private String region;
    private String potencjal;
    private String platnosc;
    private String kanal;
    private int ilosc;
    private double cena;
    private double cena_sprzedazy;
    private double koszt_zm;
    private double koszt_st;
    private double marza_br;
    private float promocja;
    private int powiat_ID;
    private int wojew_ID;

    //konstruktor

    public InputData(
            int rok,
            int kwartal,
            int miesiac,
            int tydzien,
            int dzienTygodnia,
            int dzien,
            String data,
            char swieto,
            int produkt_ID,
            String kod,
            String producent,
            String grupa_produktowa,
            String kategoria,
            String miasto,
            String wojewodztwo,
            String region,
            String potencjal,
            String platnosc,
            String kanal,
            int ilosc,
            double cena,
            double cena_sprzedazy,
            double koszt_zm,
            double koszt_st,
            double marza_br,
            float promocja,
            int powiat_ID,
            int wojew_ID
    ) {
        this.rok = rok;
        this.kwartal = kwartal;
        this.miesiac = miesiac;
        this.tydzien = tydzien;
        this.dzienTygodnia = dzienTygodnia;
        this.dzien = dzien;
        this.data = data;
        this.swieto = swieto;
        this.produkt_ID = produkt_ID;
        this.kod = kod;
        this.producent = producent;
        this.grupa_produktowa = grupa_produktowa;
        this.kategoria = kategoria;
        this.miasto = miasto;
        this.wojewodztwo = wojewodztwo;
        this.region = region;
        this.potencjal = potencjal;
        this.platnosc = platnosc;
        this.kanal = kanal;
        this.ilosc = ilosc;
        this.cena = cena;
        this.cena_sprzedazy = cena_sprzedazy;
        this.koszt_zm = koszt_zm;
        this.koszt_st = koszt_st;
        this.marza_br = marza_br;
        this.promocja = promocja;
        this.powiat_ID = powiat_ID;
        this.wojew_ID = wojew_ID;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "rok=" + rok +
                ", kwartal=" + kwartal +
                ", miesiac=" + miesiac +
                ", tydzien=" + tydzien +
                ", dzienTygodnia=" + dzienTygodnia +
                ", dzien=" + dzien +
                ", data='" + data + '\'' +
                ", swieto=" + swieto +
                ", produkt_ID=" + produkt_ID +
                ", kod='" + kod + '\'' +
                ", producent='" + producent + '\'' +
                ", grupa_produktowa='" + grupa_produktowa + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wojewodztwo='" + wojewodztwo + '\'' +
                ", region='" + region + '\'' +
                ", potencjal='" + potencjal + '\'' +
                ", platnosc='" + platnosc + '\'' +
                ", kanal='" + kanal + '\'' +
                ", ilosc=" + ilosc +
                ", cena=" + cena +
                ", cena_sprzedazy=" + cena_sprzedazy +
                ", koszt_zm=" + koszt_zm +
                ", koszt_st=" + koszt_st +
                ", marza_br=" + marza_br +
                ", promocja=" + promocja +
                ", powiat_ID=" + powiat_ID +
                ", wojew_ID=" + wojew_ID +
                '}';
    }
}