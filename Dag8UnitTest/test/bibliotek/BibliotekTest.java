package bibliotek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {
Bibliotek bibliotek = new Bibliotek();

    @BeforeEach
    void setUp() {
    }

    @Test
    void beregnBøde() {
        LocalDate beregnet = LocalDate.of(2022,02,05);
        assertEquals(0,bibliotek.beregnBøde(beregnet,LocalDate.of(2022,02,05),true));
        assertEquals(0,bibliotek.beregnBøde(beregnet,LocalDate.of(2022,02,13),false));
        assertEquals(0,bibliotek.beregnBøde(beregnet,LocalDate.of(2022,02,28),true));
    }
}