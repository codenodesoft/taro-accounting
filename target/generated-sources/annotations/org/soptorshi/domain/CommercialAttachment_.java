package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CommercialAttachment.class)
public abstract class CommercialAttachment_ {

	public static volatile SingularAttribute<CommercialAttachment, byte[]> file;
	public static volatile SingularAttribute<CommercialAttachment, CommercialPi> commercialPi;
	public static volatile SingularAttribute<CommercialAttachment, Long> id;
	public static volatile SingularAttribute<CommercialAttachment, String> fileContentType;

}

