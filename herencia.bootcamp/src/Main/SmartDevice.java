package Main;

public class SmartDevice {

    private String marca;
    private String modelo;
    private int year;
    private String color;

    public SmartDevice(String marca, String modelo, int year, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
    }
    public SmartDevice(){
    super();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
