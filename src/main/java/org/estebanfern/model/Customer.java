package org.estebanfern.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

    private String ruc;
    private String email;
    private String ciudad;
    private String nombre;
    private String telefono;
    private String direccion;
    private String documento;
    private String coordenadas;
    @JsonProperty("razon_social")
    private String razonSocial;
    @JsonProperty("tipo_documento")
    private String tipoDocumento;
    @JsonProperty("direccion_referencia")
    private String direccionReferencia;

    public Customer() {
    }

    public Customer(String ruc, String email, String ciudad, String nombre, String telefono, String direccion, String documento, String coordenadas, String razonSocial, String tipoDocumento, String direccionReferencia) {
        this.ruc = ruc;
        this.email = email;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.documento = documento;
        this.coordenadas = coordenadas;
        this.razonSocial = razonSocial;
        this.tipoDocumento = tipoDocumento;
        this.direccionReferencia = direccionReferencia;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDireccionReferencia() {
        return direccionReferencia;
    }

    public void setDireccionReferencia(String direccionReferencia) {
        this.direccionReferencia = direccionReferencia;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ruc='" + ruc + '\'' +
                ", email='" + email + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", documento='" + documento + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", direccionReferencia='" + direccionReferencia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;

        if (!Objects.equals(ruc, customer.ruc)) return false;
        if (!Objects.equals(email, customer.email)) return false;
        if (!Objects.equals(ciudad, customer.ciudad)) return false;
        if (!Objects.equals(nombre, customer.nombre)) return false;
        if (!Objects.equals(telefono, customer.telefono)) return false;
        if (!Objects.equals(direccion, customer.direccion)) return false;
        if (!Objects.equals(documento, customer.documento)) return false;
        if (!Objects.equals(coordenadas, customer.coordenadas))
            return false;
        if (!Objects.equals(razonSocial, customer.razonSocial))
            return false;
        if (!Objects.equals(tipoDocumento, customer.tipoDocumento))
            return false;
        return Objects.equals(direccionReferencia, customer.direccionReferencia);
    }

    @Override
    public int hashCode() {
        int result = ruc != null ? ruc.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (ciudad != null ? ciudad.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (documento != null ? documento.hashCode() : 0);
        result = 31 * result + (coordenadas != null ? coordenadas.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (tipoDocumento != null ? tipoDocumento.hashCode() : 0);
        result = 31 * result + (direccionReferencia != null ? direccionReferencia.hashCode() : 0);
        return result;
    }

}
