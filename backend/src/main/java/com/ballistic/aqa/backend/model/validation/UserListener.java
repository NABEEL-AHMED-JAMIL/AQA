package com.concertepage;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.PreREmove;

public class UserListener {

    @PrePersist
	public void userPrePersist(User ob) {
		System.out.println("Listening User Pre Persist : " + ob.getName());
	}
	@PostPersist
	public void userPostPersist(User ob) {
		System.out.println("Listening User Post Persist : " + ob.getName());
	}
	@PostLoad
	public void userPostLoad(User ob) {
		System.out.println("Listening User Post Load : " + ob.getName());
	}	
	@PreUpdate
	public void userPreUpdate(User ob) {
		System.out.println("Listening User Pre Update : " + ob.getName());
	}
	@PostUpdate
	public void userPostUpdate(User ob) {
		System.out.println("Listening User Post Update : " + ob.getName());
	}
	@PreRemove
	public void userPreRemove(User ob) {
		System.out.println("Listening User Pre Remove : " + ob.getName());
	}
	@PostRemove
	public void userPostRemove(User ob) {
		System.out.println("Listening User Post Remove : " + ob.getName());
	}
}