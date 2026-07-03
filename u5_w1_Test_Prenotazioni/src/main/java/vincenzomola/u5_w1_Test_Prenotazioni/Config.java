package vincenzomola.u5_w1_Test_Prenotazioni;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Postazione;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Prenotazione;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Utente;
import vincenzomola.u5_w1_Test_Prenotazioni.enums.TipoPostazione;

import java.time.LocalDate;

@Configuration
public class Config {

    @Bean
    public Edificio hotelRamada(){
        return new Edificio("Hotel Ramada", "via Napoli 88", "Napoli");
    }

    @Bean
    public Edificio ufficioBNL(){
        return new Edificio("Ufficio BNL", "via Garibaldi 13", "Milano");
    }

    @Bean
    public Edificio terrazzaSunshine(){
        return new Edificio("Terrazza Sunshine", "via Chiaia 44", "Firenze");
    }

    @Bean
    public Utente aldo(){
        return new Utente("Aldo", "Aldo Baglio", "aldo.baglio@libero.it");
    }

    @Bean
    public Utente luca(){
        return new Utente("Luca", "Luca Rossi", "luca.rossi@hotmailc.it");
    }

    @Bean
    public Utente antonio(){
        return new Utente("Antonio", "Antonio Rozzi", "antonio.rozzi@gmail.it");
    }

    @Bean
    public Postazione postazione1(){
        return new Postazione("Festa aziendale", TipoPostazione.OPEN_SPACE, 100, terrazzaSunshine());
    }

    @Bean
    public Postazione postazione2(){
        return new Postazione("Meeting lavorativo", TipoPostazione.PRIVATO, 7, ufficioBNL());
    }

    @Bean
    public Postazione postazione3(){
        return new Postazione("Premiazione di fine anno", TipoPostazione.SALA_RIUNIONI, 500, hotelRamada());
    }

    @Bean
    Prenotazione prenotazione1(){
        return new Prenotazione(LocalDate.of(2026, 7, 21), aldo(), postazione1());
    }

    @Bean
    Prenotazione prenotazione2(){
        return new Prenotazione(LocalDate.of(2026, 8, 21), luca(), postazione2());
    }

    @Bean
    Prenotazione prenotazione3(){
        return new Prenotazione(LocalDate.of(2026, 8, 19), antonio(), postazione3());
    }
}