package com.godmn.framework.controller;


import com.godmn.framework.common.PageBean;
import com.godmn.framework.entity.Sale;
import com.godmn.framework.exception.SrvException;
import com.godmn.framework.mail.MailService;
import com.godmn.framework.resp.ResponseUtils;
import com.godmn.framework.service.SaleService;
import com.godmn.framework.util.HttpUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/api")
public class FrameworkController extends BaseController {


    private static final Logger logger = LoggerFactory.getLogger(FrameworkController.class);

    @Autowired
    SaleService saleService;
    @Autowired
    MailService mailService;

    @ResponseBody
    @RequestMapping(value = "/test.xhtml", produces = "application/json;charset=utf-8")
    public Object test(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String menu = "{\"menu\": [{\"text\": \"欢迎页面\",\"sref\": \"app.welcome\",\"icon\": \"icon-tag\"},{\"text\": \"二级菜单\",\"sref\": \"#\",\"icon\": \"fa fa-shield\",\"submenu\": [{\"text\": \"测试\", \"sref\" : \"app.test\"}],\"alert\": \"\",\"label\": \"label label-primary\"}]}";
        //mailService.sendMail("你好", "asd-7298@qq.com", "朋友好久不见", "/Users/lixingjian/Desktop/project/static/product/images/bg.png", "http://1234ye.com/img/H5_main_banner_2.jpg");
        return ResponseUtils.succ(menu);
    }
    @ResponseBody
    @RequestMapping(value = "/weather.xhtml", produces = "application/json;charset=utf-8")
    public Object weather(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String host = "http://saweather.market.alicloudapi.com";
        String path = "/hour24";
        String method = "GET";
        String appcode = "904017e9224346f1b18db4dcb09e9f93";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("area", "上海");
        querys.put("areaid", "101020100");

        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse res = HttpUtils.doGet(host, path, method, headers, querys);
            //获取response的body
            String resBody = EntityUtils.toString(res.getEntity());
            return ResponseUtils.succ(resBody);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseUtils.succ("");
    }

    @ResponseBody
    @RequestMapping(value = "/listSaleInfo.xhtml")
    public Object listSaleInfo(HttpServletRequest request, HttpServletResponse response,
                               @RequestParam(value = "name", required = false, defaultValue = "") String name,
                               @RequestParam(value = "startTime", required = false) String startTime,
                               @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum) throws SrvException, ParseException {


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PageBean pageBean = new PageBean(pageNum);
        Sale sale = new Sale();
        sale.setName(name);
        if (StringUtils.isNotEmpty(startTime)) {
            sale.setStartTime(formatter.parse(startTime));
        }
        List<Sale> list = saleService.listSaleInfo(sale, pageBean).getBeanList();
        return ResponseUtils.succ(list);
    }


}
