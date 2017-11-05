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
@Table(name = "CTRAUTORIZACIONES", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ctrautorizaciones.findAll", query = "SELECT c FROM Ctrautorizaciones c"),
    @NamedQuery(name = "Ctrautorizaciones.findByIdctrautorizacion", query = "SELECT c FROM Ctrautorizaciones c WHERE c.idctrautorizacion = :idctrautorizacion"),
    @NamedQuery(name = "Ctrautorizaciones.findByEstadoautorizacion", query = "SELECT c FROM Ctrautorizaciones c WHERE c.estadoautorizacion = :estadoautorizacion"),
    @NamedQuery(name = "Ctrautorizaciones.findByFechaRegistro", query = "SELECT c FROM Ctrautorizaciones c WHERE c.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Ctrautorizaciones.findByFechaAutorizacion", query = "SELECT c FROM Ctrautorizaciones c WHERE c.fechaAutorizacion = :fechaAutorizacion")})
public class Ctrautorizaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCTRAUTORIZACION", nullable = false, precision = 0, scale = -127)
    private BigDecimal idctrautorizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ESTADOAUTORIZACION", nullable = false, length = 2)
    private String estadoautorizacion;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "FECHA_AUTORIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAutorizacion;
    @OneToMany(mappedBy = "idctrautorizacion", fetch = FetchType.EAGER)
    private List<Tarjetadevolucion> tarjetadevolucionList;
    @JoinColumn(name = "IDAUTORIZACION", referencedColumnName = "IDAUTORIZACION")
    @ManyToOne(fetch = FetchType.EAGER)
    private Autorizaciones idautorizacion;
    @JoinColumn(name = "IDGESTION", referencedColumnName = "IDGESTION")
    @ManyToOne(fetch = FetchType.EAGER)
    private Ctrgestiones idgestion;

    public Ctrautorizaciones() {
    }

    public Ctrautorizaciones(BigDecimal idctrautorizacion) {
        this.idctrautorizacion = idctrautorizacion;
    }

    public Ctrautorizaciones(BigDecimal idctrautorizacion, String estadoautorizacion) {
        this.idctrautorizacion = idctrautorizacion;
        this.estadoautorizacion = estadoautorizacion;
    }

    public BigDecimal getIdctrautorizacion() {
        return idctrautorizacion;
    }

    public void setIdctrautorizacion(BigDecimal idctrautorizacion) {
        this.idctrautorizacion = idctrautorizacion;
    }

    public String getEstadoautorizacion() {
        return estadoautorizacion;
    }

    public void setEstadoautorizacion(String estadoautorizacion) {
        this.estadoautorizacion = estadoautorizacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(Date fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    @XmlTransient
    public List<Tarjetadevolucion> getTarjetadevolucionList() {
        return tarjetadevolucionList;
    }

    public void setTarjetadevolucionList(List<Tarjetadevolucion> tarjetadevolucionList) {
        this.tarjetadevolucionList = tarjetadevolucionList;
    }

    public Autorizaciones getIdautorizacion() {
        return idautorizacion;
    }

    public void setIdautorizacion(Autorizaciones idautorizacion) {
        this.idautorizacion = idautorizacion;
    }

    public Ctrgestiones getIdgestion() {
        return idgestion;
    }

    public void setIdgestion(Ctrgestiones idgestion) {
        this.idgestion = idgestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idctrautorizacion != null ? idctrautorizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctrautorizaciones)) {
            return false;
        }
        Ctrautorizaciones other = (Ctrautorizaciones) object;
        if ((this.idctrautorizacion == null && other.idctrautorizacion != null) || (this.idctrautorizacion != null && !this.idctrautorizacion.equals(other.idctrautorizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Ctrautorizaciones[ idctrautorizacion=" + idctrautorizacion + " ]";
    }
    
}
