public class Persona {
    private String dni;
    private String numss;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Double salario;

    public Persona(String dni, String numss, String nombre, String apellidos, Integer edad, Double salario) {
        this.dni = dni;
        this.numss = numss;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumss() {
        return numss;
    }

    public void setNumss(String numss) {
        this.numss = numss;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        if (numss != null ? !numss.equals(persona.numss) : persona.numss != null) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(persona.apellidos) : persona.apellidos != null) return false;
        if (edad != null ? !edad.equals(persona.edad) : persona.edad != null) return false;
        return salario != null ? salario.equals(persona.salario) : persona.salario == null;

    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (numss != null ? numss.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", numss='" + numss + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
