package br.com.ifpe.oxefood.modelo.Entregador;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.util.entity.GenericService;

@Service
public class EntregadorService extends GenericService {

   @Autowired
   private EntregadorRepository repository;

   @Transactional
   public Entregador save(Entregador Entregador) {

       super.preencherCamposAuditoria(Entregador);
       return repository.save(Entregador);
   }

   

   public List<Entregador> listarTodos() {
  
    return repository.findAll();
}

public Entregador obterPorID(Long id) {
    return repository.findById(id).get();

}


@Transactional
public void update(Long id, Entregador entregadorAlterado) {

   Entregador entregador = repository.findById(id).get();
   entregador.setNome(entregadorAlterado.getNome());
   entregador.setDataNascimento(entregadorAlterado.getDataNascimento());
   entregador.setCpf(entregadorAlterado.getCpf());
   entregador.setFoneCelular(entregadorAlterado.getFoneCelular());
   entregador.setFoneFixo(entregadorAlterado.getFoneFixo());
   entregador.setEnderecoBairro(entregadorAlterado.getEnderecoBairro());
   entregador.setEnderecoCep(entregadorAlterado.getEnderecoCep());
   entregador.setEnderecoCidade(entregadorAlterado.getEnderecoCidade());
   entregador.setEnderecoComplemento(entregadorAlterado.getEnderecoComplemento());
   entregador.setEnderecoNumero(entregadorAlterado.getEnderecoNumero());
   entregador.setEnderecoRua(entregadorAlterado.getEnderecoRua());
   entregador.setEnderecoUf(entregadorAlterado.getEnderecoUf());
     
   super.preencherCamposAuditoria(entregador);
   repository.save(entregador);
   
}

@Transactional
   public void delete(Long id) {

       Entregador entregador = repository.findById(id).get();
       entregador.setHabilitado(Boolean.FALSE);
       super.preencherCamposAuditoria(entregador);

       repository.save(entregador);
   }

}