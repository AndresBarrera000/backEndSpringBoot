package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer num_detalle;

    private Integer id_factura;

    private Integer id_producto;

    private Integer cantidad;

    private Double precio;

    public Integer getNum_detalle() {
        return this.num_detalle;
    }

    public void setNum_detalle(Integer num_detalle) {
        this.num_detalle = num_detalle;
    }

    public Integer getId_factura() {
        return this.id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public Integer getId_producto() {
        return this.id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
