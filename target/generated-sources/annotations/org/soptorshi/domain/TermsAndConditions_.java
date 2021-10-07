package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TermsAndConditions.class)
public abstract class TermsAndConditions_ {

	public static volatile SingularAttribute<TermsAndConditions, LocalDate> modifiedOn;
	public static volatile SingularAttribute<TermsAndConditions, PurchaseOrder> purchaseOrder;
	public static volatile SingularAttribute<TermsAndConditions, String> description;
	public static volatile SingularAttribute<TermsAndConditions, String> modifiedBy;
	public static volatile SingularAttribute<TermsAndConditions, Long> id;

}

