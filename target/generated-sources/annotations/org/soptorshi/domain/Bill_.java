package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.BillCategory;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bill.class)
public abstract class Bill_ {

	public static volatile SingularAttribute<Bill, String> reason;
	public static volatile SingularAttribute<Bill, BigDecimal> amount;
	public static volatile SingularAttribute<Bill, BillCategory> billCategory;
	public static volatile SingularAttribute<Bill, LocalDate> modifiedDate;
	public static volatile SingularAttribute<Bill, String> modifiedBy;
	public static volatile SingularAttribute<Bill, Long> id;
	public static volatile SingularAttribute<Bill, Employee> employee;

}

