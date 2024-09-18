package empleados;

public class Contratista extends Empleado {

    //Atributos
    private int pagoPorProyecto;
    private int projectos;

    public Contratista(String nombre, int ID, int pagoPorProyecto, int projectos) {
        super(nombre, ID);
        this.pagoPorProyecto = pagoPorProyecto;
        this.projectos = projectos;
    }

    //Constructor
    public Contratista(String nombre, int ID, int pagoPorProyecto) {
        super(nombre, ID);
        this.pagoPorProyecto = pagoPorProyecto;
    }

    //Metodo Sueldo
    @Override
    public int calcSueldo() {
        return pagoPorProyecto * projectos;
    }

    //ToString
    @Override
    public String toString() {
        return "Contratista: " + "\n" + getNombre() + " ID:" + getID() + "\n" +
                "Pago Por Proyecto = $" + pagoPorProyecto + "\n" + "Cantidad De Proyectos: " + projectos;
    }
}
