import empleados.Contratista;
import empleados.Empleado;
import empleados.FullTime;
import empleados.PartTime;

public class Main {
    public static void main(String[] args) {

        //Instancias
        Empleado empleado1 = new FullTime("Tomas", 1, 3500000);
        Empleado empleado2 = new PartTime("Ana", 2, 40, 30000);
        Empleado empleado3 = new Contratista("Pedro", 3, 1500000, 2);



        //Mostrar Empleados
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Empleados");
        System.out.println("------------------------");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println();

        //Calcular Sueldo
        System.out.println("Sueldo de " + empleado1.getNombre() + " es: $" + empleado1.calcSueldo());
        System.out.println("Sueldo de " + empleado2.getNombre() + " es: $" + empleado2.calcSueldo());
        System.out.println("Sueldo de " + empleado3.getNombre() + " es: $" + empleado3.calcSueldo());


















    }
}