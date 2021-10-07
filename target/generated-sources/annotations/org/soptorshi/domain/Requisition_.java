package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.RequisitionStatus;
import org.soptorshi.domain.enumeration.RequisitionType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Requisition.class)
public abstract class Requisition_ {

	public static volatile SingularAttribute<Requisition, String> reason;
	public static volatile SingularAttribute<Requisition, LocalDate> requisitionDate;
	public static volatile SingularAttribute<Requisition, BigDecimal> amount;
	public static volatile SingularAttribute<Requisition, Long> refToCfo;
	public static volatile SingularAttribute<Requisition, Long> commercialId;
	public static volatile SetAttribute<Requisition, RequisitionMessages> comments;
	public static volatile SingularAttribute<Requisition, String> purchaseCommitteeRemarks;
	public static volatile SingularAttribute<Requisition, Office> office;
	public static volatile SingularAttribute<Requisition, Employee> employee;
	public static volatile SingularAttribute<Requisition, Long> refToHead;
	public static volatile SingularAttribute<Requisition, ProductCategory> productCategory;
	public static volatile SingularAttribute<Requisition, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Requisition, String> cfoRemarks;
	public static volatile SingularAttribute<Requisition, RequisitionType> requisitionType;
	public static volatile SingularAttribute<Requisition, String> requisitionNo;
	public static volatile SingularAttribute<Requisition, String> modifiedBy;
	public static volatile SingularAttribute<Requisition, Long> id;
	public static volatile SingularAttribute<Requisition, Long> refToPurchaseCommittee;
	public static volatile SingularAttribute<Requisition, Department> department;
	public static volatile SingularAttribute<Requisition, Boolean> selected;
	public static volatile SingularAttribute<Requisition, RequisitionStatus> status;
	public static volatile SingularAttribute<Requisition, String> headRemarks;

}

