package br.com.ifpe.oxefood.api.CategoriaProduto;

import br.com.ifpe.oxefood.modelo.CategoriaProduto.CategoriaProduto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoRequest {
    
    private String Descricao;

     public CategoriaProduto build() {

       return CategoriaProduto.builder()
               .Descricao(Descricao)
               .build();
   }
}
