package com.liuzhen.mail.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhen.mail.goods.entity.Category;
import com.liuzhen.mail.goods.mapper.CategoryMapper;
import com.liuzhen.mail.goods.service.ICategoryService;
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
