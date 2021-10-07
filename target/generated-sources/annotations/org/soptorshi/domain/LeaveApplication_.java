package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.LeaveStatus;
import org.soptorshi.domain.enumeration.PaidOrUnPaid;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LeaveApplication.class)
public abstract class LeaveApplication_ {

	public static volatile SingularAttribute<LeaveApplication, String> reason;
	public static volatile SingularAttribute<LeaveApplication, LocalDate> toDate;
	public static volatile SingularAttribute<LeaveApplication, Employee> actionTakenById;
	public static volatile SingularAttribute<LeaveApplication, Integer> numberOfDays;
	public static volatile SingularAttribute<LeaveApplication, Employee> appliedById;
	public static volatile SingularAttribute<LeaveApplication, LocalDate> fromDate;
	public static volatile SingularAttribute<LeaveApplication, Instant> appliedOn;
	public static volatile SingularAttribute<LeaveApplication, PaidOrUnPaid> paidLeave;
	public static volatile SingularAttribute<LeaveApplication, Long> id;
	public static volatile SingularAttribute<LeaveApplication, Instant> actionTakenOn;
	public static volatile SingularAttribute<LeaveApplication, LeaveType> leaveTypes;
	public static volatile SingularAttribute<LeaveApplication, Employee> employees;
	public static volatile SingularAttribute<LeaveApplication, LeaveStatus> status;

}

