package empleados;

public class PartTime extends Empleado {

    //Atributos
    private int horasTrabajadas;
    private int salarioPorHora;

    //Constructor
    public PartTime(String nombre, int ID, int horasTrabajadas, int salarioPorHora) {
        super(nombre, ID);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    //Metodo Sueldo
    private double sueldoPartTime (int horas, int salario){
        return horas * salario;
    }

    @Override
    public int calcSueldo() {
        return horasTrabajadas * salarioPorHora;
    }

    //ToString
    @Override
    public String toString() {
        return "Empleado PartTime: " + "\n" + getNombre() + " ID:" + getID() + "\n" +
                "Horas Trabajadas = " + horasTrabajadas + "\n" +
                "Pago Por Hora = $" + salarioPorHora + "\n";
    }
}
