package org.estebanfern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {

    String ciudad;
    private String nombre;
    private Integer cantidad;
    private String categoria;
    @JsonProperty("public_key")
    private String publicKey;
    @JsonProperty("url_imagen")
    private String urlImagen;
    private String descripcion;
    @JsonProperty("id_producto")
    private Integer idProducto;
    @JsonProperty("precio_total")
    private Integer precioTotal;
    @JsonProperty("vendedor_telefono")
    private String vendedorTelefono;
    @JsonProperty("vendedor_direccion")
    private String vendedorDireccion;
    @JsonProperty("vendedor_direccion_referencia")
    private String vendedorDireccionReferencia;
    @JsonProperty("vendedor_direccion_coordenadas")
    private String vendedorDireccionCoordenadas;

    public Item() {
    }

    public Item(String ciudad, String nombre, Integer cantidad, String categoria, String publicKey, String urlImagen, String descripcion, Integer idProducto, Integer precioTotal, String vendedorTelefono, String vendedorDireccion, String vendedorDireccionReferencia, String vendedorDireccionCoordenadas) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.publicKey = publicKey;
        this.urlImagen = urlImagen;
        this.descripcion = descripcion;
        this.idProducto = idProducto;
        this.precioTotal = precioTotal;
        this.vendedorTelefono = vendedorTelefono;
        this.vendedorDireccion = vendedorDireccion;
        this.vendedorDireccionReferencia = vendedorDireccionReferencia;
        this.vendedorDireccionCoordenadas = vendedorDireccionCoordenadas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getVendedorTelefono() {
        return vendedorTelefono;
    }

    public void setVendedorTelefono(String vendedorTelefono) {
        this.vendedorTelefono = vendedorTelefono;
    }

    public String getVendedorDireccion() {
        return vendedorDireccion;
    }

    public void setVendedorDireccion(String vendedorDireccion) {
        this.vendedorDireccion = vendedorDireccion;
    }

    public String getVendedorDireccionReferencia() {
        return vendedorDireccionReferencia;
    }

    public void setVendedorDireccionReferencia(String vendedorDireccionReferencia) {
        this.vendedorDireccionReferencia = vendedorDireccionReferencia;
    }

    public String getVendedorDireccionCoordenadas() {
        return vendedorDireccionCoordenadas;
    }

    public void setVendedorDireccionCoordenadas(String vendedorDireccionCoordenadas) {
        this.vendedorDireccionCoordenadas = vendedorDireccionCoordenadas;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ciudad='" + ciudad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", categoria='" + categoria + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", idProducto=" + idProducto +
                ", precioTotal=" + precioTotal +
                ", vendedorTelefono='" + vendedorTelefono + '\'' +
                ", vendedorDireccion='" + vendedorDireccion + '\'' +
                ", vendedorDireccionReferencia='" + vendedorDireccionReferencia + '\'' +
                ", vendedorDireccionCoordenadas='" + vendedorDireccionCoordenadas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;

        if (!Objects.equals(ciudad, item.ciudad)) return false;
        if (!Objects.equals(nombre, item.nombre)) return false;
        if (!Objects.equals(cantidad, item.cantidad)) return false;
        if (!Objects.equals(categoria, item.categoria)) return false;
        if (!Objects.equals(publicKey, item.publicKey)) return false;
        if (!Objects.equals(urlImagen, item.urlImagen)) return false;
        if (!Objects.equals(descripcion, item.descripcion)) return false;
        if (!Objects.equals(idProducto, item.idProducto)) return false;
        if (!Objects.equals(precioTotal, item.precioTotal)) return false;
        if (!Objects.equals(vendedorTelefono, item.vendedorTelefono))
            return false;
        if (!Objects.equals(vendedorDireccion, item.vendedorDireccion))
            return false;
        if (!Objects.equals(vendedorDireccionReferencia, item.vendedorDireccionReferencia))
            return false;
        return Objects.equals(vendedorDireccionCoordenadas, item.vendedorDireccionCoordenadas);
    }

    @Override
    public int hashCode() {
        int result = ciudad != null ? ciudad.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        result = 31 * result + (urlImagen != null ? urlImagen.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (idProducto != null ? idProducto.hashCode() : 0);
        result = 31 * result + (precioTotal != null ? precioTotal.hashCode() : 0);
        result = 31 * result + (vendedorTelefono != null ? vendedorTelefono.hashCode() : 0);
        result = 31 * result + (vendedorDireccion != null ? vendedorDireccion.hashCode() : 0);
        result = 31 * result + (vendedorDireccionReferencia != null ? vendedorDireccionReferencia.hashCode() : 0);
        result = 31 * result + (vendedorDireccionCoordenadas != null ? vendedorDireccionCoordenadas.hashCode() : 0);
        return result;
    }

}
