//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godmn.framework.controller;

import com.weyao.common.XssFilterUtil;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;

public class XssFilterMultipartHttpServletRequest extends DefaultMultipartHttpServletRequest {
    public XssFilterMultipartHttpServletRequest(HttpServletRequest request, MultiValueMap<String, MultipartFile> mpFiles, Map<String, String[]> mpParams, Map<String, String> mpParamContentTypes) {
        super(request, mpFiles, mpParams, mpParamContentTypes);
    }

    public XssFilterMultipartHttpServletRequest(HttpServletRequest request) {
        super(request);
    }

    public String getParameter(String name) {
        return XssFilterUtil.filter2Text(super.getParameter(name));
    }

    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        if(values != null) {
            for(int i = 0; i < values.length; ++i) {
                values[i] = XssFilterUtil.filter2Text(values[i]);
            }
        }

        return values;
    }

    public Map<String, String[]> getParameterMap() {
        Map parameterMap = super.getParameterMap();
        if(parameterMap != null) {
            Iterator var3 = parameterMap.keySet().iterator();

            while(true) {
                String[] values;
                do {
                    if(!var3.hasNext()) {
                        return parameterMap;
                    }

                    String key = (String)var3.next();
                    values = (String[])parameterMap.get(key);
                } while(values == null);

                for(int i = 0; i < values.length; ++i) {
                    values[i] = XssFilterUtil.filter2Text(values[i]);
                }
            }
        } else {
            return parameterMap;
        }
    }
}
