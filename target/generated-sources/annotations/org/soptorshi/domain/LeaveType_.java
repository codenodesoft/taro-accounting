package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.PaidOrUnPaid;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LeaveType.class)
public abstract class LeaveType_ {

	public static volatile SingularAttribute<LeaveType, String> updatedBy;
	public static volatile SingularAttribute<LeaveType, String> createdBy;
	public static volatile SingularAttribute<LeaveType, Integer> maximumNumberOfDays;
	public static volatile SingularAttribute<LeaveType, String> name;
	public static volatile SingularAttribute<LeaveType, PaidOrUnPaid> paidLeave;
	public static volatile SingularAttribute<LeaveType, String> description;
	public static volatile SingularAttribute<LeaveType, Long> id;
	public static volatile SingularAttribute<LeaveType, Instant> updatedOn;
	public static volatile SingularAttribute<LeaveType, Instant> createdOn;

}

