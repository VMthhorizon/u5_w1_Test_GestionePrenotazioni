package vincenzomola.u5_w1_Test_Prenotazioni.entities;

import jakarta.persistence.*;
import vincenzomola.u5_w1_Test_Prenotazioni.enums.TipoPostazione;

@Entity
@Table(name = "Postazioni")
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Postazione")
    private long id;

    private String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name ="tipo_Postazione")
    private TipoPostazione tipoPostazione;
    @Column(name = "max_Occupanti")
    private long maxOccupanti;

    @ManyToOne
    @JoinColumn(name="id_edificio", nullable = false)
    private Edificio edificio;

    protected Postazione(){}

    public Postazione(String descrizione, TipoPostazione tipoPostazione, long maxOccupanti, Edificio edificio){
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxOccupanti = maxOccupanti;
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", maxOccupanti=" + maxOccupanti +
                ", edificio=" + edificio +
                '}';
    }
}
