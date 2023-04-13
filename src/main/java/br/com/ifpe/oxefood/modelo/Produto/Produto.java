package br.com.ifpe.oxefood.modelo.Produto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;

@Entity
@Table(name = "Produto")
@Where(clause = "habilitado = true")
public class  Produto extends EntidadeAuditavel  implements Serializable{

   @Column
   private String codigo;

   @Column
   private String titulo;

   @Column
   private String descricao;

   @Column
   private double valorUnitario;

   @Column
   private int tempoEntregaMinimo;

   @Column
   private int tempoEntregaMaximo;

}