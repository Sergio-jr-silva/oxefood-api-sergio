package br.com.ifpe.oxefood.modelo.Comprador;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;
import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Comprador")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comprador extends EntidadeAuditavel{
    
    @Column
    private String nome;
    
    @Column
    private String enderecoComercial;
    
    @Column
    private String enderecoResidencial;

    @Column
    private double comissao;

    @Column
    private boolean trabalhoHomeOffice;

    @Column
    private int qtdComprasMediasMes;

    @Column
    private LocalDate contratoEm;
}
