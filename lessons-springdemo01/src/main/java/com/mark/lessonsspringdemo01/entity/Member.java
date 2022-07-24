package com.mark.lessonsspringdemo01.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Mark
 * @Date: 2022/7/24
 */

@Data
@TableName(value = "home_member")
public class Member {

    private Integer id;

    private String userName;

    private String nickName;

    private Integer age;

}
