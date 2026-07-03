package vincenzomola.u5_w1_Test_Prenotazioni.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Utente;
import vincenzomola.u5_w1_Test_Prenotazioni.exceptions.NotFoundException;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.EdificioRepository;

@Service
public class EdificioService {

    private EdificioRepository edificioRepository;

    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    @Transactional
    public void saveEdificio(Edificio edificio) {
        edificioRepository.save(edificio);
        System.out.println("L'edificio " + edificio.getNome() + " é stato salvato");
    }

    public Edificio findEdificioById(long id) {
        return edificioRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Edificio non trovato"));
    }
}
