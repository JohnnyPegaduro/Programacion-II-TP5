class E10ClaveSeguridad { private String codigo,ult; public E10ClaveSeguridad(String c,String u){codigo=c;ult=u;} public String toString(){return "Clave{" + codigo + "}";} }
class E10Titular { private String nombre,dni; private E10CuentaBancaria cuenta; public E10Titular(String n,String d){nombre=n;dni=d;} void setCuenta(E10CuentaBancaria c){cuenta=c;} public String toString(){return "Titular{" + nombre + "}";} }
class E10CuentaBancaria {
    private String cbu; private double saldo; private E10ClaveSeguridad clave; private E10Titular titular;
    public E10CuentaBancaria(String cbu,double saldo,String codigo,String ult){ this.cbu=cbu; this.saldo=saldo; this.clave=new E10ClaveSeguridad(codigo,ult); }
    public void asignarTitular(E10Titular t){titular=t; if(t!=null) t.setCuenta(this);}
    public String toString(){return "Cuenta{" + cbu + ", saldo=" + saldo + ", " + clave + "}";}
}
public class Demo10 { public static void run(){ System.out.println("-- Ejercicio 10 --"); E10CuentaBancaria cb=new E10CuentaBancaria("000-123",1000,"abcd","2025-01-01"); E10Titular t=new E10Titular("Lau","33445566"); cb.asignarTitular(t); System.out.println(cb);} 
    public static void main(String[] args) { run(); }
}
