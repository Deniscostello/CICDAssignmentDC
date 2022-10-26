package ie.atu.CICDAssignmentDC;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger pass1;

    @BeforeEach
    void setUp() {
        pass1 = new Passenger(Mr, Denis, 1234567891,0873928961,20);
    }

    @Test
    void testTitle(){
        assertEquals();

    }
    @AfterEach
    void tearDown() {
    }
}