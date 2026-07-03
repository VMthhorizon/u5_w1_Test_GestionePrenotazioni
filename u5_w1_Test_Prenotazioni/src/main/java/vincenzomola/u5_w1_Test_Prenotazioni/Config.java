package vincenzomola.u5_w1_Test_Prenotazioni;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vincenzomola.u5_w1_Test_Prenotazioni.entities.Edificio;

@Configuration
public class Config {

    @Bean
    public Edificio hotelRamada(){
        return new Edificio("Hotel Ramada", "via Napoli 88", "Napoli");
    }@Bean
    public Edificio ufficioBNL(){
        return new Edificio("Ufficio BNL", "via Garibaldi 13", "Milano");
    }
    @Bean
    public Edificio terrazzaSunshine(){
        return new Edificio("Terrazza Sunshine", "via Chiaia 44", "Firenze");
    }

}

