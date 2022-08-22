package herencia;

import Main.SmartDevice;

public class SmartWatch extends SmartDevice {

    boolean conPodometro;
    boolean respMail;

    public SmartWatch(String marca, String modelo, int year, String color, boolean conPodometro, boolean respMail) {
        super(marca, modelo, year, color);
        this.conPodometro = conPodometro;
        this.respMail = respMail;
    }

    public SmartWatch(boolean conPodometro, boolean respMail) {
        this.conPodometro = conPodometro;
        this.respMail = respMail;
    }
    public SmartWatch(){

    }

    public boolean isConPodometro() {
        return conPodometro;
    }

    public void setConPodometro(boolean conPodometro) {
        this.conPodometro = conPodometro;
    }

    public boolean isRespMail() {
        return respMail;
    }

    public void setRespMail(boolean respMail) {
        this.respMail = respMail;
    }


}
