class E04Banco { private String nombre,cuit; public E04Banco(String n,String c){nombre=n;cuit=c;} public String toString(){return "Banco{" + nombre + "}";} }
class E04Cliente { private String nombre,dni; private E04TarjetaDeCredito tarjeta; public E04Cliente(String n,String d){nombre=n;dni=d;} void setTarjeta(E04TarjetaDeCredito t){tarjeta=t;} public String toString(){return "Cliente{" + nombre + "}";} }
class E04TarjetaDeCredito {
    private String numero, venc; private E04Banco banco; private E04Cliente cliente;
    public E04TarjetaDeCredito(String numero,String venc,E04Banco banco){this.numero=numero;this.venc=venc;this.banco=banco;}
    public void asignarCliente(E04Cliente c){ this.cliente=c; if(c!=null) c.setTarjeta(this); }
    public String toString(){ return "TDC{" + numero + ", " + banco + "}"; }
}
public class Demo04 {
    public static void run(){
        System.out.println("-- Ejercicio 04 --");
        E04Banco b = new E04Banco("FakeBank","30-12345678-9");
        E04TarjetaDeCredito t = new E04TarjetaDeCredito("1234 5678 9012 3456","12/27", b);
        E04Cliente c = new E04Cliente("Pepe","40546655");
        t.asignarCliente(c);
        System.out.println(t);
        System.out.println(c);
    }

    public static void main(String[] args) { run(); }
}
