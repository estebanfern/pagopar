package org.estebanfern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Pedido implements Serializable {

    private String token;
    private Customer comprador;
    @JsonProperty("public_key")
    private String publicKey;
    @JsonProperty("monto_total")
    private Long montoTotal;
    @JsonProperty("tipo_pedido")
    private String tipoPedido;
    @JsonProperty("compras_items")
    private List<Item> items;
    @JsonProperty("fecha_maxima_pago")
    private LocalDateTime fechaMaximaPago;
    @JsonProperty("id_pedido_comercio")
    private String idPedido;
    @JsonProperty("descripcion_resumen")
    private String descripcionResumen;

    public Pedido() {
    }

    public Pedido(String token, Customer comprador, String publicKey, Long montoTotal, String tipoPedido, List<Item> items, LocalDateTime fechaMaximaPago, String idPedido, String descripcionResumen) {
        this.token = token;
        this.comprador = comprador;
        this.publicKey = publicKey;
        this.montoTotal = montoTotal;
        this.tipoPedido = tipoPedido;
        this.items = items;
        this.fechaMaximaPago = fechaMaximaPago;
        this.idPedido = idPedido;
        this.descripcionResumen = descripcionResumen;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Customer getComprador() {
        return comprador;
    }

    public void setComprador(Customer comprador) {
        this.comprador = comprador;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Long getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Long montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public LocalDateTime getFechaMaximaPago() {
        return fechaMaximaPago;
    }

    public void setFechaMaximaPago(LocalDateTime fechaMaximaPago) {
        this.fechaMaximaPago = fechaMaximaPago;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescripcionResumen() {
        return descripcionResumen;
    }

    public void setDescripcionResumen(String descripcionResumen) {
        this.descripcionResumen = descripcionResumen;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "token='" + token + '\'' +
                ", comprador=" + comprador +
                ", publicKey='" + publicKey + '\'' +
                ", montoTotal=" + montoTotal +
                ", tipoPedido='" + tipoPedido + '\'' +
                ", items=" + items +
                ", fechaMaximaPago=" + fechaMaximaPago +
                ", idPedido='" + idPedido + '\'' +
                ", descripcionResumen='" + descripcionResumen + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido pedido)) return false;

        if (!Objects.equals(token, pedido.token)) return false;
        if (!Objects.equals(comprador, pedido.comprador)) return false;
        if (!Objects.equals(publicKey, pedido.publicKey)) return false;
        if (!Objects.equals(montoTotal, pedido.montoTotal)) return false;
        if (!Objects.equals(tipoPedido, pedido.tipoPedido)) return false;
        if (!Objects.equals(items, pedido.items)) return false;
        if (!Objects.equals(fechaMaximaPago, pedido.fechaMaximaPago))
            return false;
        if (!Objects.equals(idPedido, pedido.idPedido)) return false;
        return Objects.equals(descripcionResumen, pedido.descripcionResumen);
    }

    @Override
    public int hashCode() {
        int result = token != null ? token.hashCode() : 0;
        result = 31 * result + (comprador != null ? comprador.hashCode() : 0);
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        result = 31 * result + (montoTotal != null ? montoTotal.hashCode() : 0);
        result = 31 * result + (tipoPedido != null ? tipoPedido.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        result = 31 * result + (fechaMaximaPago != null ? fechaMaximaPago.hashCode() : 0);
        result = 31 * result + (idPedido != null ? idPedido.hashCode() : 0);
        result = 31 * result + (descripcionResumen != null ? descripcionResumen.hashCode() : 0);
        return result;
    }

}
