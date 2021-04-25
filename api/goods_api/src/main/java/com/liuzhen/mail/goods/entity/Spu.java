package com.liuzhen.mail.goods.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhen
 * @since 2021-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Spu对象", description="")
public class Spu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "SPU名")
    private String name;

    @ApiModelProperty(value = "简介")
    private String intro;

    @ApiModelProperty(value = "品牌ID")
    private Integer brandId;

    @ApiModelProperty(value = "一级分类")
    private Integer categoryOneId;

    @ApiModelProperty(value = "二级分类")
    private Integer categoryTwoId;

    @ApiModelProperty(value = "三级分类")
    private Integer categoryThreeId;

    @ApiModelProperty(value = "图片列表")
    private String images;

    @ApiModelProperty(value = "售后服务")
    private String afterSalesService;

    @ApiModelProperty(value = "介绍")
    private String content;

    @ApiModelProperty(value = "规格列表")
    private String attributeList;

    @ApiModelProperty(value = "是否上架,0已下架，1已上架")
    private Integer isMarketable;

    @ApiModelProperty(value = "是否删除,0:未删除，1：已删除")
    private Integer isDelete;

    @ApiModelProperty(value = "审核状态，0：未审核，1：已审核，2：审核不通过")
    private Integer status;


}
