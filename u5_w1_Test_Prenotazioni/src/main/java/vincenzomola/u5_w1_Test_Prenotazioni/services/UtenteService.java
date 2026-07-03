package vincenzomola.u5_w1_Test_Prenotazioni.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Utente;
import vincenzomola.u5_w1_Test_Prenotazioni.exceptions.NotFoundException;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.EdificioRepository;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.UtenteRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UtenteService {

    private UtenteRepository utenteRepository;

    public UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    @Transactional
    public void saveUtente(Utente utente) {
        utenteRepository.save(utente);
        System.out.println("L'Utente " + utente.getNomeCompleto() + " é stato salvato");
    }

    public Utente findUtenteById(long id) {
        return utenteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Utente non trovato"));
    }
}
