package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ChequeRegister.class)
public abstract class ChequeRegister_ {

	public static volatile SingularAttribute<ChequeRegister, LocalDate> modifiedOn;
	public static volatile SingularAttribute<ChequeRegister, LocalDate> realizationDate;
	public static volatile SingularAttribute<ChequeRegister, String> chequeNo;
	public static volatile SingularAttribute<ChequeRegister, String> modifiedBy;
	public static volatile SingularAttribute<ChequeRegister, Long> id;
	public static volatile SingularAttribute<ChequeRegister, LocalDate> chequeDate;
	public static volatile SingularAttribute<ChequeRegister, String> status;

}

