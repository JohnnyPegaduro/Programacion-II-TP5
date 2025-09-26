class E08Usuario { private String nombre,email; public E08Usuario(String n,String e){nombre=n;email=e;} public String toString(){return "Usuario{" + nombre + "}";} }
class E08FirmaDigital { private String hash,fecha; private E08Usuario usuario; public E08FirmaDigital(String h,String f,E08Usuario u){hash=h;fecha=f;usuario=u;} public String toString(){return "Firma{" + hash + ", " + usuario + "}";} }
class E08Documento {
    private String titulo,contenido; private E08FirmaDigital firma;
    public E08Documento(String t,String c,String hash,String fecha,E08Usuario u){titulo=t;contenido=c;firma=new E08FirmaDigital(hash,fecha,u);}
    public String toString(){return "Documento{" + titulo + ", " + firma + "}";}
}
public class Demo08 { public static void run(){ System.out.println("-- Ejercicio 08 --"); E08Usuario u=new E08Usuario("Mati","m@x.com"); E08Documento d=new E08Documento("Contrato","...", "abc123","2025-09-01", u); System.out.println(d);} 
    public static void main(String[] args) { run(); }
}
