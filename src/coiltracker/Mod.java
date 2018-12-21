package coiltracker;

import java.io.Serializable;
import java.util.ArrayList;

public class Mod implements Serializable {
    
            ArrayList<Mod> mod = new ArrayList<>();

    private String name;

    public Mod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Mod> getMod() {
        return mod;
    }

    public void setMod(ArrayList<Mod> mod) {
        this.mod = mod;
    }
    
    

    @Override
    public String toString() {
        return String.format("%s",this.name);
    }
    
    

}
