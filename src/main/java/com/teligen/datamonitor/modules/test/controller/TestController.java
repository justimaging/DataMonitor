package com.teligen.datamonitor.modules.test.controller;

import com.teligen.datamonitor.modules.test.service.TestService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/list")
    @ResponseBody
    @ApiOperation(value="@value注解的方式获取配置文件信息", notes="@value注解的方式获取配置文件信息")
    public List<Map<String, Object>> list(@RequestParam(required=false, value="name") String name){
        return testService.getList();
    }

    @ApiOperation(value = "获取新的订单信息")
    @GetMapping(value = "/order")
    public String getOrder(@ApiParam(value = "订单编号", required = true) @RequestParam(value = "orderNo", required = false) String orderNo,
                           @ApiParam(value = "当前页") @RequestParam(value = "pageNum", required = false) Integer pageNum,
                           @ApiParam(value = "每页显示数量") @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        return "请求测试成功";
    }

    @GetMapping(value = "/thymleaf")
    public String test(ModelMap modelMap) {
        modelMap.addAttribute("test","thymeleaf模板引擎测试");
        modelMap.addAttribute("password","thymeleaf模板引擎测试--password");
        return "html/test";
    }


    @GetMapping(value = "/jsp")
    public String testjsp(ModelMap modelMap) {
        modelMap.addAttribute("test","jsp模板引擎测试");
        modelMap.addAttribute("password","jsp模板引擎测试--password");
        return "jsp/test";
    }
}
