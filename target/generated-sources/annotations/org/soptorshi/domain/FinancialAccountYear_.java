package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.FinancialYearStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FinancialAccountYear.class)
public abstract class FinancialAccountYear_ {

	public static volatile SingularAttribute<FinancialAccountYear, LocalDate> previousStartDate;
	public static volatile SingularAttribute<FinancialAccountYear, LocalDate> endDate;
	public static volatile SingularAttribute<FinancialAccountYear, Long> id;
	public static volatile SingularAttribute<FinancialAccountYear, String> durationStr;
	public static volatile SingularAttribute<FinancialAccountYear, LocalDate> startDate;
	public static volatile SingularAttribute<FinancialAccountYear, LocalDate> previousEndDate;
	public static volatile SingularAttribute<FinancialAccountYear, FinancialYearStatus> status;

}

