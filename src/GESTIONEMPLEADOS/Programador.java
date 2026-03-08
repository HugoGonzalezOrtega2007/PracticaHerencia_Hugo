package GESTIONEMPLEADOS;

public class Programador extends Empleados {

    private String lenguaje;
    private int horasExtra;
    private int salarioProgramador;

    public Programador(String nombre, String apellidos, int salarioBase, String departamento, String lenguaje, int horasExtra, int salarioProgramador) {
        super(nombre, apellidos, salarioBase, departamento);
        this.lenguaje = lenguaje;
        this.horasExtra = horasExtra;
        this.salarioProgramador = horasExtra*120;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Apellidos: " + getApellidos() + " | Salario base: " + getSalarioBase() +
                " | Departamento: " + getDepartamento() + " | Lenguaje: " + lenguaje + " | Horas extra: " + horasExtra + " | Salario: "
                + salarioProgramador;

    }
}
