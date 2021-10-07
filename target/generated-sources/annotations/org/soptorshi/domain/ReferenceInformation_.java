package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReferenceInformation.class)
public abstract class ReferenceInformation_ {

	public static volatile SingularAttribute<ReferenceInformation, String> organization;
	public static volatile SingularAttribute<ReferenceInformation, String> name;
	public static volatile SingularAttribute<ReferenceInformation, String> contactNumber;
	public static volatile SingularAttribute<ReferenceInformation, Long> id;
	public static volatile SingularAttribute<ReferenceInformation, String> designation;
	public static volatile SingularAttribute<ReferenceInformation, Employee> employee;

}

