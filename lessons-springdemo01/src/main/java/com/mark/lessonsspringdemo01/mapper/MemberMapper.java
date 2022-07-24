package com.mark.lessonsspringdemo01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mark.lessonsspringdemo01.entity.Member;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Mark
 * @Date: 2022/7/24
 */
public interface MemberMapper extends BaseMapper<Member> {

    /**
     * 查询会员表
     * @return
     */
    @Select("select * from home_member")
    List<Member> all();
}
