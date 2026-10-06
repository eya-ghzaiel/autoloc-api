package tn.esprit.autolocapi.domain;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reservation_id", referencedColumnName = "idReservation",
            nullable = false, unique = true)
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Paiement> paiements = new ArrayList<>();

    public void addPaiement(Paiement p) {
        paiements.add(p);
        p.setContrat(this);
    }

    public void removePaiement(Paiement p) {
        paiements.remove(p);      // orphanRemoval : le paiement est supprimé de la base
        p.setContrat(null);
    }
}