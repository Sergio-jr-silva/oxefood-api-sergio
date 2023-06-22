package br.com.ifpe.oxefood.modelo.CategoriaProduto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.util.entity.GenericService;

@Service
public class CategoriaProdutoService extends GenericService{

    @Autowired
   private CategoriaProdutoRepository categoriaProdutoRepository;

   @Transactional
   public CategoriaProduto save(CategoriaProduto categoria) {

       super.preencherCamposAuditoria(categoria);
       return categoriaProdutoRepository.save(categoria);
   }

   
   public List<CategoriaProduto> listarTodos() {
  
    return categoriaProdutoRepository.findAll();
}

public CategoriaProduto obterPorID(Long id) {

    return categoriaProdutoRepository.findById(id).get();
}

@Transactional
public void update(Long id, CategoriaProduto categoria) {

   CategoriaProduto categoriaProduto = categoriaProdutoRepository.findById(id).get();
   categoriaProduto.setDescricao(categoria.getDescricao());
     
   super.preencherCamposAuditoria(categoria);
   categoriaProdutoRepository.save(categoria);
   
}

@Transactional
   public void delete(Long id) {

       CategoriaProduto categoriaProduto = categoriaProdutoRepository.findById(id).get();
       categoriaProduto.setHabilitado(Boolean.FALSE);
       super.preencherCamposAuditoria(categoriaProduto);

       categoriaProdutoRepository.save(categoriaProduto);
   }

}
