package com.mark.lessonsspringdemo01.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mark.lessonsspringdemo01.entity.Member;
import com.mark.lessonsspringdemo01.mapper.MemberMapper;
import com.mark.lessonsspringdemo01.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Mark
 * @Date: 2022/7/24
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

    @Override
    public List<Member> all() {
        return baseMapper.all();
    }
}
