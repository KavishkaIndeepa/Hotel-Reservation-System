package Controller;

public class Meals {
    private String catogary;
    private String plane;
    private String price;
    public Meals() {

    }

    public Meals(String catogary, String plane, String price) {
        this.catogary = catogary;
        this.plane = plane;
        this.price = price;
    }



    public String getCatogary() {
        return catogary;
    }

    public void setCatogary(String catogary) {
        this.catogary = catogary;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
