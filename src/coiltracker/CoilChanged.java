package coiltracker;

import java.io.Serializable;

public class CoilChanged implements Serializable {

    private Mods name;
    private String dateChanged;

    public CoilChanged() {
        this.name = Mods.Pockex1;
        this.dateChanged = "";
    }

    public CoilChanged(Mods name, String dateChanged) {
        this.name = name;
        this.dateChanged = dateChanged;
    }

    public Mods getName() {
        return name;
    }

    public void setName(Mods name) {
        this.name = name;
    }



    public String getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s", this.name, this.dateChanged);
    }

}
