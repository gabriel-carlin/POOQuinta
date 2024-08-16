package Encapsulamento;

public class ManipulaPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joãozinho");
        p.setIdade(999999);;
        System.out.println(p.mostraPessoa());
    }
}
