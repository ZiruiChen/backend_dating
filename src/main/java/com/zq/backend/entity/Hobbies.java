package com.zq.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hobbies")
public class Hobbies {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String intro;
    private String icon;
}
