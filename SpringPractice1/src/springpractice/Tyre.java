package springpractice;

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
        return "Tyre{" +
                "tyreBrand='" + tyreBrand + '\'' +
                '}';
    }
}
