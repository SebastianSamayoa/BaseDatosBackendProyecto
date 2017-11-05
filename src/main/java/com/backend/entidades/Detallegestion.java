/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "DETALLEGESTION", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallegestion.findAll", query = "SELECT d FROM Detallegestion d"),
    @NamedQuery(name = "Detallegestion.findByIdgestion", query = "SELECT d FROM Detallegestion d WHERE d.detallegestionPK.idgestion = :idgestion"),
    @NamedQuery(name = "Detallegestion.findByIddetalle", query = "SELECT d FROM Detallegestion d WHERE d.detallegestionPK.iddetalle = :iddetalle"),
    @NamedQuery(name = "Detallegestion.findByTipofactura", query = "SELECT d FROM Detallegestion d WHERE d.tipofactura = :tipofactura"),
    @NamedQuery(name = "Detallegestion.findByNumerofactura", query = "SELECT d FROM Detallegestion d WHERE d.numerofactura = :numerofactura"),
    @NamedQuery(name = "Detallegestion.findByMonto", query = "SELECT d FROM Detallegestion d WHERE d.monto = :monto")})
public class Detallegestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallegestionPK detallegestionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "TIPOFACTURA", nullable = false, length = 2)
    private String tipofactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROFACTURA", nullable = false)
    private BigInteger numerofactura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO", nullable = false, precision = 10, scale = 4)
    private BigDecimal monto;
    @JoinColumn(name = "IDGESTION", referencedColumnName = "IDGESTION", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Ctrgestiones ctrgestiones;

    public Detallegestion() {
    }

    public Detallegestion(DetallegestionPK detallegestionPK) {
        this.detallegestionPK = detallegestionPK;
    }

    public Detallegestion(DetallegestionPK detallegestionPK, String tipofactura, BigInteger numerofactura, BigDecimal monto) {
        this.detallegestionPK = detallegestionPK;
        this.tipofactura = tipofactura;
        this.numerofactura = numerofactura;
        this.monto = monto;
    }

    public Detallegestion(BigInteger idgestion, BigInteger iddetalle) {
        this.detallegestionPK = new DetallegestionPK(idgestion, iddetalle);
    }

    public DetallegestionPK getDetallegestionPK() {
        return detallegestionPK;
    }

    public void setDetallegestionPK(DetallegestionPK detallegestionPK) {
        this.detallegestionPK = detallegestionPK;
    }

    public String getTipofactura() {
        return tipofactura;
    }

    public void setTipofactura(String tipofactura) {
        this.tipofactura = tipofactura;
    }

    public BigInteger getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(BigInteger numerofactura) {
        this.numerofactura = numerofactura;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Ctrgestiones getCtrgestiones() {
        return ctrgestiones;
    }

    public void setCtrgestiones(Ctrgestiones ctrgestiones) {
        this.ctrgestiones = ctrgestiones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallegestionPK != null ? detallegestionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallegestion)) {
            return false;
        }
        Detallegestion other = (Detallegestion) object;
        if ((this.detallegestionPK == null && other.detallegestionPK != null) || (this.detallegestionPK != null && !this.detallegestionPK.equals(other.detallegestionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Detallegestion[ detallegestionPK=" + detallegestionPK + " ]";
    }
    
}
