package metodosAbstratos;

public abstract class Animal {
    protected String especie;
    protected String nome;
    protected int idade;

    public Animal(String especie, String nome, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }
    public abstract void fazBarulho();

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
