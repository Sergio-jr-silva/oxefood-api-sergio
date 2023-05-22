package br.com.ifpe.oxefood.modelo.Comprador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompradorRepository extends JpaRepository<Comprador, Long>{

    Comprador save(CompradorRepository compradorRepository);
    
}
