package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.DayOfWeek;
import org.soptorshi.domain.enumeration.WeekendStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Weekend.class)
public abstract class Weekend_ {

	public static volatile SingularAttribute<Weekend, String> updatedBy;
	public static volatile SingularAttribute<Weekend, String> createdBy;
	public static volatile SingularAttribute<Weekend, DayOfWeek> day2;
	public static volatile SingularAttribute<Weekend, DayOfWeek> day3;
	public static volatile SingularAttribute<Weekend, LocalDate> activeTo;
	public static volatile SingularAttribute<Weekend, Long> id;
	public static volatile SingularAttribute<Weekend, Integer> numberOfDays;
	public static volatile SingularAttribute<Weekend, DayOfWeek> day1;
	public static volatile SingularAttribute<Weekend, Instant> updatedOn;
	public static volatile SingularAttribute<Weekend, Instant> createdOn;
	public static volatile SingularAttribute<Weekend, LocalDate> activeFrom;
	public static volatile SingularAttribute<Weekend, WeekendStatus> status;

}

