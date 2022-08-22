package herencia;

import Main.SmartDevice;

public class SmartPhone extends SmartDevice {

    String sistOperativo;
    int potenciaBatt;

    public SmartPhone(String marca, String modelo, int year, String color, String sistOperativo, int potenciaBatt) {
        super(marca, modelo, year, color);
        this.sistOperativo = sistOperativo;
        this.potenciaBatt = potenciaBatt;
    }

    public SmartPhone(String sistOperativo, int potenciaBatt) {

        this.sistOperativo = sistOperativo;
        this.potenciaBatt = potenciaBatt;
    }
    public SmartPhone(){

    }

    public String getSistOperativo() {
        return sistOperativo;
    }

    public void setSistOperativo(String sistOperativo) {
        this.sistOperativo = sistOperativo;
    }

    public int getPotenciaBatt() {
        return potenciaBatt;
    }

    public void setPotenciaBatt(int potenciaBatt) {
        this.potenciaBatt = potenciaBatt;
    }


}

