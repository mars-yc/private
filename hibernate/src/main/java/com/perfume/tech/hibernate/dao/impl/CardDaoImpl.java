package com.perfume.tech.hibernate.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.perfume.tech.hibernate.dao.CardDao;
import com.perfume.tech.hibernate.pojo.Card;

public class CardDaoImpl extends AbstractBaseDao<Card> implements CardDao {
	
	private static final String HQL_FIND_CARD_BY_NUMBER = "from Card where number = :number";

	@Override
	public Set<Card> loadAll() {
		return loadAll(Card.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Card findCardByNumber(String number) {
		Session session = hibernateUtils.getSession();
		List<Card> list = (List<Card>) session.createQuery(HQL_FIND_CARD_BY_NUMBER).setParameter("number", number).list();
		hibernateUtils.closeSession();
		return list.get(0);
	}

}
