package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PredefinedNarration.class)
public abstract class PredefinedNarration_ {

	public static volatile SingularAttribute<PredefinedNarration, LocalDate> modifiedOn;
	public static volatile SingularAttribute<PredefinedNarration, Voucher> voucher;
	public static volatile SingularAttribute<PredefinedNarration, String> narration;
	public static volatile SingularAttribute<PredefinedNarration, String> modifiedBy;
	public static volatile SingularAttribute<PredefinedNarration, Long> id;

}

