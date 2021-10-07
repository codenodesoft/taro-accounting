package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OverTime.class)
public abstract class OverTime_ {

	public static volatile SingularAttribute<OverTime, String> duration;
	public static volatile SingularAttribute<OverTime, String> updatedBy;
	public static volatile SingularAttribute<OverTime, String> createdBy;
	public static volatile SingularAttribute<OverTime, Instant> fromTime;
	public static volatile SingularAttribute<OverTime, LocalDate> overTimeDate;
	public static volatile SingularAttribute<OverTime, Long> id;
	public static volatile SingularAttribute<OverTime, Instant> updatedOn;
	public static volatile SingularAttribute<OverTime, Employee> employee;
	public static volatile SingularAttribute<OverTime, Instant> createdOn;
	public static volatile SingularAttribute<OverTime, Instant> toTime;

}

