package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.SelectionType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Quotation.class)
public abstract class Quotation_ {

	public static volatile SingularAttribute<Quotation, BigDecimal> totalAmount;
	public static volatile SingularAttribute<Quotation, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Quotation, byte[]> attachment;
	public static volatile SingularAttribute<Quotation, SelectionType> selectionStatus;
	public static volatile SingularAttribute<Quotation, Requisition> requisition;
	public static volatile SingularAttribute<Quotation, Vendor> vendor;
	public static volatile SingularAttribute<Quotation, String> attachmentContentType;
	public static volatile SingularAttribute<Quotation, String> modifiedBy;
	public static volatile SingularAttribute<Quotation, Long> id;
	public static volatile SingularAttribute<Quotation, String> quotationNo;

}

