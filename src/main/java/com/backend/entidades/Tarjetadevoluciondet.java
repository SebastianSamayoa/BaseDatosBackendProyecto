/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "TARJETADEVOLUCIONDET", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjetadevoluciondet.findAll", query = "SELECT t FROM Tarjetadevoluciondet t"),
    @NamedQuery(name = "Tarjetadevoluciondet.findByIdtarjetadevdet", query = "SELECT t FROM Tarjetadevoluciondet t WHERE t.idtarjetadevdet = :idtarjetadevdet"),
    @NamedQuery(name = "Tarjetadevoluciondet.findByMonto", query = "SELECT t FROM Tarjetadevoluciondet t WHERE t.monto = :monto"),
    @NamedQuery(name = "Tarjetadevoluciondet.findBySaldo", query = "SELECT t FROM Tarjetadevoluciondet t WHERE t.saldo = :saldo"),
    @NamedQuery(name = "Tarjetadevoluciondet.findByUsuario", query = "SELECT t FROM Tarjetadevoluciondet t WHERE t.usuario = :usuario"),
    @NamedQuery(name = "Tarjetadevoluciondet.findByFechacreacion", query = "SELECT t FROM Tarjetadevoluciondet t WHERE t.fechacreacion = :fechacreacion")})
public class Tarjetadevoluciondet implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTARJETADEVDET", nullable = false, precision = 0, scale = -127)
    private BigDecimal idtarjetadevdet;
    @Column(name = "MONTO", precision = 8, scale = 2)
    private BigDecimal monto;
    @Column(name = "SALDO", precision = 8, scale = 2)
    private BigDecimal saldo;
    @Size(max = 10)
    @Column(name = "USUARIO", length = 10)
    private String usuario;
    @Column(name = "FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @JoinColumn(name = "IDTARJETADEV", referencedColumnName = "IDTARJETADEV")
    @ManyToOne(fetch = FetchType.EAGER)
    private Tarjetadevolucion idtarjetadev;

    public Tarjetadevoluciondet() {
    }

    public Tarjetadevoluciondet(BigDecimal idtarjetadevdet) {
        this.idtarjetadevdet = idtarjetadevdet;
    }

    public BigDecimal getIdtarjetadevdet() {
        return idtarjetadevdet;
    }

    public void setIdtarjetadevdet(BigDecimal idtarjetadevdet) {
        this.idtarjetadevdet = idtarjetadevdet;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Tarjetadevolucion getIdtarjetadev() {
        return idtarjetadev;
    }

    public void setIdtarjetadev(Tarjetadevolucion idtarjetadev) {
        this.idtarjetadev = idtarjetadev;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjetadevdet != null ? idtarjetadevdet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetadevoluciondet)) {
            return false;
        }
        Tarjetadevoluciondet other = (Tarjetadevoluciondet) object;
        if ((this.idtarjetadevdet == null && other.idtarjetadevdet != null) || (this.idtarjetadevdet != null && !this.idtarjetadevdet.equals(other.idtarjetadevdet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Tarjetadevoluciondet[ idtarjetadevdet=" + idtarjetadevdet + " ]";
    }
    
}
