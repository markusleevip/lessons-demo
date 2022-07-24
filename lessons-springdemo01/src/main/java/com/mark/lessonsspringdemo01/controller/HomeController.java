package com.mark.lessonsspringdemo01.controller;

import com.alibaba.fastjson.JSON;
import com.mark.lessonsspringdemo01.entity.Member;
import com.mark.lessonsspringdemo01.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

/**
 * @Author: Mark
 * @Date: 2022/7/24
 */
@Controller
@RequestMapping(value = "/")
@RequiredArgsConstructor
@Slf4j
public class HomeController {

    private final MemberService memberService;

    @GetMapping
    public String Index(ModelMap modelMap) {
        List<Member> list = memberService.all();
        if (!Objects.isNull(list)) {
            log.info(JSON.toJSONString(list));
        }
        modelMap.put("list", list);
        return "index";
    }
}
