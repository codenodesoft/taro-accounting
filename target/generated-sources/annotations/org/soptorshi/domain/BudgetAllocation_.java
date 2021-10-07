package org.soptorshi.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BudgetAllocation.class)
public abstract class BudgetAllocation_ {

	public static volatile SingularAttribute<BudgetAllocation, BigDecimal> amount;
	public static volatile SingularAttribute<BudgetAllocation, Long> id;
	public static volatile SingularAttribute<BudgetAllocation, Office> office;
	public static volatile SingularAttribute<BudgetAllocation, Department> department;
	public static volatile SingularAttribute<BudgetAllocation, FinancialAccountYear> financialAccountYear;

}

