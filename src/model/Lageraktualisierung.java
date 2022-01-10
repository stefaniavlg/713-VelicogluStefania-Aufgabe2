package model;

import java.time.LocalDate;
import java.util.List;

public class Lageraktualisierung {

    private LocalDate date;
    private List<Produkt> produktList;

    public Lageraktualisierung(LocalDate date, List<Produkt> produktList) {
        this.date = date;
        this.produktList = produktList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Produkt> getProduktList() {
        return produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }
}
