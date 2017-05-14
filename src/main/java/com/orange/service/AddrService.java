package com.orange.service;

import com.orange.bean.user.Addr;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/14
 */
public interface AddrService {

    /**
     * 集合查询
     * @param addrQuery
     */
    public List<Addr> getAddrList(Addr addrQuery);
}
