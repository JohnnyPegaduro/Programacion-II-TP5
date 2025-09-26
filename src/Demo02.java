class E02Bateria { 
    private String modelo; private int capacidad;
    public E02Bateria(String modelo, int capacidad){ this.modelo=modelo; this.capacidad=capacidad; }
    public String toString(){ return "Bateria{" + modelo + ", " + capacidad + "mAh}"; }
}
class E02Usuario { 
    private String nombre, dni; private E02Celular celular;
    public E02Usuario(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }
    void setCelular(E02Celular c){ this.celular=c; }
    public String toString(){ return "Usuario{" + nombre + "}"; }
}
class E02Celular {
    private String imei, marca, modelo; private E02Bateria bateria; private E02Usuario usuario;
    public E02Celular(String imei,String marca,String modelo,E02Bateria b){ this.imei=imei; this.marca=marca; this.modelo=modelo; this.bateria=b; }
    public void asignarUsuario(E02Usuario u){ this.usuario=u; if(u!=null) u.setCelular(this); }
    public String toString(){ return "Celular{" + marca + " " + modelo + ", " + bateria + "}"; }
}
public class Demo02 {
    public static void run(){
        System.out.println("-- Ejercicio 02 --");
        E02Bateria b = new E02Bateria("BL-45", 4000);
        E02Celular c = new E02Celular("IMEI123","LG","K40", b);
        E02Usuario u = new E02Usuario("Luis","22334455");
        c.asignarUsuario(u);
        System.out.println(c);
        System.out.println(u);
    }

    public static void main(String[] args) { run(); }
}
