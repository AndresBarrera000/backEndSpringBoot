package com.example.accessingdatamysql;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class   
public class Factura {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer num_factura;

  private Integer id_cliente;

  private Date fecha;

  public Integer getNum_factura() {
    return num_factura;
  }
  public void setNum_factura(Integer num_factura) {
    this.num_factura = num_factura;
  }  

  public Integer getId_cliente() {
    return id_cliente;
  }

  public void setId_cliente(Integer id_cliente) {
    this.id_cliente = id_cliente;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
}

