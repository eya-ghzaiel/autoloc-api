package tn.esprit.autolocapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiment;
    BigDecimal montant;
    LocalDate datePaiment;
    ModePaiment modePaiment;

}
