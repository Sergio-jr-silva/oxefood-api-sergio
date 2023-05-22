package br.com.ifpe.oxefood.api.Comprador;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.Comprador.Comprador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CompradorRequest {

    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate contratoEm;
    
    private String enderecoComercial;

    private String enderecoResidencial;

    private double comissao;

    private boolean trabalhoHomeOffice;

    private int qtdComprasMediasMes;

    

    public Comprador build() {

        return Comprador.builder()
                .nome(nome)
                .enderecoComercial(enderecoComercial)
                .enderecoResidencial(enderecoResidencial)
                .comissao(comissao)
                .trabalhoHomeOffice(trabalhoHomeOffice)
                .qtdComprasMediasMes(qtdComprasMediasMes)
                .contratoEm(contratoEm)
                .build();
    }
}
