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
@Table(name = "CTRVENCIMIENTOS", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ctrvencimientos.findAll", query = "SELECT c FROM Ctrvencimientos c"),
    @NamedQuery(name = "Ctrvencimientos.findByIdctrvencimiento", query = "SELECT c FROM Ctrvencimientos c WHERE c.idctrvencimiento = :idctrvencimiento"),
    @NamedQuery(name = "Ctrvencimientos.findByEstado", query = "SELECT c FROM Ctrvencimientos c WHERE c.estado = :estado"),
    @NamedQuery(name = "Ctrvencimientos.findByFechaVencimiento", query = "SELECT c FROM Ctrvencimientos c WHERE c.fechaVencimiento = :fechaVencimiento")})
public class Ctrvencimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCTRVENCIMIENTO", nullable = false, precision = 0, scale = -127)
    private BigDecimal idctrvencimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_VENCIMIENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @JoinColumn(name = "IDGESTION", referencedColumnName = "IDGESTION")
    @ManyToOne(fetch = FetchType.EAGER)
    private Ctrgestiones idgestion;
    @JoinColumn(name = "ID_NOTIFICADOR", referencedColumnName = "ID_NOTIFICADOR")
    @ManyToOne(fetch = FetchType.EAGER)
    private Notificadores idNotificador;
    @OneToMany(mappedBy = "idctrvencimiento", fetch = FetchType.EAGER)
    private List<Detallevencimientos> detallevencimientosList;

    public Ctrvencimientos() {
    }

    public Ctrvencimientos(BigDecimal idctrvencimiento) {
        this.idctrvencimiento = idctrvencimiento;
    }

    public Ctrvencimientos(BigDecimal idctrvencimiento, String estado, Date fechaVencimiento) {
        this.idctrvencimiento = idctrvencimiento;
        this.estado = estado;
        this.fechaVencimiento = fechaVencimiento;
    }

    public BigDecimal getIdctrvencimiento() {
        return idctrvencimiento;
    }

    public void setIdctrvencimiento(BigDecimal idctrvencimiento) {
        this.idctrvencimiento = idctrvencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Ctrgestiones getIdgestion() {
        return idgestion;
    }

    public void setIdgestion(Ctrgestiones idgestion) {
        this.idgestion = idgestion;
    }

    public Notificadores getIdNotificador() {
        return idNotificador;
    }

    public void setIdNotificador(Notificadores idNotificador) {
        this.idNotificador = idNotificador;
    }

    @XmlTransient
    public List<Detallevencimientos> getDetallevencimientosList() {
        return detallevencimientosList;
    }

    public void setDetallevencimientosList(List<Detallevencimientos> detallevencimientosList) {
        this.detallevencimientosList = detallevencimientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idctrvencimiento != null ? idctrvencimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctrvencimientos)) {
            return false;
        }
        Ctrvencimientos other = (Ctrvencimientos) object;
        if ((this.idctrvencimiento == null && other.idctrvencimiento != null) || (this.idctrvencimiento != null && !this.idctrvencimiento.equals(other.idctrvencimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Ctrvencimientos[ idctrvencimiento=" + idctrvencimiento + " ]";
    }
    
}
