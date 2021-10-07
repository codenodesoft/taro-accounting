package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LeaveAttachment.class)
public abstract class LeaveAttachment_ {

	public static volatile SingularAttribute<LeaveAttachment, byte[]> file;
	public static volatile SingularAttribute<LeaveAttachment, String> updatedBy;
	public static volatile SingularAttribute<LeaveAttachment, String> createdBy;
	public static volatile SingularAttribute<LeaveAttachment, LeaveApplication> leaveApplication;
	public static volatile SingularAttribute<LeaveAttachment, Long> id;
	public static volatile SingularAttribute<LeaveAttachment, Instant> updatedOn;
	public static volatile SingularAttribute<LeaveAttachment, Instant> createdOn;
	public static volatile SingularAttribute<LeaveAttachment, String> fileContentType;

}

