class E03Autor { private String nombre, nacionalidad; public E03Autor(String n,String na){nombre=n;nacionalidad=na;} public String toString(){return "Autor{" + nombre + "}";} }
class E03Editorial { private String nombre, direccion; public E03Editorial(String n,String d){nombre=n;direccion=d;} public String toString(){return "Editorial{" + nombre + "}";} }
class E03Libro {
    private String titulo, isbn; private E03Autor autor; private E03Editorial editorial;
    public E03Libro(String t,String i,E03Autor a,E03Editorial e){titulo=t;isbn=i;autor=a;editorial=e;}
    public String toString(){ return "Libro{" + titulo + ", " + autor + ", " + editorial + "}"; }
}
public class Demo03 {
    public static void run(){
        System.out.println("-- Ejercicio 03 --");
        E03Autor a = new E03Autor("Borges","AR");
        E03Editorial e = new E03Editorial("Sudamericana","CABA");
        E03Libro l = new E03Libro("Ficciones","978-xx", a, e);
        System.out.println(l);
    }

    public static void main(String[] args) { run(); }
}
