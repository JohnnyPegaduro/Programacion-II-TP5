class E09Paciente { private String nombre,os; public E09Paciente(String n,String o){nombre=n;os=o;} public String toString(){return "Paciente{" + nombre + "}";} }
class E09Profesional { private String nombre,esp; public E09Profesional(String n,String e){nombre=n;esp=e;} public String toString(){return "Profesional{" + nombre + "}";} }
class E09CitaMedica {
    private String fecha,hora; private E09Paciente paciente; private E09Profesional profesional;
    public E09CitaMedica(String f,String h,E09Paciente p,E09Profesional pr){fecha=f;hora=h;paciente=p;profesional=pr;}
    public String toString(){return "Cita{" + fecha + " " + hora + ", " + paciente + ", " + profesional + "}";}
}
public class Demo09 { public static void run(){ System.out.println("-- Ejercicio 09 --"); E09Paciente p=new E09Paciente("Ana","OSDE"); E09Profesional pr=new E09Profesional("Dr. Ro","Clinica"); E09CitaMedica c=new E09CitaMedica("2025-09-03","10:00",p,pr); System.out.println(c);} 
    public static void main(String[] args) { run(); }
}
