package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.HolidayImposedAuthority;
import org.soptorshi.domain.enumeration.YesOrNo;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Holiday.class)
public abstract class Holiday_ {

	public static volatile SingularAttribute<Holiday, String> updatedBy;
	public static volatile SingularAttribute<Holiday, YesOrNo> moonDependency;
	public static volatile SingularAttribute<Holiday, LocalDate> toDate;
	public static volatile SingularAttribute<Holiday, Integer> numberOfDays;
	public static volatile SingularAttribute<Holiday, Instant> updatedOn;
	public static volatile SingularAttribute<Holiday, Instant> createdOn;
	public static volatile SingularAttribute<Holiday, LocalDate> fromDate;
	public static volatile SingularAttribute<Holiday, HolidayType> holidayType;
	public static volatile SingularAttribute<Holiday, String> createdBy;
	public static volatile SingularAttribute<Holiday, Integer> holidayYear;
	public static volatile SingularAttribute<Holiday, HolidayImposedAuthority> holidayDeclaredBy;
	public static volatile SingularAttribute<Holiday, Long> id;
	public static volatile SingularAttribute<Holiday, String> remarks;

}

