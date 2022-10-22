package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroProgram {
    public static void main(String[] args) {

        Gato gato= new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro(" O problema", 300);
        System.out.println(livro1);
        /*int a =5;
        int b =3;

        System.out.println("Hello word" + (a+b));*/
    }
}

class Livro
{
    private String name;
    private Integer numPag;

    public Livro(String name, Integer numPag) {
        this.name = name;
        this.numPag = numPag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}