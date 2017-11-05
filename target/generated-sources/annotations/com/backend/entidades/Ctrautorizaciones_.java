package com.backend.entidades;

import com.backend.entidades.Autorizaciones;
import com.backend.entidades.Ctrgestiones;
import com.backend.entidades.Tarjetadevolucion;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Ctrautorizaciones.class)
public class Ctrautorizaciones_ { 

    public static volatile SingularAttribute<Ctrautorizaciones, BigDecimal> idctrautorizacion;
    public static volatile SingularAttribute<Ctrautorizaciones, Ctrgestiones> idgestion;
    public static volatile SingularAttribute<Ctrautorizaciones, String> estadoautorizacion;
    public static volatile SingularAttribute<Ctrautorizaciones, Autorizaciones> idautorizacion;
    public static volatile SingularAttribute<Ctrautorizaciones, Date> fechaRegistro;
    public static volatile ListAttribute<Ctrautorizaciones, Tarjetadevolucion> tarjetadevolucionList;
    public static volatile SingularAttribute<Ctrautorizaciones, Date> fechaAutorizacion;

}