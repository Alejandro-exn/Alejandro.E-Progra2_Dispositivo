public class MainDispositivo {
    static void main() {
        Dispositivo d1=new Dispositivo();
        Dispositivo d2=new Dispositivo();
        d1.nombre="teclado";
        d1.tipo="entrada";
        d1.activo=true;

        d2.nombre="mouse";
        d2.tipo="entrada";
        d2.activo=false;

        d1.mostrarInformacion();
        d1.mostrarEstado();

        d2.mostrarInformacion();
        d2.mostrarEstado();

        d1.activo=false;
        d1.mostrarEstado();

    }
}
