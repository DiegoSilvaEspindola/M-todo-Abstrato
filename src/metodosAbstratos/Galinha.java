package metodosAbstratos;

public class Galinha extends Animal {
    public Galinha(String especie, String nome, int idade) {
        super(especie, nome, idade);
    }
    public void fazBarulho(){
        System.out.println("Cocoricó");
    }
}
