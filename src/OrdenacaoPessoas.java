import java.util.*;

public class OrdenacaoPessoas {
    static ArrayList<Pessoa> grupo = new ArrayList<>();

    public static void main(String[] args) {
        // Adicionando pessoas à lista
        adicionarPessoa("Alice", 20, 1.56);
        adicionarPessoa("Bob", 30, 1.80);
        adicionarPessoa("Charlie", 25, 1.70);
        adicionarPessoa("David", 17, 1.56);

        System.out.println("---------------------------------------------");
        System.out.println(grupo);
        System.out.println("---------------------------------------------");
        ordenarPorIdade();
        System.out.println(grupo);
        System.out.println("---------------------------------------------");
        ordenarPorAltura();
        System.out.println(grupo);
        System.out.println("---------------------------------------------");

    }

    public static void adicionarPessoa(String nome, int idade, double altura) {
        grupo.add(new Pessoa(nome,idade,altura));
    }

    public static void ordenarPorIdade() {
        Collections.sort(grupo);
    }

    public static void ordenarPorAltura(){
        Ordenacao ordenacao = new Ordenacao();
        grupo.sort(ordenacao);
    }

    static class Ordenacao implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa pessoa1, Pessoa pessoa2) {
            return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
        }
    }
}