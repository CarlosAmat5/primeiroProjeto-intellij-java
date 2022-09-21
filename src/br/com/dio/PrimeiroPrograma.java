package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livroHP = new Livro("Harry Potter", 300);
        System.out.println(livroHP);
        /*Livro livroHP = new Livro(nome: "HARRY POTTER", numPaginas: 300);
        System.out.println(livroHP);*/

         /*int a = 5;
        int b = 3;
             System.out.println("Fala quebrada! "+ (a+b));*/
    }
}

class Livro {
    private String nombre;
    private Integer numPaginas;

    public Livro(String nombre, Integer numPaginas) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nombre='" + nombre + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}