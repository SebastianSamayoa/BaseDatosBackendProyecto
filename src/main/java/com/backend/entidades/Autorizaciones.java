/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "AUTORIZACIONES", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autorizaciones.findAll", query = "SELECT a FROM Autorizaciones a"),
    @NamedQuery(name = "Autorizaciones.findByIdautorizacion", query = "SELECT a FROM Autorizaciones a WHERE a.idautorizacion = :idautorizacion"),
    @NamedQuery(name = "Autorizaciones.findByMontomaximo", query = "SELECT a FROM Autorizaciones a WHERE a.montomaximo = :montomaximo"),
    @NamedQuery(name = "Autorizaciones.findByEstado", query = "SELECT a FROM Autorizaciones a WHERE a.estado = :estado"),
    @NamedQuery(name = "Autorizaciones.findByIdusuario", query = "SELECT a FROM Autorizaciones a WHERE a.idusuario = :idusuario")})
public class Autorizaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAUTORIZACION", nullable = false, precision = 0, scale = -127)
    private BigDecimal idautorizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTOMAXIMO", nullable = false)
    private BigInteger montomaximo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIO", nullable = false)
    private BigInteger idusuario;
    @OneToMany(mappedBy = "idautorizacion", fetch = FetchType.EAGER)
    private List<Ctrautorizaciones> ctrautorizacionesList;

    public Autorizaciones() {
    }

    public Autorizaciones(BigDecimal idautorizacion) {
        this.idautorizacion = idautorizacion;
    }

    public Autorizaciones(BigDecimal idautorizacion, BigInteger montomaximo, String estado, BigInteger idusuario) {
        this.idautorizacion = idautorizacion;
        this.montomaximo = montomaximo;
        this.estado = estado;
        this.idusuario = idusuario;
    }

    public BigDecimal getIdautorizacion() {
        return idautorizacion;
    }

    public void setIdautorizacion(BigDecimal idautorizacion) {
        this.idautorizacion = idautorizacion;
    }

    public BigInteger getMontomaximo() {
        return montomaximo;
    }

    public void setMontomaximo(BigInteger montomaximo) {
        this.montomaximo = montomaximo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(BigInteger idusuario) {
        this.idusuario = idusuario;
    }

    @XmlTransient
    public List<Ctrautorizaciones> getCtrautorizacionesList() {
        return ctrautorizacionesList;
    }

    public void setCtrautorizacionesList(List<Ctrautorizaciones> ctrautorizacionesList) {
        this.ctrautorizacionesList = ctrautorizacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idautorizacion != null ? idautorizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autorizaciones)) {
            return false;
        }
        Autorizaciones other = (Autorizaciones) object;
        if ((this.idautorizacion == null && other.idautorizacion != null) || (this.idautorizacion != null && !this.idautorizacion.equals(other.idautorizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Autorizaciones[ idautorizacion=" + idautorizacion + " ]";
    }
    
}
