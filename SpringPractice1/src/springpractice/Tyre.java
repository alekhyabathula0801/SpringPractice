package springpractice;

import org.springframework.stereotype.Component;

public class Tyre {
    String tyreBrand;

    public Tyre(String tyreBrand) {
        this.tyreBrand = tyreBrand;
    }

    public String getTyreBrand() {
        return tyreBrand;
    }

    public void setTyreBrand(String tyreBrand) {
        this.tyreBrand = tyreBrand;
    }

    @Override
    public String toString() {
        return "tyre brand=" + tyreBrand;
    }
}
