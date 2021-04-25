package com.liuzhen.mail.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhen.mail.goods.entity.Brand;
import com.liuzhen.mail.goods.mapper.BrandMapper;
import com.liuzhen.mail.goods.service.IBrandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author liuzhen
 * @since 2021-04-23
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
