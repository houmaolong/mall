package com.xiaopixiong.mall.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.xiaopixiong.mall.dao.ClassifyDao;
import com.xiaopixiong.mall.dao.GoodsDao;
import com.xiaopixiong.mall.domain.Classify;
import com.xiaopixiong.mall.domain.Goods;
import com.xiaopixiong.mall.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	@Autowired
	private ClassifyDao classifyDao;

	@Override
	public List<Goods> find(Long classifyId, String name) {
		Specification<Goods> querySpecifi = new Specification<Goods>() {
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = Lists.newArrayList();
				if (null != classifyId) {
					predicates.add(criteriaBuilder.equal(root.get("classify"), classifyId));
				}
				if (null != name) {
					predicates.add(criteriaBuilder.like(root.get("name"), "%" + name + "%"));
				}
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};

		return goodsDao.findAll(querySpecifi);
	}

	@Override
	public List<Classify> findClassify() {
		// TODO Auto-generated method stub
		return classifyDao.findAll();
	}

}
