package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro1 = new Livros("O problema dos 3 corpos", 300);
        System.out.println(livro1);

/*        int a = 5;
        int b = 3;
        System.out.println("Hello Word! " + (a+b));*/
    }
}
class Livros{
    private String nome;
    private Integer numPag;

    public Livros(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}