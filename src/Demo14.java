class E14Proyecto { private String nombre; private int durMin; public E14Proyecto(String n,int d){nombre=n;durMin=d;} public String toString(){return nombre + "(" + durMin + "m)";} }
class E14Render { private String formato; private E14Proyecto proyecto; public E14Render(String f,E14Proyecto p){formato=f;proyecto=p;} public String toString(){return "Render{" + formato + " de " + proyecto + "}";} }
class E14EditorVideo { public void exportar(String f,E14Proyecto p){ E14Render r=new E14Render(f,p); System.out.println("Exportado: " + r); } }
public class Demo14 { public static void run(){ System.out.println("-- Ejercicio 14 --"); E14Proyecto p=new E14Proyecto("Spot",60); new E14EditorVideo().exportar("MP4", p);} 
    public static void main(String[] args) { run(); }
}
