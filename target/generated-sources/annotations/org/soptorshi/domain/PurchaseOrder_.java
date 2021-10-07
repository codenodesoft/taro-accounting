package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.PurchaseOrderStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PurchaseOrder.class)
public abstract class PurchaseOrder_ {

	public static volatile SingularAttribute<PurchaseOrder, String> note;
	public static volatile SingularAttribute<PurchaseOrder, BigDecimal> laborOrOtherAmount;
	public static volatile SetAttribute<PurchaseOrder, PurchaseOrderMessages> comments;
	public static volatile SingularAttribute<PurchaseOrder, Requisition> requisition;
	public static volatile SingularAttribute<PurchaseOrder, String> subject;
	public static volatile SingularAttribute<PurchaseOrder, Double> discount;
	public static volatile SingularAttribute<PurchaseOrder, String> purchaseOrderNo;
	public static volatile SingularAttribute<PurchaseOrder, LocalDate> modifiedOn;
	public static volatile SingularAttribute<PurchaseOrder, String> referredTo;
	public static volatile SingularAttribute<PurchaseOrder, String> modifiedBy;
	public static volatile SingularAttribute<PurchaseOrder, Long> id;
	public static volatile SingularAttribute<PurchaseOrder, LocalDate> issueDate;
	public static volatile SingularAttribute<PurchaseOrder, String> workOrderNo;
	public static volatile SingularAttribute<PurchaseOrder, Quotation> quotation;
	public static volatile SingularAttribute<PurchaseOrder, PurchaseOrderStatus> status;

}

