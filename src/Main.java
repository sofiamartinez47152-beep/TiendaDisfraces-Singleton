public class Main{
    public static void main(String[] args){
        //Verificación del patrón Singleton
        //System.out.println("\nVERIFICANDO EL PATRÓN SINGLETON...");
        GestorAlquilerDisfraces prueba1 = GestorAlquilerDisfraces.getInstance();
        GestorAlquilerDisfraces prueba2 = GestorAlquilerDisfraces.getInstance();
        //Va a imprimir 'true' si se cumple el patrón y 'false' si no se cumple y existen más de una instancia
        //System.out.println("¿prueba1 y prueba2 apuntan al mismo objeto en memoria?: " +(prueba1 == prueba2));
        //Simulación del flujo de negocio entre ambos canales de la tienda
        System.out.println("\n¡SIMULACIÓN DE LA TIENDA DE DISFRACES!");
        MostradorFisico mostrador = new MostradorFisico();
        ModuloWeb web = new ModuloWeb();
        //Muestro el estado inicial de la tienda
        prueba1.mostrarCatalogo();
        System.out.println("\n");
        //Alquiler presencialmente de un disfraz por el mostrador
        mostrador.atenderAlquiler("Vampiro (Talle S)");
        //Consulta desde la web e intento de reservar el mismo disfraz que ya se alquilo
        web.consultarStockOnline("Vampiro (Talle S)");
        web.reservarOnline("Vampiro (Talle S)");
        //Reserva desde la web de un disfraz libre
        web.reservarOnline("Spider-Man (Talle L)");
        //Devolucion del disfraz pedido por el mostrador
        mostrador.registrarDevolucion("Vampiro (Talle S)");
        //Consulta desde la web por el mismo disfraz devuelto, ahora si está disponible
        web.consultarStockOnline("Vampiro (Talle S)");
        //Muestro el estado final del catálogo compartido
        prueba2.mostrarCatalogo();
    }
}
