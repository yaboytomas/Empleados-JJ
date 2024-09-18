package empleados;

public class FullTime extends Empleado {

    //Atributos
    private int salarioFijo;

    //Constructor
    public FullTime(String nombre, int ID, int salarioFijo) {
        super(nombre, ID);
        this.salarioFijo = salarioFijo;
    }

    //Metodo Sueldo
    @Override
    public int calcSueldo() {
        return salarioFijo;
    }

    //ToString
    @Override
    public String toString() {
        return "Empleado FullTime: " + "\n" + getNombre() + " ID:" + getID() + "\n";
    }
}
