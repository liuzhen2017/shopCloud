package com.liuzhen.mail.service.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhen.mail.api.goodsapi.entity.Category;
import com.liuzhen.mail.service.goods.mapper.CategoryMapper;
import com.liuzhen.mail.service.goods.service.ICategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目 服务实现类
 * </p>
 *
 * @author liuzhen
 * @since 2021-04-23
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
