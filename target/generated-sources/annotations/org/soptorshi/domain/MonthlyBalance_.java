package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.MonthType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MonthlyBalance.class)
public abstract class MonthlyBalance_ {

	public static volatile SingularAttribute<MonthlyBalance, LocalDate> modifiedOn;
	public static volatile SingularAttribute<MonthlyBalance, BigDecimal> totMonthDbBal;
	public static volatile SingularAttribute<MonthlyBalance, String> modifiedBy;
	public static volatile SingularAttribute<MonthlyBalance, Long> id;
	public static volatile SingularAttribute<MonthlyBalance, MonthType> monthType;
	public static volatile SingularAttribute<MonthlyBalance, AccountBalance> accountBalance;
	public static volatile SingularAttribute<MonthlyBalance, BigDecimal> totMonthCrBal;

}

