package com.xq.live.service.impl;

import com.xq.live.common.Pager;
import com.xq.live.common.RandomStringUtil;
import com.xq.live.dao.SkuMapper;
import com.xq.live.model.Sku;
import com.xq.live.service.SkuService;
import com.xq.live.vo.in.SkuInVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-02-09 10:34
 * @copyright:hbxq
 **/
@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    private SkuMapper skuMapper;

    @Override
    public Sku get(Long id) {
        return skuMapper.selectByPrimaryKey(id);
    }

    @Override
    public Pager<Sku> list(SkuInVo inVo) {
        Pager<Sku> result =  new Pager<Sku>();
        int total = skuMapper.listTotal(inVo);
        if(total > 0){
            List<Sku> list = skuMapper.list(inVo);
            result.setList(list);
        }
        result.setTotal(total);
        result.setPage(inVo.getPage());
        return result;
    }

    @Override
    public List<Sku> top(SkuInVo inVo) {
        return skuMapper.list(inVo);
    }

    @Override
    public Long add(Sku sku) {
        sku.setSkuCode(RandomStringUtil.getRandomCode(8, 0));
        int res = skuMapper.insert(sku);
        if(res < 1){
            return null;
        }
        return sku.getId();
    }
}
