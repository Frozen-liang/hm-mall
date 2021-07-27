package com.hmall.item.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_item")
public class Item {
    @TableId(type = IdType.AUTO)
    private Integer id;//商品id
    private String name;//商品名称
    private Integer price;//价格（分）
    private Integer num;//库存数量
    private String image;//商品图片
    private String images;//商品图片列表
    private String category;//分类名称
    private String brand;//品牌名称
    private String spec;//规格
    private Integer sold;//销量
    private Integer commentCount;//评论数
    private String status;//商品状态 1-正常，2-下架
    private Date createTime;//创建时间
    private Date updateTime;//更新时间
}
