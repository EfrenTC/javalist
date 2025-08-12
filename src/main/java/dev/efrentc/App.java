package dev.efrentc;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        GestorDiasSemana gestor = new GestorDiasSemana();

        gestor.crearListaDias();

        System.out.println("Lista inicial de días: " + gestor.getDiasSemana());

        System.out.println("Cantidad de días: " + gestor.getLargoLista());

        System.out.println("Día en posición 3: " + gestor.getDia(2));

        System.out.println("¿Existe 'Viernes'? " + gestor.existeDia("Viernes"));

        System.out.println("¿Existe 'Funday'? " + gestor.existeDia("Funday"));

        gestor.eliminarDia("Lunes");
        System.out.println("Lista tras eliminar 'Lunes': " + gestor.getDiasSemana());

        gestor.ordenarAlfabeticamente();
        System.out.println("Lista ordenada alfabéticamente: " + gestor.getDiasSemana());

        gestor.vaciarLista();
        System.out.println("Lista después de vaciar: " + gestor.getDiasSemana());
    }
}