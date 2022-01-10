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

    /**
     * Adding a new Lageraktualisierung to the list
     * @param date of the aktualisierung
     */
    public void addLageraktualisierung(LocalDate date){
        lageraktualisierungList.add(new Lageraktualisierung(date,new ArrayList<>()));
    }

    /**
     * Adding new produkt
     * @param produktName
     * @param preis
     * @param sku
     * @param anzahl
     */
    public void addProdukt(String produktName, int preis, int sku, int anzahl){
        produktList.add(new Produkt(produktName,preis,sku,anzahl));

        }


    /**
     * Remove a specific Produkt if exist in list
     * @param
     * @return true if produkt has been removed and false if not in list
     */
    public boolean removeProdukt(String name){
        Produkt produkt = findProdukt(name);
        if(produkt==null)
            return false;
        produktList.remove(produkt);
        return true;
    }

    /**
     * Removes a specific lageraktualisierung
     * @param
     * @param
     * @return true if lageraktualisierung has been removed and false if not in list
     */
    public boolean removeLageraktualisierung(LocalDate date,String name){
        Lageraktualisierung lageraktualisierung = findLagerakutalisierung(date);
        Produkt produkt = findProdukt(name);
        if(produkt==null)
            return false;
        var newProduktList = lageraktualisierung.getProduktList();
        newProduktList.remove(produkt);
        lageraktualisierung.setProduktList(newProduktList);
        return true;
    }

    /**
     * Update Lageraktualisierung
     * @param date
     * @param updatedLager
     * @return
     */
    public boolean updateLageraktualisierung(LocalDate date,Lageraktualisierung updatedLager){
        Lageraktualisierung lageraktualisierung = findLagerakutalisierung(date);
        if(lageraktualisierung==null)
            return false;
        lageraktualisierung.setDate(updatedLager.getDate());
        lageraktualisierung.setProduktList(updatedLager.getProduktList());
        return true;
    }

    /**
     * Update produkt
     * @param name
     * @param preis
     * @param sku
     * @param anzahl
     * @param updatedProdukt
     * @return
     */
    public boolean updateProdukt(String name, int preis, int sku, int anzahl, Produkt updatedProdukt){
        Produkt produkt = findProdukt(name);
        if(produkt==null)
            return false;
        produkt.setName(updatedProdukt.getName());
        produkt.setPreis(updatedProdukt.getPreis());
        produkt.setSku(updatedProdukt.getSku());
        produkt.setAnzahl(updatedProdukt.getAnzahl());

        return true;
    }

    public List<Produkt> getProduktList() {
        return produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }

}


