/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando_interfaz;

/**
 *
 * @author Dell
 */
public class Empleado implements java.io.Serializable{
    private String codigo;
    private String nombre, apellido, genero, fechaNac, fechaIngresoEmpresa;
    private double salario;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", fechaNac=" + fechaNac + ", fechaIngresoEmpresa=" + fechaIngresoEmpresa + ", salario=" + salario + '}';
    }

    
    public void mostrar(){
        System.out.println(toString());
    }
    
    Empleado(){
    }

    public Empleado(String nombre, String apellido, String genero, String fechaNac, String fechaIngresoEmpresa, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.fechaIngresoEmpresa = fechaIngresoEmpresa;
        this.salario = salario;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaIngresoEmpresa() {
        return fechaIngresoEmpresa;
    }

    public void setFechaIngresoEmpresa(String fechaIngresoEmpresa) {
        this.fechaIngresoEmpresa = fechaIngresoEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
