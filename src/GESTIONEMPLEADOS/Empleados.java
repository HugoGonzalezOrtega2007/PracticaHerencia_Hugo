package GESTIONEMPLEADOS;

public class Empleados {
    private String nombre;
    private String apellidos;
    private int salarioBase;
    private String departamento;

    public Empleados(String nombre, String apellidos, int salario, String departamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getSalarioBase() {
        return salarioBase;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


}
