package springpractice;

import org.springframework.stereotype.Component;

public class Tyre {

    String tyreBrand;

    public String getTyreBrand() {
        return tyreBrand;
    }

    public void setTyreBrand(String tyreBrand) {
        this.tyreBrand = tyreBrand;
    }

    @Override
    public String toString() {
        return "tyre " + tyreBrand+" brand ";
    }
}
