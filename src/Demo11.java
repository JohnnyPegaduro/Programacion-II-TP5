class E11Artista { private String nombre,genero; public E11Artista(String n,String g){nombre=n;genero=g;} public String toString(){return nombre;} }
class E11Cancion { private String titulo; private E11Artista artista; public E11Cancion(String t,E11Artista a){titulo=t;artista=a;} public String toString(){return "Cancion{" + titulo + " de " + artista + "}";} }
class E11Reproductor { public void reproducir(E11Cancion c){ System.out.println("▶ Reproduciendo: " + c); } }
public class Demo11 { public static void run(){ System.out.println("-- Ejercicio 11 --"); E11Artista a=new E11Artista("Soda Stereo","Rock"); E11Cancion c=new E11Cancion("De Música Ligera", a); new E11Reproductor().reproducir(c);} 
    public static void main(String[] args) { run(); }
}
