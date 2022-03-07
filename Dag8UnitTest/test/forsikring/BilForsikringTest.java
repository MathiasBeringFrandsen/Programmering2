package forsikring;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {
    BilForsikring forsikring = new BilForsikring();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        forsikring.setGrundpaemie(1000);
    }

    @org.junit.jupiter.api.Test
    void getGrundPraemie() {
        assertEquals(1000, forsikring.getGrundPraemie());
    }

    @org.junit.jupiter.api.Test
    void setGrundpraemie() {
        Exception exception = assertThrows(RuntimeException.class, () -> forsikring.setGrundpaemie(-1));
        assertEquals("grundPr skal vaere positiv", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void beregnPraemie() {
        forsikring.setGrundpaemie(1000);

        //BeregningsTests
        assertEquals(1250, forsikring.beregnPraemie(21, false, 0));
        assertEquals(1000, forsikring.beregnPraemie(25, false, 2));
        assertEquals(1062.5, forsikring.beregnPraemie(21, false, 3));
        assertEquals(850, forsikring.beregnPraemie(28, false, 5));
        assertEquals(750, forsikring.beregnPraemie(25, false, 6));
        assertEquals(750, forsikring.beregnPraemie(28, false, 8));
        assertEquals(650, forsikring.beregnPraemie(28, false, 9));
        assertEquals(950, forsikring.beregnPraemie(25, true, 0));
        //ThrowTests

        Exception e1 = assertThrows(RuntimeException.class, () -> forsikring.beregnPraemie(20, true, 4));
        assertEquals(e1.getMessage(), "Du kan ikke have kaert skadefri saelaenge");
        Exception e2 = assertThrows(RuntimeException.class, () -> forsikring.beregnPraemie(17, true, 40));
        assertEquals("Du er for ung til at tegne en forsikring", e2.getMessage());
        Exception e3 = assertThrows(RuntimeException.class, () -> forsikring.beregnPraemie(18, false, -22));
        assertEquals("Antal skade frie aer skal vaere positiv", e3.getMessage());
    }
}