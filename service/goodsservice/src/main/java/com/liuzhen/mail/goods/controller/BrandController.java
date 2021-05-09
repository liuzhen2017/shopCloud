package com.liuzhen.mail.goods.controller;


import com.liuzhen.mail.goods.entity.Brand;
import com.liuzhen.mail.goods.service.IBrandService;
import com.liuzhen.mail.util.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author liuzhen
 * @since 2021-05-09
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
  @Autowired
  IBrandService brandService;

    /**
     * 根据ID获取详情
     * @param id
     * @return
     */
  @GetMapping("user")
  public Result<Brand> getBrand(String id){
      return Result.success(brandService.getById(id));
  }

  /**
     * 新增 bran
     * @param brand
     * @return
     */
  @PostMapping("user")
  public Result<Brand> addBrand(@RequestBody Brand brand){
      return Result.success(brandService.save(brand));
  }

  /**
     * 修改 bran
     * @param brand
     * @return
     */
  @PutMapping("user")
  public Result<Brand> updateBrand(@RequestBody Brand brand){
      return Result.success(brandService.save(brand));
  }
  /**
     * 删除 bran
     * @param id
     * @return
     */
  @DeleteMapping("user")
  public Result<Brand> deleteBrand(String id){
      return Result.success(brandService.removeById(id));
  }
}
