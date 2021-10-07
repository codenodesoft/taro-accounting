package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TrainingInformationAttachment.class)
public abstract class TrainingInformationAttachment_ {

	public static volatile SingularAttribute<TrainingInformationAttachment, byte[]> file;
	public static volatile SingularAttribute<TrainingInformationAttachment, Long> id;
	public static volatile SingularAttribute<TrainingInformationAttachment, Employee> employee;
	public static volatile SingularAttribute<TrainingInformationAttachment, String> fileContentType;

}

