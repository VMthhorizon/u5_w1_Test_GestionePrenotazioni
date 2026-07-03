package vincenzomola.u5_w1_Test_Prenotazioni;

import jakarta.annotation.Nullable;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Postazione;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Prenotazione;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Utente;
import vincenzomola.u5_w1_Test_Prenotazioni.enums.TipoPostazione;
import vincenzomola.u5_w1_Test_Prenotazioni.exceptions.NotFoundException;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.EdificioRepository;
import vincenzomola.u5_w1_Test_Prenotazioni.services.EdificioService;
import vincenzomola.u5_w1_Test_Prenotazioni.services.PostazioneService;
import vincenzomola.u5_w1_Test_Prenotazioni.services.PrenotazioneService;
import vincenzomola.u5_w1_Test_Prenotazioni.services.UtenteService;

import java.time.LocalDate;

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

    public MainRunner(EdificioService edificioService, UtenteService utenteService, PostazioneService postazioneService,
                      PrenotazioneService prenotazioneService, Edificio hotelRamada, Edificio ufficioBNL,
                      Edificio terrazzaSunshine, Utente aldo, Utente luca, Utente antonio) {
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
    }

    @Override
    public void run(String... args) throws Exception {

        try {
//            edificioService.saveEdificio(hotelRamada);
//            edificioService.saveEdificio(ufficioBNL);
//            edificioService.saveEdificio(terrazzaSunshine);
//
//            utenteService.saveUtente(aldo);
//            utenteService.saveUtente(luca);
//            utenteService.saveUtente(antonio);
//

//            Utente aldoFromDb = utenteService.findUtenteById(1);
//            Utente lucaFromDb = utenteService.findUtenteById(2);
//            Utente antonioFromDb = utenteService.findUtenteById(3);
//
//            Edificio hotelRamadaFromDb = edificioService.findEdificioById(1);
//            Edificio ufficioBNLFromDb = edificioService.findEdificioById(2);
//            Edificio terrazzaSunshineFromDb = edificioService.findEdificioById(3);
//
//            Postazione postazione1 = new Postazione("Festa aziendale", TipoPostazione.OPEN_SPACE, 100,
//                    hotelRamadaFromDb);
//            Postazione postazione2 = new Postazione("Meeting lavorativo", TipoPostazione.PRIVATO, 7,
//            ufficioBNLFromDb);
//            Postazione postazione3 = new Postazione("Premiazione di fine anno", TipoPostazione.SALA_RIUNIONI, 500,
//                    terrazzaSunshineFromDb);

//            postazioneService.savePostazione(postazione1);
//            postazioneService.savePostazione(postazione2);
//            postazioneService.savePostazione(postazione3);

//            postazioneService.findPostazioneById(1);
//            postazioneService.findPostazioneById(2);
//            postazioneService.findPostazioneById(3);

//            Prenotazione prenotazione1 = new Prenotazione(LocalDate.of(2026, 7, 21), aldoFromDb, postazione1);
//            Prenotazione prenotazione2 = new Prenotazione(LocalDate.of(2026, 8, 21), lucaFromDb, postazione2);
//            Prenotazione prenotazione3 = new Prenotazione(LocalDate.of(2026, 8, 19), antonioFromDb, postazione3);

//            prenotazioneService.savePrenotazione(prenotazione1);
//            prenotazioneService.savePrenotazione(prenotazione2);
//            prenotazioneService.savePrenotazione(prenotazione3);
            

        } catch (NotFoundException e) {
            System.out.println("Salvataggio non riuscito!" + e.getMessage());
        }
    }
}
