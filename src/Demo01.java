class E01Foto {
    private String imagen, formato;
    public E01Foto(String imagen, String formato){ this.imagen=imagen; this.formato=formato; }
    public String toString(){ return "Foto{" + formato + ", " + imagen + "}"; }
}
class E01Titular {
    private String nombre, dni;
    private E01Pasaporte pasaporte;
    public E01Titular(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }
    void setPasaporte(E01Pasaporte p){ this.pasaporte = p; }
    public E01Pasaporte getPasaporte(){ return pasaporte; }
    public String toString(){ return "Titular{" + nombre + ", dni=" + dni + "}"; }
}
class E01Pasaporte {
    private String numero, fechaEmision;
    private E01Foto foto;
    private E01Titular titular;
    public E01Pasaporte(String numero, String fechaEmision, String img, String formato){
        this.numero=numero; this.fechaEmision=fechaEmision; this.foto=new E01Foto(img, formato);
    }
    public void asignarTitular(E01Titular t){ this.titular=t; if(t!=null) t.setPasaporte(this); }
    public String toString(){ return "Pasaporte{" + numero + ", emitido=" + fechaEmision + ", " + foto + "}"; }
}
public class Demo01 {
    public static void run(){
        System.out.println("-- Ejercicio 01 --");
        E01Titular t = new E01Titular("Ana", "12345678");
        E01Pasaporte p = new E01Pasaporte("AR-0001","2025-09-01","ana.jpg","JPG");
        p.asignarTitular(t);
        System.out.println(p);
        System.out.println(t + " -> " + t.getPasaporte());
    }

    public static void main(String[] args) { run(); }
}
