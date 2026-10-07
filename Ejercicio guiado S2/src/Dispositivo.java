public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
    void mostrarEstado() {
        String estado = activo? "Estado activo": "Estado inactivo";
        System.out.println(nombre+" "+estado);


    }
    public void setNombre(String nombre){
        if(nombre==null)
            System.out.println("El nombre no puede estar vacio");
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public boolean isActivo() {
        return activo;
    }

    void activar(){
        if(activo==false){
            activo=true;
            System.out.println(nombre+" ha sido activado");

        }
    }

}

