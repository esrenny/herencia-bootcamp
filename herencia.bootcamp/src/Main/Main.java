package Main;

import herencia.SmartPhone;
import herencia.SmartWatch;

public class Main {

    public static void main (String[] args){
        SmartPhone phone1 = new SmartPhone("LG","P15",2021,"Negro","Android",2000);
        SmartPhone phone2 = new SmartPhone("Samsung","A51",2022,"Azul","Android",3000);
        SmartWatch watch1 = new SmartWatch("Alcatel","KK31",2022,"Azul",true,false);
        SmartWatch watch2 = new SmartWatch("Apple","A2022",2022,"Blanco",true,true);

        System.out.println(phone1.toString());
        System.out.println(watch1.toString());

    }
}
