package vincenzomola.u5_w1_Test_Prenotazioni.services;

import org.springframework.stereotype.Service;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.EdificioRepository;
import vincenzomola.u5_w1_Test_Prenotazioni.repositories.UtenteRepository;

@Service
public class UtenteService {

    private UtenteRepository utenteRepository;

    public UtenteService(UtenteService utenteService){
        this.utenteRepository = utenteRepository;
    }

    public void saveEdificio(Edificio edificio){
        utenteRepository.save(edificio);
        System.out.println("L'edificio " + edificio.getNome() + " é stato salvato");
    }
}
