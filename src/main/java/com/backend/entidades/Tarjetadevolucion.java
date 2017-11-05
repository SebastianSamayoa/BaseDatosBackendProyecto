/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "TARJETADEVOLUCION", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjetadevolucion.findAll", query = "SELECT t FROM Tarjetadevolucion t"),
    @NamedQuery(name = "Tarjetadevolucion.findByIdtarjetadev", query = "SELECT t FROM Tarjetadevolucion t WHERE t.idtarjetadev = :idtarjetadev"),
    @NamedQuery(name = "Tarjetadevolucion.findByMonto", query = "SELECT t FROM Tarjetadevolucion t WHERE t.monto = :monto"),
    @NamedQuery(name = "Tarjetadevolucion.findBySaldodisp", query = "SELECT t FROM Tarjetadevolucion t WHERE t.saldodisp = :saldodisp"),
    @NamedQuery(name = "Tarjetadevolucion.findByEstado", query = "SELECT t FROM Tarjetadevolucion t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tarjetadevolucion.findByFechacreacion", query = "SELECT t FROM Tarjetadevolucion t WHERE t.fechacreacion = :fechacreacion")})
public class Tarjetadevolucion implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTARJETADEV", nullable = false, precision = 0, scale = -127)
    private BigDecimal idtarjetadev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO", nullable = false, precision = 8, scale = 2)
    private BigDecimal monto;
    @Column(name = "SALDODISP", precision = 8, scale = 2)
    private BigDecimal saldodisp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHACREACION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @OneToMany(mappedBy = "idtarjetadev", fetch = FetchType.EAGER)
    private List<Tarjetadevoluciondet> tarjetadevoluciondetList;
    @JoinColumn(name = "IDCTRAUTORIZACION", referencedColumnName = "IDCTRAUTORIZACION")
    @ManyToOne(fetch = FetchType.EAGER)
    private Ctrautorizaciones idctrautorizacion;

    public Tarjetadevolucion() {
    }

    public Tarjetadevolucion(BigDecimal idtarjetadev) {
        this.idtarjetadev = idtarjetadev;
    }

    public Tarjetadevolucion(BigDecimal idtarjetadev, BigDecimal monto, String estado, Date fechacreacion) {
        this.idtarjetadev = idtarjetadev;
        this.monto = monto;
        this.estado = estado;
        this.fechacreacion = fechacreacion;
    }

    public BigDecimal getIdtarjetadev() {
        return idtarjetadev;
    }

    public void setIdtarjetadev(BigDecimal idtarjetadev) {
        this.idtarjetadev = idtarjetadev;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getSaldodisp() {
        return saldodisp;
    }

    public void setSaldodisp(BigDecimal saldodisp) {
        this.saldodisp = saldodisp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @XmlTransient
    public List<Tarjetadevoluciondet> getTarjetadevoluciondetList() {
        return tarjetadevoluciondetList;
    }

    public void setTarjetadevoluciondetList(List<Tarjetadevoluciondet> tarjetadevoluciondetList) {
        this.tarjetadevoluciondetList = tarjetadevoluciondetList;
    }

    public Ctrautorizaciones getIdctrautorizacion() {
        return idctrautorizacion;
    }

    public void setIdctrautorizacion(Ctrautorizaciones idctrautorizacion) {
        this.idctrautorizacion = idctrautorizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjetadev != null ? idtarjetadev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetadevolucion)) {
            return false;
        }
        Tarjetadevolucion other = (Tarjetadevolucion) object;
        if ((this.idtarjetadev == null && other.idtarjetadev != null) || (this.idtarjetadev != null && !this.idtarjetadev.equals(other.idtarjetadev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Tarjetadevolucion[ idtarjetadev=" + idtarjetadev + " ]";
    }
    
}
