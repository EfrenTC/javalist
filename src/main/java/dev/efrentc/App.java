package dev.efrentc;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        GestorDiasSemana gestor = new GestorDiasSemana();

        // Crear la lista de días
        gestor.crearListaDias();
        System.out.println("Lista inicial de días: " + gestor.getDiasSemana());

        // Largo de la lista
        System.out.println("Cantidad de días: " + gestor.getLargoLista());

        // Obtener un día por índice
        System.out.println("Día en posición 3: " + gestor.getDia(2));

        // Verificar si existe un día
        System.out.println("¿Existe 'Viernes'? " + gestor.existeDia("Viernes"));
        System.out.println("¿Existe 'Funday'? " + gestor.existeDia("Funday"));

        // Eliminar un día
        gestor.eliminarDia("Lunes");
        System.out.println("Lista tras eliminar 'Lunes': " + gestor.getDiasSemana());

        // Ordenar alfabéticamente
        gestor.ordenarAlfabeticamente();
        System.out.println("Lista ordenada alfabéticamente: " + gestor.getDiasSemana());

        // Vaciar lista
        gestor.vaciarLista();
        System.out.println("Lista después de vaciar: " + gestor.getDiasSemana());
    }
}
