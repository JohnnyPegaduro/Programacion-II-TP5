class E12Contribuyente { private String nombre,cuil; public E12Contribuyente(String n,String c){nombre=n;cuil=c;} public String toString(){return nombre + " (" + cuil + ")";} }
class E12Impuesto { private double monto; private E12Contribuyente c; public E12Impuesto(double m,E12Contribuyente c){monto=m;this.c=c;} public double getMonto(){return monto;} public E12Contribuyente getContribuyente(){return c;} }
class E12Calculadora { public void calcular(E12Impuesto i){ double total=i.getMonto()*1.21; System.out.println("Impuesto para " + i.getContribuyente() + " -> total: " + total); } }
public class Demo12 { public static void run(){ System.out.println("-- Ejercicio 12 --"); E12Contribuyente c=new E12Contribuyente("Fer","20-123"); E12Impuesto i=new E12Impuesto(1000,c); new E12Calculadora().calcular(i);} 
    public static void main(String[] args) { run(); }
}
