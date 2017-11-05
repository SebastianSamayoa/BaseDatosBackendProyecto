/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "TIPOSMOTIVOS", catalog = "", schema = "BDPROYECTO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRIPCIONMOTIVO"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposmotivos.findAll", query = "SELECT t FROM Tiposmotivos t"),
    @NamedQuery(name = "Tiposmotivos.findByIdmotivo", query = "SELECT t FROM Tiposmotivos t WHERE t.idmotivo = :idmotivo"),
    @NamedQuery(name = "Tiposmotivos.findByDescripcionmotivo", query = "SELECT t FROM Tiposmotivos t WHERE t.descripcionmotivo = :descripcionmotivo")})
public class Tiposmotivos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMOTIVO", nullable = false, precision = 0, scale = -127)
    private BigDecimal idmotivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DESCRIPCIONMOTIVO", nullable = false, length = 30)
    private String descripcionmotivo;
    @OneToMany(mappedBy = "idmotivo", fetch = FetchType.EAGER)
    private List<Ctrgestiones> ctrgestionesList;

    public Tiposmotivos() {
    }

    public Tiposmotivos(BigDecimal idmotivo) {
        this.idmotivo = idmotivo;
    }

    public Tiposmotivos(BigDecimal idmotivo, String descripcionmotivo) {
        this.idmotivo = idmotivo;
        this.descripcionmotivo = descripcionmotivo;
    }

    public BigDecimal getIdmotivo() {
        return idmotivo;
    }

    public void setIdmotivo(BigDecimal idmotivo) {
        this.idmotivo = idmotivo;
    }

    public String getDescripcionmotivo() {
        return descripcionmotivo;
    }

    public void setDescripcionmotivo(String descripcionmotivo) {
        this.descripcionmotivo = descripcionmotivo;
    }

    @XmlTransient
    public List<Ctrgestiones> getCtrgestionesList() {
        return ctrgestionesList;
    }

    public void setCtrgestionesList(List<Ctrgestiones> ctrgestionesList) {
        this.ctrgestionesList = ctrgestionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmotivo != null ? idmotivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposmotivos)) {
            return false;
        }
        Tiposmotivos other = (Tiposmotivos) object;
        if ((this.idmotivo == null && other.idmotivo != null) || (this.idmotivo != null && !this.idmotivo.equals(other.idmotivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Tiposmotivos[ idmotivo=" + idmotivo + " ]";
    }
    
}
