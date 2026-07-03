package vincenzomola.u5_w1_Test_Prenotazioni.services;

import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.EdificioRepository;

@Service
public class EdificioService {

    private EdificioRepository edificioRepository;

    public EdificioService(EdificioRepository edificioRepository){
        this.edificioRepository = edificioRepository;
    }

    public void saveEdificio(Edificio edificio){
        edificioRepository.save(edificio);
        System.out.println("L'edificio " + edificio.getNome() + " é stato salvato");
    }
}
