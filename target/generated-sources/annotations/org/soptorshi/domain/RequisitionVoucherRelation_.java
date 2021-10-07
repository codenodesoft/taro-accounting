package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RequisitionVoucherRelation.class)
public abstract class RequisitionVoucherRelation_ {

	public static volatile SingularAttribute<RequisitionVoucherRelation, String> voucherNo;
	public static volatile SingularAttribute<RequisitionVoucherRelation, BigDecimal> amount;
	public static volatile SingularAttribute<RequisitionVoucherRelation, LocalDate> modifiedOn;
	public static volatile SingularAttribute<RequisitionVoucherRelation, Requisition> requisition;
	public static volatile SingularAttribute<RequisitionVoucherRelation, Voucher> voucher;
	public static volatile SingularAttribute<RequisitionVoucherRelation, String> modifiedBy;
	public static volatile SingularAttribute<RequisitionVoucherRelation, Long> id;

}

