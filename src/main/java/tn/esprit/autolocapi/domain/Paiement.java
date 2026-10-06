package tn.esprit.autolocapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiment;
    private BigDecimal montant;
    private LocalDate datePaiment;
    @Enumerated(EnumType.STRING)
    private ModePaiment modePaiment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contrat_id", referencedColumnName = "idContrat", nullable = false)
    @JsonIgnore
    private Contrat contrat;

}
