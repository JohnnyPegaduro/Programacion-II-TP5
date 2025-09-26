class E05PlacaMadre { private String modelo,chipset; public E05PlacaMadre(String m,String c){modelo=m;chipset=c;} public String toString(){return "PlacaMadre{" + modelo + ", " + chipset + "}";} }
class E05Propietario { private String nombre,dni; private E05Computadora computadora; public E05Propietario(String n,String d){nombre=n;dni=d;} void setComputadora(E05Computadora c){computadora=c;} public String toString(){return "Propietario{" + nombre + "}";} }
class E05Computadora {
    private String marca, sn; private E05PlacaMadre placa; private E05Propietario propietario;
    public E05Computadora(String marca,String sn,String modeloPlaca,String chipset){ this.marca=marca; this.sn=sn; this.placa=new E05PlacaMadre(modeloPlaca,chipset); }
    public void asignarPropietario(E05Propietario p){propietario=p; if(p!=null) p.setComputadora(this);}
    public String toString(){return "PC{" + marca + ", " + placa + "}";}
}
public class Demo05 { public static void run(){ System.out.println("-- Ejercicio 05 --"); E05Computadora pc=new E05Computadora("Dell","SN-001","B560","Intel"); E05Propietario pr=new E05Propietario("Carla","32123456"); pc.asignarPropietario(pr); System.out.println(pc);} 
    public static void main(String[] args) { run(); }
}
