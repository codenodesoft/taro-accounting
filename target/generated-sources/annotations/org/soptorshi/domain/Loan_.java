package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.PaymentStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Loan.class)
public abstract class Loan_ {

	public static volatile SingularAttribute<Loan, BigDecimal> amount;
	public static volatile SingularAttribute<Loan, Double> monthlyPayable;
	public static volatile SingularAttribute<Loan, BigDecimal> left;
	public static volatile SingularAttribute<Loan, LocalDate> modifiedDate;
	public static volatile SingularAttribute<Loan, LocalDate> takenOn;
	public static volatile SingularAttribute<Loan, String> modifiedBy;
	public static volatile SingularAttribute<Loan, Long> id;
	public static volatile SingularAttribute<Loan, Employee> employee;
	public static volatile SingularAttribute<Loan, PaymentStatus> paymentStatus;

}

