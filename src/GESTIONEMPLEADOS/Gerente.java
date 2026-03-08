package GESTIONEMPLEADOS;

public class Gerente extends Empleados{
    private int bonus;
    private int empleados;
    private int salarioGerente;

    public Gerente(String nombre, String apellidos, int salario, String departamento, int bonus, int empleados, int salarioGerente) {
        super(nombre, apellidos, salario, departamento);
        this.bonus = bonus;
        this.empleados = empleados;
        this.salarioGerente = empleados*35;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Apellidos: " + getApellidos() + " | Salario base: " + getSalarioBase() +
                " | Departamento: " + getDepartamento() + " | Bonus: " + bonus + " | Empleados a cargo: " + empleados +
                " | Salario: " + salarioGerente;
    }
}

