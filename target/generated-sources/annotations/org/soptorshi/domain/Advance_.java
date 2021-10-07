package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.PaymentStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Advance.class)
public abstract class Advance_ {

	public static volatile SingularAttribute<Advance, String> reason;
	public static volatile SingularAttribute<Advance, BigDecimal> amount;
	public static volatile SingularAttribute<Advance, Double> monthlyPayable;
	public static volatile SingularAttribute<Advance, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Advance, BigDecimal> left;
	public static volatile SingularAttribute<Advance, LocalDate> providedOn;
	public static volatile SingularAttribute<Advance, String> modifiedBy;
	public static volatile SingularAttribute<Advance, Long> id;
	public static volatile SingularAttribute<Advance, Employee> employee;
	public static volatile SingularAttribute<Advance, PaymentStatus> paymentStatus;

}

