package vincenzomola.u5_w1_Test_Prenotazioni.services;

import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Prenotazione;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {

    private PrenotazioneRepository prenotazioneRepository;

    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository){
        this.prenotazioneRepository = prenotazioneRepository;
    }

    public void savePrenotazione(Prenotazione prenotazione){
        prenotazioneRepository.save(prenotazione);
        System.out.println("Prenotazione salvata");
    }
}
