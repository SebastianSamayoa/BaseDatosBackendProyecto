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
@Table(name = "DETALLEVENCIMIENTOS", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallevencimientos.findAll", query = "SELECT d FROM Detallevencimientos d"),
    @NamedQuery(name = "Detallevencimientos.findByIddetalle", query = "SELECT d FROM Detallevencimientos d WHERE d.iddetalle = :iddetalle"),
    @NamedQuery(name = "Detallevencimientos.findByEstadoEjecucion", query = "SELECT d FROM Detallevencimientos d WHERE d.estadoEjecucion = :estadoEjecucion"),
    @NamedQuery(name = "Detallevencimientos.findByInicioEjecucion", query = "SELECT d FROM Detallevencimientos d WHERE d.inicioEjecucion = :inicioEjecucion"),
    @NamedQuery(name = "Detallevencimientos.findByFinEjecucion", query = "SELECT d FROM Detallevencimientos d WHERE d.finEjecucion = :finEjecucion")})
public class Detallevencimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDETALLE", nullable = false, precision = 0, scale = -127)
    private BigDecimal iddetalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ESTADO_EJECUCION", nullable = false, length = 2)
    private String estadoEjecucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INICIO_EJECUCION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicioEjecucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIN_EJECUCION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date finEjecucion;
    @JoinColumn(name = "IDCTRVENCIMIENTO", referencedColumnName = "IDCTRVENCIMIENTO")
    @ManyToOne(fetch = FetchType.EAGER)
    private Ctrvencimientos idctrvencimiento;

    public Detallevencimientos() {
    }

    public Detallevencimientos(BigDecimal iddetalle) {
        this.iddetalle = iddetalle;
    }

    public Detallevencimientos(BigDecimal iddetalle, String estadoEjecucion, Date inicioEjecucion, Date finEjecucion) {
        this.iddetalle = iddetalle;
        this.estadoEjecucion = estadoEjecucion;
        this.inicioEjecucion = inicioEjecucion;
        this.finEjecucion = finEjecucion;
    }

    public BigDecimal getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(BigDecimal iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getEstadoEjecucion() {
        return estadoEjecucion;
    }

    public void setEstadoEjecucion(String estadoEjecucion) {
        this.estadoEjecucion = estadoEjecucion;
    }

    public Date getInicioEjecucion() {
        return inicioEjecucion;
    }

    public void setInicioEjecucion(Date inicioEjecucion) {
        this.inicioEjecucion = inicioEjecucion;
    }

    public Date getFinEjecucion() {
        return finEjecucion;
    }

    public void setFinEjecucion(Date finEjecucion) {
        this.finEjecucion = finEjecucion;
    }

    public Ctrvencimientos getIdctrvencimiento() {
        return idctrvencimiento;
    }

    public void setIdctrvencimiento(Ctrvencimientos idctrvencimiento) {
        this.idctrvencimiento = idctrvencimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalle != null ? iddetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallevencimientos)) {
            return false;
        }
        Detallevencimientos other = (Detallevencimientos) object;
        if ((this.iddetalle == null && other.iddetalle != null) || (this.iddetalle != null && !this.iddetalle.equals(other.iddetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Detallevencimientos[ iddetalle=" + iddetalle + " ]";
    }
    
}
