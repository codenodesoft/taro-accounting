package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.TaxStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tax.class)
public abstract class Tax_ {

	public static volatile SingularAttribute<Tax, BigDecimal> amount;
	public static volatile SingularAttribute<Tax, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Tax, String> modifiedBy;
	public static volatile SingularAttribute<Tax, Long> id;
	public static volatile SingularAttribute<Tax, Employee> employee;
	public static volatile SingularAttribute<Tax, FinancialAccountYear> financialAccountYear;
	public static volatile SingularAttribute<Tax, TaxStatus> taxStatus;

}

