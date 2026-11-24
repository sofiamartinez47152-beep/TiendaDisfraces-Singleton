public class MostradorFisico{
    //Metodo para atender a un cliente presencialmente
    public void atenderAlquiler(String disfraz){
        GestorAlquilerDisfraces gestor = GestorAlquilerDisfraces.getInstance();
        gestor.alquilarDisfraz(disfraz, "Mostrador Físico");
    }
    //Metodo para registrar una devolución de un disfraz
    public void registrarDevolucion(String disfraz){
        GestorAlquilerDisfraces gestor = GestorAlquilerDisfraces.getInstance();
        gestor.devolverDisfraz(disfraz);
    }
}
