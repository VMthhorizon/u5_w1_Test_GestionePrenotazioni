package vincenzomola.u5_w1_Test_Prenotazioni;

import jakarta.annotation.Nullable;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Postazione;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Prenotazione;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Utente;
import vincenzomola.u5_w1_Test_Prenotazioni.exceptions.NotFoundException;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.EdificioRepository;
import vincenzomola.u5_w1_Test_Prenotazioni.services.EdificioService;
import vincenzomola.u5_w1_Test_Prenotazioni.services.PostazioneService;
import vincenzomola.u5_w1_Test_Prenotazioni.services.PrenotazioneService;
import vincenzomola.u5_w1_Test_Prenotazioni.services.UtenteService;

@Component
public class MainRunner implements CommandLineRunner {

    private EdificioService edificioService;
    private UtenteService utenteService;
    private PostazioneService postazioneService;
    private PrenotazioneService prenotazioneService;

    private Edificio hotelRamada;
    private Edificio ufficioBNL;
    private Edificio terrazzaSunshine;

    private Utente aldo;
    private Utente luca;
    private Utente antonio;

    private Postazione postazione1;
    private Postazione postazione2;
    private Postazione postazione3;

    private Prenotazione prenotazione1;
    private Prenotazione prenotazione2;
    private Prenotazione prenotazione3;

    public MainRunner(EdificioService edificioService, UtenteService utenteService, PostazioneService postazioneService, PrenotazioneService prenotazioneService, Edificio hotelRamada, Edificio ufficioBNL, Edificio terrazzaSunshine, Utente aldo, Utente luca, Utente antonio, Postazione postazione1, Postazione postazione2, Postazione postazione3, Prenotazione prenotazione1, Prenotazione prenotazione2, Prenotazione prenotazione3){
        this.edificioService = edificioService;
        this.utenteService = utenteService;
        this.postazioneService = postazioneService;
        this.prenotazioneService = prenotazioneService;

        this.hotelRamada = hotelRamada;
        this.ufficioBNL = ufficioBNL;
        this.terrazzaSunshine = terrazzaSunshine;
        this.aldo = aldo;
        this.luca = luca;
        this.antonio = antonio;
        this.postazione1 = postazione1;
        this.postazione2 = postazione2;
        this.postazione3 = postazione3;
        this.prenotazione1 = prenotazione1;
        this.prenotazione2 = prenotazione2;
        this.prenotazione3 = prenotazione3;
    }

    @Override
    public void run(String... args) throws Exception {

        try {
//            edificioService.saveEdificio(hotelRamada);
//            edificioService.saveEdificio(ufficioBNL);
//            edificioService.saveEdificio(terrazzaSunshine);

            utenteService.saveUtente(aldo);
            utenteService.saveUtente(luca);
            utenteService.saveUtente(antonio);

postazioneService.savePostazione(postazione1);
postazioneService.savePostazione(postazione2);
postazioneService.savePostazione(postazione3);

prenotazioneService.savePrenotazione(prenotazione1);
            prenotazioneService.savePrenotazione(prenotazione1);
            prenotazioneService.savePrenotazione(prenotazione1);

        } catch(NotFoundException e){
            System.out.println("Salvataggio non riuscito!" + e.getMessage());
        }
    }
}
