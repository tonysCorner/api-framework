package com.weyao.web.quote.controller;


import com.weyao.web.quote.resp.ResponseUtils;
import com.weyao.web.quote.resp.Ret;
import com.weyao.web.quote.util.HttpXmlClient;
import org.apache.thrift.TException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/api")
public class QuantumController extends BaseController {

    @ResponseBody
    @RequestMapping(value = "/test.xhtml", produces = "application/json;charset=utf-8")
    public Object test(HttpServletRequest request, HttpServletResponse response) throws TException {

        String menu = "{\"menu\": [{\"text\": \"欢迎页面\",\"sref\": \"app.welcome\",\"icon\": \"icon-tag\"},{\"text\": \"二级菜单\",\"sref\": \"#\",\"icon\": \"fa fa-shield\",\"submenu\": [{\"text\": \"测试\", \"sref\" : \"app.test\"}],\"alert\": \"\",\"label\": \"label label-primary\"}]}";
        return ResponseUtils.succ(menu);
    }
    @ResponseBody
    @RequestMapping(value = "/test2.xhtml", produces = "application/json;charset=utf-8")
    public Object test1(HttpServletRequest request, HttpServletResponse response) throws TException {
        return ResponseUtils.succ("ok i'm test2.xhtml");
    }

    @ResponseBody
    @RequestMapping(value = "/login.xhtml", produces = "application/json;charset=utf-8")
    public Object login(HttpServletRequest request,
                        HttpServletResponse response,
                        @RequestParam(value = "email", required = true) String email,
                        @RequestParam(value = "password", required = true) String password) throws TException {

        String token = "lixingjian";
        if ("l@weyao.com".equals(email) && "123456".equals(password)) {
            return ResponseUtils.succ(token);
        } else if ("l@weyao.com".equals(email) && !"123456".equals(password)) {
            return ResponseUtils.instance(Ret.密码错误.code, Ret.密码错误.msg);
        } else {
            return ResponseUtils.instance(Ret.用户不存在.code, Ret.用户不存在.msg);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/register.xhtml", produces = "application/json;charset=utf-8")
    public Object register(HttpServletRequest request,
                        HttpServletResponse response,
                        @RequestParam(value = "email", required = true) String email,
                        @RequestParam(value = "password", required = true) String password) throws TException {

        String token = "lixingjian";
        if ("l@weyao.com".equals(email) && "123456".equals(password)) {
            return ResponseUtils.succ(token);
        } else if ("l@weyao.com".equals(email) && !"123456".equals(password)) {
            return ResponseUtils.instance(Ret.密码错误.code, Ret.密码错误.msg);
        } else {
            return ResponseUtils.instance(Ret.用户不存在.code, Ret.用户不存在.msg);
        }
    }

}
