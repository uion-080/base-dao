package com.yz.base.service;

import com.yz.base.dao.CommonDao;

public abstract interface Callback {
	public abstract Object exec(CommonDao paramCommonDao) throws Exception;
}
