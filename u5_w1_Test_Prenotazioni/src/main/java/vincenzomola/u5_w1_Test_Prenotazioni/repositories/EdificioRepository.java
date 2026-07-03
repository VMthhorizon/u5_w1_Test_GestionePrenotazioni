package vincenzomola.u5_w1_Test_Prenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
