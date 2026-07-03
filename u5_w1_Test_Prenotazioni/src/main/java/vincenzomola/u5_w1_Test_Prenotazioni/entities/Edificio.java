package vincenzomola.u5_w1_Test_Prenotazioni.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Edifici")
public class Edificio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Edificio")
    private long id;
    private String nome;
    private String indirizzo;
    private String città;

    protected Edificio(){}

    public Edificio(String nome, String indirizzo, String città){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.città = città;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", città='" + città + '\'' +
                '}';
    }
}
