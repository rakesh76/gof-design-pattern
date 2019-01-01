package com.gof.design.pattern.creational.builder.home;


// This is Final Product
public class House {

    private String foundation;
    private String stracture;
    private String roof;
    private boolean furnished;
    private boolean paintings;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStracture(String stracture) {
        this.stracture = stracture;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    public void setPaintings(boolean paintings) {
        this.paintings = paintings;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", stracture='" + stracture + '\'' +
                ", roof='" + roof + '\'' +
                ", furnished=" + furnished +
                ", paintings=" + paintings +
                '}';
    }
}
