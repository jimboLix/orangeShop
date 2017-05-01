package com.orange.dao.product;

import com.orange.bean.product.Type;

import java.util.List;


public interface TypeDao {


	/**
	 * 集合查询
	 * @param type
	 */
	public List<Type> getTypeList(Type type);
}
