package coiltracker;

import java.io.Serializable;

public class CoilChanged implements Serializable {

    private String name;
    private String dateChanged;

    public CoilChanged() {
        this.name = "";
        this.dateChanged = "";
    }

    public CoilChanged(String name, String dateChanged) {
        this.name = name;
        this.dateChanged = dateChanged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
