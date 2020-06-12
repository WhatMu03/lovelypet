package com.mumu.lp.web.dict.controller;

import com.mumu.lp.vo.R;
import com.mumu.lp.web.dict.vo.DictVo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping(value = "/dict")
public class DictController {

    @RequestMapping("/query")
    public R queryDict(DictVo dictVo) {
        return R.ok();
    }

}
