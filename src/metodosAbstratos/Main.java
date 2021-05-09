package metodosAbstratos;

public class Main {
    public static void main(String args[]){

        Cachorro cachorro = new Cachorro("Canis familiaris", "Bob",9);
        System.out.println(cachorro);
        cachorro.fazBarulho();

        Vaquinha vaquinha= new Vaquinha(" B. taurus", "Mimosa",12);
        System.out.println(vaquinha);
        vaquinha.fazBarulho();

        Galinha galinha = new Galinha(" G. gallus", "Carijó", 12);
        System.out.println(galinha);
        galinha.fazBarulho();
    }
}
