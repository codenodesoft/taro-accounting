package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Attachment.class)
public abstract class Attachment_ {

	public static volatile SingularAttribute<Attachment, byte[]> file;
	public static volatile SingularAttribute<Attachment, TrainingInformation> trainingInformation;
	public static volatile SingularAttribute<Attachment, AcademicInformation> academicInformation;
	public static volatile SingularAttribute<Attachment, ExperienceInformation> experienceInformation;
	public static volatile SingularAttribute<Attachment, Long> id;
	public static volatile SingularAttribute<Attachment, String> fileContentType;

}

