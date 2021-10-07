package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.MonthType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DepreciationCalculation.class)
public abstract class DepreciationCalculation_ {

	public static volatile SingularAttribute<DepreciationCalculation, Instant> modifiedOn;
	public static volatile SingularAttribute<DepreciationCalculation, Boolean> isExecuted;
	public static volatile SingularAttribute<DepreciationCalculation, String> createdBy;
	public static volatile SingularAttribute<DepreciationCalculation, String> modifiedBy;
	public static volatile SingularAttribute<DepreciationCalculation, Long> id;
	public static volatile SingularAttribute<DepreciationCalculation, MonthType> monthType;
	public static volatile SingularAttribute<DepreciationCalculation, Instant> createdOn;
	public static volatile SingularAttribute<DepreciationCalculation, FinancialAccountYear> financialAccountYear;

}

