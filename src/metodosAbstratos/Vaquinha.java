package metodosAbstratos;

public class Vaquinha extends Animal {
    public Vaquinha(String especie, String nome, int idade) {
        super(especie, nome, idade);
    }
    public void fazBarulho(){
        System.out.println("Muuu");
    }
}
