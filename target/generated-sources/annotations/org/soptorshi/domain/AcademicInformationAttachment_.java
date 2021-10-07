package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AcademicInformationAttachment.class)
public abstract class AcademicInformationAttachment_ {

	public static volatile SingularAttribute<AcademicInformationAttachment, byte[]> file;
	public static volatile SingularAttribute<AcademicInformationAttachment, Long> id;
	public static volatile SingularAttribute<AcademicInformationAttachment, Employee> employee;
	public static volatile SingularAttribute<AcademicInformationAttachment, String> fileContentType;

}

