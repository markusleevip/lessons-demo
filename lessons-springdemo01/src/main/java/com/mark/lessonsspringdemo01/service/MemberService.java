package com.mark.lessonsspringdemo01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mark.lessonsspringdemo01.entity.Member;

import java.util.List;

/**
 * @Author: Mark
 * @Date: 2022/7/24
 */
public interface MemberService extends IService<Member> {
    List<Member> all();
}
