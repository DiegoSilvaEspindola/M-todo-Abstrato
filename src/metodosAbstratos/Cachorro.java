package metodosAbstratos;

public class Cachorro extends Animal {
    public Cachorro(String especie, String nome, int idade) {
        super(especie, nome, idade);
    }

    public void fazBarulho(){
        System.out.println("Auau, Auau");
    }
}
