package com.godmn.framework.controller;


import com.godmn.framework.common.PageBean;
import com.godmn.framework.entity.Sale;
import com.godmn.framework.exception.SrvException;
import com.godmn.framework.mail.MailService;
import com.godmn.framework.resp.ResponseUtils;
import com.godmn.framework.service.SaleService;
import org.apache.commons.lang.StringUtils;
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
import java.util.List;


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
