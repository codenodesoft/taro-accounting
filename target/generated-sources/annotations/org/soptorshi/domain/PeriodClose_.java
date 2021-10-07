package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.MonthType;
import org.soptorshi.domain.enumeration.PeriodCloseFlag;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PeriodClose.class)
public abstract class PeriodClose_ {

	public static volatile SingularAttribute<PeriodClose, LocalDate> modifiedOn;
	public static volatile SingularAttribute<PeriodClose, PeriodCloseFlag> flag;
	public static volatile SingularAttribute<PeriodClose, Integer> closeYear;
	public static volatile SingularAttribute<PeriodClose, String> modifiedBy;
	public static volatile SingularAttribute<PeriodClose, Long> id;
	public static volatile SingularAttribute<PeriodClose, MonthType> monthType;
	public static volatile SingularAttribute<PeriodClose, FinancialAccountYear> financialAccountYear;

}

