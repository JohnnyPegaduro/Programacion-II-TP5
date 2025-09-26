class E07Motor { private String tipo,ns; public E07Motor(String t,String n){tipo=t;ns=n;} public String toString(){return "Motor{" + tipo + "}";} }
class E07Conductor { private String nombre,lic; private E07Vehiculo vehiculo; public E07Conductor(String n,String l){nombre=n;lic=l;} void setVehiculo(E07Vehiculo v){vehiculo=v;} public String toString(){return "Conductor{" + nombre + "}";} }
class E07Vehiculo {
    private String patente, modelo; private E07Motor motor; private E07Conductor conductor;
    public E07Vehiculo(String p,String m,E07Motor mot){patente=p;modelo=m;motor=mot;}
    public void asignarConductor(E07Conductor c){conductor=c; if(c!=null) c.setVehiculo(this);}
    public String toString(){return "Vehiculo{" + patente + ", " + modelo + ", " + motor + "}";}
}
public class Demo07 { public static void run(){ System.out.println("-- Ejercicio 07 --"); E07Motor mot=new E07Motor("Nafta","M-123"); E07Vehiculo v=new E07Vehiculo("ABC123","Focus",mot); E07Conductor c=new E07Conductor("Rolo","B1"); v.asignarConductor(c); System.out.println(v);} 
    public static void main(String[] args) { run(); }
}
