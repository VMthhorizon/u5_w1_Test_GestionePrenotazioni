package vincenzomola.u5_w1_Test_Prenotazioni.exceptions;

public class AlreadyBooked extends RuntimeException {
    public AlreadyBooked(String message) {
        super(message);
    }
}
