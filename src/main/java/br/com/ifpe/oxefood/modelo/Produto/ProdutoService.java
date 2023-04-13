package br.com.ifpe.oxefood.modelo.Produto;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ifpe.oxefood.util.entity.GenericService;

public class ProdutoService extends GenericService{
    
    @Autowired
    private ProdutoRepository repository;
    
    @Transactional
    public Produto save(Produto produto) {
 
        super.preencherCamposAuditoria(produto);
        return repository.save(produto);
    }
}
