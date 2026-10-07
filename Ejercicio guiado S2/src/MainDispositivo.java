public class MainDispositivo {
    static void main() {
        Dispositivo d1=new Dispositivo();
        Dispositivo d2=new Dispositivo();
        d1.setNombre("Mouse");
        d1.setTipo("Entrada");
        d1.setActivo(true);

        d2.setNombre("Audifonos");
        d2.setTipo("Salida");
        d2.setActivo(false);

        d1.mostrarInformacion();
        d1.mostrarEstado();

        d2.mostrarInformacion();
        d2.mostrarEstado();

        d1.setActivo(true);
        d1.mostrarEstado();

        System.out.println(d1.getNombre());
        System.out.println(d1.getTipo());
        System.out.println(d1.isActivo());

        System.out.println(d2.getNombre());
        System.out.println(d2.getTipo());
        System.out.println(d2.isActivo());
    }
}
