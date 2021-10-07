package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PurchaseOrderMessages.class)
public abstract class PurchaseOrderMessages_ {

	public static volatile SingularAttribute<PurchaseOrderMessages, String> comments;
	public static volatile SingularAttribute<PurchaseOrderMessages, LocalDate> commentedOn;
	public static volatile SingularAttribute<PurchaseOrderMessages, PurchaseOrder> purchaseOrder;
	public static volatile SingularAttribute<PurchaseOrderMessages, Long> id;
	public static volatile SingularAttribute<PurchaseOrderMessages, Employee> commenter;

}

