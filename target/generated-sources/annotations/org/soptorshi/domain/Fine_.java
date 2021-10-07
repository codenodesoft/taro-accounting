package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.PaymentStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Fine.class)
public abstract class Fine_ {

	public static volatile SingularAttribute<Fine, String> reason;
	public static volatile SingularAttribute<Fine, BigDecimal> amount;
	public static volatile SingularAttribute<Fine, LocalDate> fineDate;
	public static volatile SingularAttribute<Fine, Double> monthlyPayable;
	public static volatile SingularAttribute<Fine, BigDecimal> left;
	public static volatile SingularAttribute<Fine, LocalDate> modifiedDate;
	public static volatile SingularAttribute<Fine, String> modifiedBy;
	public static volatile SingularAttribute<Fine, Long> id;
	public static volatile SingularAttribute<Fine, Employee> employee;
	public static volatile SingularAttribute<Fine, PaymentStatus> paymentStatus;

}

