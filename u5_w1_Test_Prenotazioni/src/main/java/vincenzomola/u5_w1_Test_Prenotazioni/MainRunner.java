package vincenzomola.u5_w1_Test_Prenotazioni;

import jakarta.annotation.Nullable;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.exceptions.NotFoundException;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.EdificioRepository;
import vincenzomola.u5_w1_Test_Prenotazioni.services.EdificioService;

@Component
public class MainRunner implements CommandLineRunner {

    private EdificioService edificioService;

    private Edificio hotelRamada;
    private Edificio ufficioBNL;
    private Edificio terrazzaSunshine;

    public MainRunner(EdificioService edificioService, Edificio hotelRamada, Edificio ufficioBNL, Edificio terrazzaSunshine){
        this.edificioService = edificioService;
        this.hotelRamada = hotelRamada;
        this.ufficioBNL = ufficioBNL;
        this.terrazzaSunshine = terrazzaSunshine;
    }

    @Override
    public void run(String... args) throws Exception {

        try {
            edificioService.saveEdificio(hotelRamada);
            edificioService.saveEdificio(ufficioBNL);
            edificioService.saveEdificio(terrazzaSunshine);
        } catch(NotFoundException e){
            System.out.println("Edificio non salvato!" + e.getMessage());
        }
    }
}
