package springpractice;

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
        return "Tyre{" +
                "tyreBrand='" + tyreBrand + '\'' +
                '}';
    }
}
