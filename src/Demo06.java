class E06Cliente { private String nombre,tel; public E06Cliente(String n,String t){nombre=n;tel=t;} public String toString(){return "Cliente{" + nombre + "}";} }
class E06Mesa { private int numero,cap; public E06Mesa(int n,int c){numero=n;cap=c;} public String toString(){return "Mesa{" + numero + ", " + cap + "}";} }
class E06Reserva {
    private String fecha,hora; private E06Cliente cliente; private E06Mesa mesa;
    public E06Reserva(String f,String h,E06Cliente c,E06Mesa m){fecha=f;hora=h;cliente=c;mesa=m;}
    public String toString(){return "Reserva{" + fecha + " " + hora + ", " + cliente + ", " + mesa + "}";}
}
public class Demo06 { public static void run(){ System.out.println("-- Ejercicio 06 --"); E06Cliente c=new E06Cliente("Juan","1111"); E06Mesa m=new E06Mesa(5,4); E06Reserva r=new E06Reserva("2025-10-01","21:00",c,m); System.out.println(r);} 
    public static void main(String[] args) { run(); }
}
