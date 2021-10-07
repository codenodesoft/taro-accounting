package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WorkOrder.class)
public abstract class WorkOrder_ {

	public static volatile SingularAttribute<WorkOrder, String> note;
	public static volatile SingularAttribute<WorkOrder, BigDecimal> laborOrOtherAmount;
	public static volatile SingularAttribute<WorkOrder, LocalDate> modifiedOn;
	public static volatile SingularAttribute<WorkOrder, String> referredTo;
	public static volatile SingularAttribute<WorkOrder, String> referenceNo;
	public static volatile SingularAttribute<WorkOrder, Requisition> requisition;
	public static volatile SingularAttribute<WorkOrder, String> subject;
	public static volatile SingularAttribute<WorkOrder, Double> discount;
	public static volatile SingularAttribute<WorkOrder, String> modifiedBy;
	public static volatile SingularAttribute<WorkOrder, Long> id;
	public static volatile SingularAttribute<WorkOrder, LocalDate> issueDate;

}

