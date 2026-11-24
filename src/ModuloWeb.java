public class ModuloWeb{
    //Metodo para consultar el stock de forma online
    public void consultarStockOnline(String disfraz){
        GestorAlquilerDisfraces gestor = GestorAlquilerDisfraces.getInstance();
        boolean disponible = gestor.consultarDisponibilidad(disfraz);
        String estado = disponible ? "DISPONIBLE" : "NO DISPONIBLE";
        System.out.println("[Módulo Web] Consulta por '" +disfraz+ "': " +estado);
    }
    //Metodo para revervar un disfraz de forma online
    public void reservarOnline(String disfraz){
        GestorAlquilerDisfraces gestor = GestorAlquilerDisfraces.getInstance();
        gestor.alquilarDisfraz(disfraz, "Módulo Web");
    }
}