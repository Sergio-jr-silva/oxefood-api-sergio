package br.com.ifpe.oxefood.modelo.Entregador;

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

}