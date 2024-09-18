package empleados;

public abstract class Empleado {

    //Atributos
    private String nombre;
    private int ID;

    //Constructor
    public Empleado(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    //Metodo Sueldo
    public abstract int calcSueldo ();

    //ToString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", ID=" + ID +
                '}';
    }
}
