package vincenzomola.u5_w1_Test_Prenotazioni.services;

import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Postazione;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.PostazioneRepository;

@Service
public class PostazioneService {

    private PostazioneRepository postazioneRepository;

    public PostazioneService(PostazioneRepository postazioneRepository){
        this.postazioneRepository = postazioneRepository;
    }

    public void savePostazione(Postazione postazione){
        postazioneRepository.save(postazione);
        System.out.println("Postazione salvata");
    }
}
