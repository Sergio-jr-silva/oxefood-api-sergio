package br.com.ifpe.oxefood.modelo.Comprador;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.util.entity.GenericService;

@Service
public class CompradorService extends GenericService{
    

    @Autowired
    private CompradorRepository compradorRepository;

    @Transactional
   public Comprador save(Comprador comprador) {

       super.preencherCamposAuditoria(comprador);
       return compradorRepository.save(comprador);
   }

   public List<Comprador> listarTodos() {
  
    return compradorRepository.findAll();
}


public Comprador obterPorID(Long id) {

    return compradorRepository.findById(id).get();
}

@Transactional
public void update(Long id, Comprador compradorAlterado) {

    Comprador comprador = compradorRepository.findById(id).get();
    comprador.setNome(compradorAlterado.getNome());
    comprador.setContratadoEm(compradorAlterado.getContratadoEm());
    comprador.setEnderecoComercial((compradorAlterado.getEnderecoComercial()));
    comprador.setEnderecoResidencial(compradorAlterado.getEnderecoResidencial());
    comprador.setComissao(compradorAlterado.getComissao());
    comprador.setQtdComprasMediasMes(compradorAlterado.getQtdComprasMediasMes());
    comprador.setTrabalhoHomeOffice(compradorAlterado.isTrabalhoHomeOffice());
     
   super.preencherCamposAuditoria(comprador);
   compradorRepository.save(comprador);
   
}

@Transactional
   public void delete(Long id) {

       Comprador comprador = compradorRepository.findById(id).get();
       comprador.setHabilitado(Boolean.FALSE);
       super.preencherCamposAuditoria(comprador);

       compradorRepository.save(comprador);
   }

}

