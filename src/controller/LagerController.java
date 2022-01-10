package controller;

import model.Lageraktualisierung;
import model.Produkt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LagerController {

    private List<Lageraktualisierung> lageraktualisierungList = new ArrayList<>();
    private List<Produkt> produktList = new ArrayList<>();

    /**
     * Finding lageraktualiesierung on the specified date
     * @param date - date of the Aktualisierung
     * @return - Lageraktusalisierung
     */
    public Lageraktualisierung findLagerakutalisierung(LocalDate date){
        for(Lageraktualisierung lageraktualisierung:lageraktualisierungList){
            if(lageraktualisierung.getDate().equals(date))
                return lageraktualisierung;
        }
        return null;
    }

    /**
     * Finding the produkt with the name specified
     * @param name of searched produkt
     * @return produkt
     */
    public Produkt findProdukt(String name){
        for(Produkt produkt:produktList){
            if(produkt.getName().equalsIgnoreCase(name))
                return produkt;
        }
        return null;
    }



}
