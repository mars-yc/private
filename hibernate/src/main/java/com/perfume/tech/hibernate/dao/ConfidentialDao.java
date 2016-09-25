package com.perfume.tech.hibernate.dao;

import com.perfume.tech.hibernate.pojo.Confidential;

public interface ConfidentialDao extends BaseDaoInterface<Confidential> {
	
	Confidential getConfidentialByUserName(String username);
	
}
