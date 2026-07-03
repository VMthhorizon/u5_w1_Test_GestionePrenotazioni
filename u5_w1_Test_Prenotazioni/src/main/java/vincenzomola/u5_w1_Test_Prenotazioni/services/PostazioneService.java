package vincenzomola.u5_w1_Test_Prenotazioni.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Postazione;
import vincenzomola.u5_w1_Test_Prenotazioni.enums.TipoPostazione;
import vincenzomola.u5_w1_Test_Prenotazioni.exceptions.NotFoundException;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.PostazioneRepository;

import java.util.List;

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
                .orElseThrow(() -> new NotFoundException("Postazione non trovato"));
    }

    public List<Postazione> filterPostazioniByTipoECitta(TipoPostazione tipoPostazione, String citta) {
        List<Postazione> postazioniFiltrati = postazioneRepository.findByTipoPostazioneAndEdificioCittaIgnoreCase(
                tipoPostazione, citta);
        if (postazioniFiltrati.isEmpty())
            throw new NotFoundException(
                    "Postazioni di tipo " + tipoPostazione.name() + " per la città di: " + citta + " non trovate");
        return postazioniFiltrati;
    }

}
