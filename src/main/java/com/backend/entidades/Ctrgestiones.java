/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "CTRGESTIONES", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ctrgestiones.findAll", query = "SELECT c FROM Ctrgestiones c"),
    @NamedQuery(name = "Ctrgestiones.findByIdgestion", query = "SELECT c FROM Ctrgestiones c WHERE c.idgestion = :idgestion"),
    @NamedQuery(name = "Ctrgestiones.findByIdcliente", query = "SELECT c FROM Ctrgestiones c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Ctrgestiones.findByOrigen", query = "SELECT c FROM Ctrgestiones c WHERE c.origen = :origen"),
    @NamedQuery(name = "Ctrgestiones.findByMonto", query = "SELECT c FROM Ctrgestiones c WHERE c.monto = :monto"),
    @NamedQuery(name = "Ctrgestiones.findByUsuarioregistro", query = "SELECT c FROM Ctrgestiones c WHERE c.usuarioregistro = :usuarioregistro"),
    @NamedQuery(name = "Ctrgestiones.findByFecharegistro", query = "SELECT c FROM Ctrgestiones c WHERE c.fecharegistro = :fecharegistro"),
    @NamedQuery(name = "Ctrgestiones.findByEstadogestion", query = "SELECT c FROM Ctrgestiones c WHERE c.estadogestion = :estadogestion")})
public class Ctrgestiones implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGESTION", nullable = false, precision = 0, scale = -127)
    private BigDecimal idgestion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCLIENTE", nullable = false)
    private BigInteger idcliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ORIGEN", nullable = false, length = 2)
    private String origen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO", nullable = false)
    private BigInteger monto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USUARIOREGISTRO", nullable = false, length = 20)
    private String usuarioregistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAREGISTRO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ESTADOGESTION", nullable = false, length = 4)
    private String estadogestion;
    @OneToMany(mappedBy = "idgestion", fetch = FetchType.EAGER)
    private List<Ctrvencimientos> ctrvencimientosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ctrgestiones", fetch = FetchType.EAGER)
    private List<Detallegestion> detallegestionList;
    @JoinColumn(name = "IDTIPOGESTION", referencedColumnName = "IDTIPOGESTION")
    @ManyToOne(fetch = FetchType.EAGER)
    private Tiposgestiones idtipogestion;
    @JoinColumn(name = "IDMOTIVO", referencedColumnName = "IDMOTIVO")
    @ManyToOne(fetch = FetchType.EAGER)
    private Tiposmotivos idmotivo;
    @OneToMany(mappedBy = "idgestion", fetch = FetchType.EAGER)
    private List<Ctrautorizaciones> ctrautorizacionesList;

    public Ctrgestiones() {
    }

    public Ctrgestiones(BigDecimal idgestion) {
        this.idgestion = idgestion;
    }

    public Ctrgestiones(BigDecimal idgestion, BigInteger idcliente, String origen, BigInteger monto, String usuarioregistro, Date fecharegistro, String estadogestion) {
        this.idgestion = idgestion;
        this.idcliente = idcliente;
        this.origen = origen;
        this.monto = monto;
        this.usuarioregistro = usuarioregistro;
        this.fecharegistro = fecharegistro;
        this.estadogestion = estadogestion;
    }

    public BigDecimal getIdgestion() {
        return idgestion;
    }

    public void setIdgestion(BigDecimal idgestion) {
        this.idgestion = idgestion;
    }

    public BigInteger getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(BigInteger idcliente) {
        this.idcliente = idcliente;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public BigInteger getMonto() {
        return monto;
    }

    public void setMonto(BigInteger monto) {
        this.monto = monto;
    }

    public String getUsuarioregistro() {
        return usuarioregistro;
    }

    public void setUsuarioregistro(String usuarioregistro) {
        this.usuarioregistro = usuarioregistro;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getEstadogestion() {
        return estadogestion;
    }

    public void setEstadogestion(String estadogestion) {
        this.estadogestion = estadogestion;
    }

    @XmlTransient
    public List<Ctrvencimientos> getCtrvencimientosList() {
        return ctrvencimientosList;
    }

    public void setCtrvencimientosList(List<Ctrvencimientos> ctrvencimientosList) {
        this.ctrvencimientosList = ctrvencimientosList;
    }

    @XmlTransient
    public List<Detallegestion> getDetallegestionList() {
        return detallegestionList;
    }

    public void setDetallegestionList(List<Detallegestion> detallegestionList) {
        this.detallegestionList = detallegestionList;
    }

    public Tiposgestiones getIdtipogestion() {
        return idtipogestion;
    }

    public void setIdtipogestion(Tiposgestiones idtipogestion) {
        this.idtipogestion = idtipogestion;
    }

    public Tiposmotivos getIdmotivo() {
        return idmotivo;
    }

    public void setIdmotivo(Tiposmotivos idmotivo) {
        this.idmotivo = idmotivo;
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
        hash += (idgestion != null ? idgestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctrgestiones)) {
            return false;
        }
        Ctrgestiones other = (Ctrgestiones) object;
        if ((this.idgestion == null && other.idgestion != null) || (this.idgestion != null && !this.idgestion.equals(other.idgestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Ctrgestiones[ idgestion=" + idgestion + " ]";
    }
    
}
