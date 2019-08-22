package sas;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<InputData> inputData = readFromCSV();

        /*for (InputData i : inputData){
            System.out.println(i);
        }*/
    }


    public static Path pathToFile = Paths.get("C:\\Users\\Olek\\IdeaProjects\\SAS_zadanie\\src\\sas\\AGD_COMPLEX.csv");

    //metoda zczytująca dane z csv

    private static List<InputData> readFromCSV(){
        List<InputData> inputData = new ArrayList<>();
        //utf 8 ma polskie znaki
        try(BufferedReader buffer = Files.newBufferedReader(pathToFile, StandardCharsets.ISO_8859_1)){

            //czytam piewszą linię
            String line = buffer.readLine();

            //petla do konca pliku
            while(line != null){

                //rozdzielenie wartosci przez ',' biore pod uwage wartosci w apostrofach
                String[] lineCSV = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                //tworzę jeden obiekt data
                InputData singleInputData = createNewInputData(lineCSV);

                //i dodaje go do listy
                inputData.add(singleInputData);

                //czytam kolejna linie przed przejsciem petli dalej
                line = buffer.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        return  inputData;

    }

    //metoda tworząca jeden obiekt InputData

    private static InputData createNewInputData(String[] lineCSV){
        int rok = Integer.parseInt(lineCSV[0]);
        int kwartal = Integer.parseInt(lineCSV[1]);
        int miesiac = Integer.parseInt(lineCSV[2]);
        int tydzien = Integer.parseInt(lineCSV[3]);
        int dzienTygodnia = Integer.parseInt(lineCSV[4]);
        int dzien =  Integer.parseInt(lineCSV[5]);
        String data = lineCSV[6];
        char swieto = lineCSV[7].charAt(0);
        int produkt_ID = Integer.parseInt(lineCSV[8]);
        String kod = lineCSV[9];
        String producent = lineCSV[10];
        String grupa_produktowa = lineCSV[11];
        String kategoria = lineCSV[12];
        String miasto = lineCSV[13];
        String wojewodztwo = lineCSV[14];
        String region = lineCSV[15];
        String potencjal = lineCSV[16];
        String platnosc = lineCSV[17];
        String kanal = lineCSV[18];
        //puste wartości String zamieniam na '0' jako liczbe
        int ilosc = 0;
        try {
            if (lineCSV[19] != null) {
                ilosc = Integer.parseInt(lineCSV[19]);
            }
        }
        catch(NumberFormatException e){
            ilosc = 0;
        }
        //zamieniam "," na "." i usuwam nieliczbowe znaki
        double cena = 0;
        try {
            if(lineCSV[20] != null) {
                cena =  Double.parseDouble(lineCSV[20].replace(",", ".").replaceAll("[^0-9.]", ""));
            }
        }
        catch(NumberFormatException e){
            cena = 0;
        }
        double cena_sprzedazy = 0;
        try {
            if(lineCSV[21] != null) {
                cena_sprzedazy =  Double.parseDouble(lineCSV[20].replace(",", ".").replaceAll("[^0-9.]", ""));
            }
        }
        catch(NumberFormatException e){
            cena_sprzedazy = 0;
        }
        double koszt_zm = 0;
        try {
            if(lineCSV[22] != null) {
                koszt_zm =  Double.parseDouble(lineCSV[20].replace(",", ".").replaceAll("[^0-9.]", ""));
            }
        }
        catch(NumberFormatException e){
            koszt_zm = 0;
        }
        double koszt_st = 0;
        try {
            if(lineCSV[23] != null) {
                koszt_st =  Double.parseDouble(lineCSV[20].replace(",", ".").replaceAll("[^0-9.]", ""));
            }
        }
        catch(NumberFormatException e){
            koszt_st = 0;
        }
        double marza_br = 0;
        try {
            if(lineCSV[24] != null) {
                marza_br =  Double.parseDouble(lineCSV[20].replace(",", ".").replaceAll("[^0-9.]", ""));
            }
        }
        catch(NumberFormatException e){
            marza_br = 0;
        }
        float promocja = 0;
        try {
            if(lineCSV[25] != null) {
                promocja = Float.parseFloat(lineCSV[25].replace(",", ".").replaceAll("[^0-9.]", ""));
            }
        }
        catch(NumberFormatException e){
            promocja = 0;
        }
        int powiat_ID =Integer.parseInt(lineCSV[26]);
        int wojew_ID = Integer.parseInt(lineCSV[27]);

        return new InputData(
                rok,
                kwartal,
                miesiac,
                tydzien,
                dzienTygodnia,
                dzien,
                data,
                swieto,
                produkt_ID,
                kod,
                producent,
                grupa_produktowa,
                kategoria,
                miasto,
                wojewodztwo,
                region,
                potencjal,
                platnosc,
                kanal,
                ilosc,
                cena,
                cena_sprzedazy,
                koszt_zm,
                koszt_st,
                marza_br,
                promocja,
                powiat_ID,
                wojew_ID
        );
    }
}

