package com.backend.entidades;

import com.backend.entidades.Ctrgestiones;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-03T23:11:52")
@StaticMetamodel(Tiposmotivos.class)
public class Tiposmotivos_ { 

    public static volatile SingularAttribute<Tiposmotivos, BigDecimal> idmotivo;
    public static volatile SingularAttribute<Tiposmotivos, String> descripcionmotivo;
    public static volatile ListAttribute<Tiposmotivos, Ctrgestiones> ctrgestionesList;

}