package vincenzomola.u5_w1_Test_Prenotazioni.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="Utenti")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_Utente")
    private long id;
    private String username;
    private String nomeCompleto;
    private String email;

    protected Utente(){}

    public Utente(String username, String nomeCompleto, String email){
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
