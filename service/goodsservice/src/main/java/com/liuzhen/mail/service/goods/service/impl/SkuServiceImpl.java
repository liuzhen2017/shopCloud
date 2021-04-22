package com.liuzhen.mail.service.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhen.mail.api.goodsapi.entity.Sku;
import com.liuzhen.mail.service.goods.mapper.SkuMapper;
import com.liuzhen.mail.service.goods.service.ISkuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author liuzhen
 * @since 2021-04-23
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements ISkuService {

}
