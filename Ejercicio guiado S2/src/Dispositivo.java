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
        this.nombre=nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
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

