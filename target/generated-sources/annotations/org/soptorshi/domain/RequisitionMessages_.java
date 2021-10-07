package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RequisitionMessages.class)
public abstract class RequisitionMessages_ {

	public static volatile SingularAttribute<RequisitionMessages, String> comments;
	public static volatile SingularAttribute<RequisitionMessages, LocalDate> commentedOn;
	public static volatile SingularAttribute<RequisitionMessages, Requisition> requisition;
	public static volatile SingularAttribute<RequisitionMessages, Long> id;
	public static volatile SingularAttribute<RequisitionMessages, Employee> commenter;

}

