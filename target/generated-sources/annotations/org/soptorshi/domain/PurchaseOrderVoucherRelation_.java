package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PurchaseOrderVoucherRelation.class)
public abstract class PurchaseOrderVoucherRelation_ {

	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, String> voucherNo;
	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, BigDecimal> amount;
	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, String> createBy;
	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, LocalDate> modifiedOn;
	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, Voucher> voucher;
	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, PurchaseOrder> purchaseOrder;
	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, String> modifiedBy;
	public static volatile SingularAttribute<PurchaseOrderVoucherRelation, Long> id;

}

