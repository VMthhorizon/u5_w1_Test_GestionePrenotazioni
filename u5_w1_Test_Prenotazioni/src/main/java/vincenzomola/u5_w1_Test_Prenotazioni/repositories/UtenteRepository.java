package vincenzomola.u5_w1_Test_Prenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
