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
@Table(name = "TIPOSGESTIONES", catalog = "", schema = "BDPROYECTO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRIPCIONGESTION"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposgestiones.findAll", query = "SELECT t FROM Tiposgestiones t"),
    @NamedQuery(name = "Tiposgestiones.findByIdtipogestion", query = "SELECT t FROM Tiposgestiones t WHERE t.idtipogestion = :idtipogestion"),
    @NamedQuery(name = "Tiposgestiones.findByDescripciongestion", query = "SELECT t FROM Tiposgestiones t WHERE t.descripciongestion = :descripciongestion")})
public class Tiposgestiones implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTIPOGESTION", nullable = false, precision = 0, scale = -127)
    private BigDecimal idtipogestion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DESCRIPCIONGESTION", nullable = false, length = 30)
    private String descripciongestion;
    @OneToMany(mappedBy = "idtipogestion", fetch = FetchType.EAGER)
    private List<Ctrgestiones> ctrgestionesList;

    public Tiposgestiones() {
    }

    public Tiposgestiones(BigDecimal idtipogestion) {
        this.idtipogestion = idtipogestion;
    }

    public Tiposgestiones(BigDecimal idtipogestion, String descripciongestion) {
        this.idtipogestion = idtipogestion;
        this.descripciongestion = descripciongestion;
    }

    public BigDecimal getIdtipogestion() {
        return idtipogestion;
    }

    public void setIdtipogestion(BigDecimal idtipogestion) {
        this.idtipogestion = idtipogestion;
    }

    public String getDescripciongestion() {
        return descripciongestion;
    }

    public void setDescripciongestion(String descripciongestion) {
        this.descripciongestion = descripciongestion;
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
        hash += (idtipogestion != null ? idtipogestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposgestiones)) {
            return false;
        }
        Tiposgestiones other = (Tiposgestiones) object;
        if ((this.idtipogestion == null && other.idtipogestion != null) || (this.idtipogestion != null && !this.idtipogestion.equals(other.idtipogestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Tiposgestiones[ idtipogestion=" + idtipogestion + " ]";
    }
    
}
