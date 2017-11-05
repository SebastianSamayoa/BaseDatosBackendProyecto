/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jhoan
 */
@Embeddable
public class DetallegestionPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGESTION", nullable = false)
    private BigInteger idgestion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDETALLE", nullable = false)
    private BigInteger iddetalle;

    public DetallegestionPK() {
    }

    public DetallegestionPK(BigInteger idgestion, BigInteger iddetalle) {
        this.idgestion = idgestion;
        this.iddetalle = iddetalle;
    }

    public BigInteger getIdgestion() {
        return idgestion;
    }

    public void setIdgestion(BigInteger idgestion) {
        this.idgestion = idgestion;
    }

    public BigInteger getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(BigInteger iddetalle) {
        this.iddetalle = iddetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgestion != null ? idgestion.hashCode() : 0);
        hash += (iddetalle != null ? iddetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallegestionPK)) {
            return false;
        }
        DetallegestionPK other = (DetallegestionPK) object;
        if ((this.idgestion == null && other.idgestion != null) || (this.idgestion != null && !this.idgestion.equals(other.idgestion))) {
            return false;
        }
        if ((this.iddetalle == null && other.iddetalle != null) || (this.iddetalle != null && !this.iddetalle.equals(other.iddetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.DetallegestionPK[ idgestion=" + idgestion + ", iddetalle=" + iddetalle + " ]";
    }
    
}
