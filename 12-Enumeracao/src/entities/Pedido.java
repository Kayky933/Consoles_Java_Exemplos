package entities;

import java.util.Date;

import entities.enums.StatusPedido;

public class Pedido {
    private Integer id;
    private Date dataPedido;
    private StatusPedido status;

    public Pedido() {
    }

    public Pedido(Integer id, Date dataPedido, StatusPedido status) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.status = status;
    }

    public String toString() {
        return "Pedido \nid=" + id + "\nData= "+dataPedido+"\nStatus= "+status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

}
