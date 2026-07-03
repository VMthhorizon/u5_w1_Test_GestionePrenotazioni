package vincenzomola.u5_w1_Test_Prenotazioni.entities;

import jakarta.persistence.*;
import org.hibernate.loader.ast.spi.Loadable;

import java.time.LocalDate;

@Entity
@Table(name = "Prenotazioni")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Prenotazione")
    private long id;
    @Column(name = "data_Prenotazione")
    private LocalDate dataPrenotazione;

    @ManyToOne
    @JoinColumn(name = "id_Utente")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "id_postazione")
    private Postazione postazione;

    protected Prenotazione() {
    }

    public Prenotazione(LocalDate dataPrenotazione, Utente utente, Postazione postazione) {
        this.dataPrenotazione = dataPrenotazione;
        this.utente = utente;
        this.postazione = postazione;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", dataPrenotazione=" + dataPrenotazione +
                ", utente=" + utente +
                ", postazione=" + postazione +
                '}';
    }
}
