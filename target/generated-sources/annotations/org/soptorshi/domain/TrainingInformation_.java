package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TrainingInformation.class)
public abstract class TrainingInformation_ {

	public static volatile SingularAttribute<TrainingInformation, String> subject;
	public static volatile SingularAttribute<TrainingInformation, String> organization;
	public static volatile SingularAttribute<TrainingInformation, String> name;
	public static volatile SingularAttribute<TrainingInformation, Long> id;
	public static volatile SingularAttribute<TrainingInformation, Employee> employee;

}

