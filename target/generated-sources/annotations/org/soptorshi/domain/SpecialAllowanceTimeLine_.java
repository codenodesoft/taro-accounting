package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.AllowanceType;
import org.soptorshi.domain.enumeration.MonthType;
import org.soptorshi.domain.enumeration.Religion;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SpecialAllowanceTimeLine.class)
public abstract class SpecialAllowanceTimeLine_ {

	public static volatile SingularAttribute<SpecialAllowanceTimeLine, AllowanceType> allowanceType;
	public static volatile SingularAttribute<SpecialAllowanceTimeLine, LocalDate> modifiedOn;
	public static volatile SingularAttribute<SpecialAllowanceTimeLine, MonthType> month;
	public static volatile SingularAttribute<SpecialAllowanceTimeLine, Integer> year;
	public static volatile SingularAttribute<SpecialAllowanceTimeLine, String> modifiedBy;
	public static volatile SingularAttribute<SpecialAllowanceTimeLine, Long> id;
	public static volatile SingularAttribute<SpecialAllowanceTimeLine, Religion> religion;

}

