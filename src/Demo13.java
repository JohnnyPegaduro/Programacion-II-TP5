class E13Usuario { private String nombre,email; public E13Usuario(String n,String e){nombre=n;email=e;} public String toString(){return nombre;} }
class E13CodigoQR { private String valor; private E13Usuario usuario; public E13CodigoQR(String v,E13Usuario u){valor=v;usuario=u;} public String toString(){return "QR{" + valor + " de " + usuario + "}";} }
class E13GeneradorQR { public void generar(String v,E13Usuario u){ E13CodigoQR qr=new E13CodigoQR(v,u); System.out.println("Generado: " + qr); } }
public class Demo13 { public static void run(){ System.out.println("-- Ejercicio 13 --"); E13Usuario u=new E13Usuario("Mati","m@x.com"); new E13GeneradorQR().generar("ABC-123", u);} 
    public static void main(String[] args) { run(); }
}
