package web.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int series;

    @Column
    String brand;

    @Column
    String model;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(int series, String brand, String model) {
        this.series = series;
        this.brand = brand;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
