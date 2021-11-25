package daw.poo;

// nombre, apellidos, NIF, sueldo base, pago por hora extra, 
//horas extra realizadas en el mes, tipo de IRPF (entre 1% y 20%), casado o no y número de hijos
public class Empleado {

    private String nombre, apellidos, NIF;
    private double sueldoBase, pagoPorHorasExtras;
    private int horasExtrasRealizadas, IRPF, numeroHijos;
    private boolean casado;

    public Empleado() {
        nombre = " - ";
        apellidos = " - ";
        NIF = " - ";
        sueldoBase = 0;
        pagoPorHorasExtras = 0;
        horasExtrasRealizadas = 0;
        IRPF = 1;
        numeroHijos = 0;
        casado = false;
    }

    public Empleado(String nombre, String apellidos, String NIF, double sueldoBase, double pagoPorHorasExtras,
            int horasExtrasRealizadas, int IRPF, int numeroHijos, boolean casado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoPorHorasExtras = pagoPorHorasExtras;
        this.horasExtrasRealizadas = horasExtrasRealizadas;
        this.IRPF = 0;
        if (IRPF >= 1 && IRPF <= 20) {
            this.IRPF = IRPF;
        }
        this.numeroHijos = numeroHijos;
        this.casado = casado;

    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + nombre + ", Apellidos="
                + apellidos + ", NIF=" + NIF + ", SueldoBase=" + sueldoBase
                + ", PagoPorHorasExtras=" + pagoPorHorasExtras + ", HorasExtrasRealizadas="
                + horasExtrasRealizadas + ", IRPF=" + IRPF + ", NumeroHijos=" + numeroHijos
                + ", Casado=" + casado + '}';
    }

    public double complemento() {
        return (this.pagoPorHorasExtras * this.horasExtrasRealizadas);
    }

    public double sueldoBruto() {
        return (this.sueldoBase+this.complemento());
    }
    
    public double IRPF() {
        int editadoIRPF;
        double retencionIRPF;
        if (casado) {
            editadoIRPF = this.IRPF-2;
        } else{
            editadoIRPF =this.IRPF;
        }
        editadoIRPF = editadoIRPF - this.numeroHijos;
        retencionIRPF = this.sueldoBruto()*(editadoIRPF/100);
    return retencionIRPF;
    }
    
    public double sueldoNeto() {
        return (this.sueldoBruto()-this.IRPF());
    }
    
    public void escribirBasicInfo() {
        
    }
    
    public void escribirALlInfo(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoPorHorasExtras() {
        return pagoPorHorasExtras;
    }

    public void setPagoPorHorasExtras(double pagoPorHorasExtras) {
        this.pagoPorHorasExtras = pagoPorHorasExtras;
    }

    public int getHorasExtrasRealizadas() {
        return horasExtrasRealizadas;
    }

    public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
        this.horasExtrasRealizadas = horasExtrasRealizadas;
    }

    public int getIRPF() {
        return IRPF;
    }

    public void setIRPF(int IRPF) {
        this.IRPF = 0;
        if (IRPF >= 1 && IRPF <= 20) {
            this.IRPF = IRPF;
        }
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

}
