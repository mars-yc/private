package com.perfume.tech.hibernate.dao;

import com.perfume.tech.hibernate.pojo.Card;

public interface CardDao extends BaseDaoInterface<Card> {
	
	public Card findCardByNumber(String number);
	
}
