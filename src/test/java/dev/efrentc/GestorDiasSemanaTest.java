package dev.efrentc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestorDiasSemanaTest {

    private GestorDiasSemana gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDiasSemana();
        gestor.crearListaDias();
    }

    @Test
    void testCrearListaDias() {
        assertEquals(7, gestor.getLargoLista());
    }

    @Test
    void testGetDiasSemana() {
        List<String> dias = gestor.getDiasSemana();
        assertTrue(dias.contains("Lunes"));
        assertTrue(dias.contains("Domingo"));
    }

    @Test
    void testGetLargoLista() {
        assertEquals(7, gestor.getLargoLista());
    }

    @Test
    void testEliminarDia() {
        assertTrue(gestor.eliminarDia("Lunes"));
        assertFalse(gestor.existeDia("Lunes"));
    }

    @Test
    void testGetDia() {
        assertEquals("Lunes", gestor.getDia(0));
    }

    @Test
    void testGetDiaIndexFueraDeRango() {
        assertThrows(IndexOutOfBoundsException.class, () -> gestor.getDia(10));
    }

    @Test
    void testExisteDia() {
        assertTrue(gestor.existeDia("Viernes"));
        assertFalse(gestor.existeDia("Funday"));
    }

    @Test
    void testOrdenarAlfabeticamente() {
        gestor.ordenarAlfabeticamente();
        List<String> dias = gestor.getDiasSemana();
        assertEquals("Domingo", dias.get(0)); 
    }

    @Test
    void testVaciarLista() {
        gestor.vaciarLista();
        assertEquals(0, gestor.getLargoLista());
    }
}
