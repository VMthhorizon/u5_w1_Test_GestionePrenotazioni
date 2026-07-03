package vincenzomola.u5_w1_Test_Prenotazioni.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Postazione;
import vincenzomola.u5_w1_Test_Prenotazioni.exceptions.NotFoundException;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.PostazioneRepository;

@Service
public class PostazioneService {

    private PostazioneRepository postazioneRepository;

    public PostazioneService(PostazioneRepository postazioneRepository) {
        this.postazioneRepository = postazioneRepository;
    }

    @Transactional
    public void savePostazione(Postazione postazione) {
        postazioneRepository.save(postazione);
        System.out.println("Postazione salvata");
    }

    public Postazione findPostazioneById(long id) {
        return postazioneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Poostazione non trovato"));
    }
}
