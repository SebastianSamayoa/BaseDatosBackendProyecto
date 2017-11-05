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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jhoan
 */
@Entity
@Table(name = "NOTIFICADORES", catalog = "", schema = "BDPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notificadores.findAll", query = "SELECT n FROM Notificadores n"),
    @NamedQuery(name = "Notificadores.findByIdNotificador", query = "SELECT n FROM Notificadores n WHERE n.idNotificador = :idNotificador"),
    @NamedQuery(name = "Notificadores.findByCorreo", query = "SELECT n FROM Notificadores n WHERE n.correo = :correo"),
    @NamedQuery(name = "Notificadores.findByEstado", query = "SELECT n FROM Notificadores n WHERE n.estado = :estado")})
public class Notificadores implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NOTIFICADOR", nullable = false, precision = 0, scale = -127)
    private BigDecimal idNotificador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CORREO", nullable = false, length = 30)
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;
    @OneToMany(mappedBy = "idNotificador", fetch = FetchType.EAGER)
    private List<Ctrvencimientos> ctrvencimientosList;

    public Notificadores() {
    }

    public Notificadores(BigDecimal idNotificador) {
        this.idNotificador = idNotificador;
    }

    public Notificadores(BigDecimal idNotificador, String correo, String estado) {
        this.idNotificador = idNotificador;
        this.correo = correo;
        this.estado = estado;
    }

    public BigDecimal getIdNotificador() {
        return idNotificador;
    }

    public void setIdNotificador(BigDecimal idNotificador) {
        this.idNotificador = idNotificador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Ctrvencimientos> getCtrvencimientosList() {
        return ctrvencimientosList;
    }

    public void setCtrvencimientosList(List<Ctrvencimientos> ctrvencimientosList) {
        this.ctrvencimientosList = ctrvencimientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotificador != null ? idNotificador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificadores)) {
            return false;
        }
        Notificadores other = (Notificadores) object;
        if ((this.idNotificador == null && other.idNotificador != null) || (this.idNotificador != null && !this.idNotificador.equals(other.idNotificador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.backend.entidades.Notificadores[ idNotificador=" + idNotificador + " ]";
    }
    
}
