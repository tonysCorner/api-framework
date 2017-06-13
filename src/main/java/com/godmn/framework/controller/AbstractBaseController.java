//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godmn.framework.controller;

import com.weyao.common.AES;
import com.weyao.common.RSA;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;

public abstract class AbstractBaseController {
    public static final String RSA_KEY = "__rsakey";
    public static final String AES_BODY = "__aesbody";
    public static final String AES_KEY = "__aeskey";

    public AbstractBaseController() {
    }

    public HttpServletRequest decryptRSA(HttpServletRequest request, String paramName) {
        String ecryptText = request.getParameter(paramName);

        try {
            if(StringUtils.isNotBlank(ecryptText)) {
                String e = RSA.decrypt(ecryptText, RSA.getPrivateKey(this.getRSAPrivateKey()));
                return HttpServletRequestWrapper.wrap(request, paramName, new String[]{e});
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return request;
    }

    public HttpServletRequest decryptAES(HttpServletRequest request, String password) {
        String body = request.getParameter("__aesbody");

        try {
            if(StringUtils.isNotBlank(body)) {
                String e = AES.decrypt(body, password);
                return HttpServletRequestWrapper.wrap(request, e);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return request;
    }

    public String encryptRSA(HttpServletRequest request, String data) {
        String key = request.getParameter("__rsakey");
        if(StringUtils.isNotBlank(key)) {
            try {
                return RSA.encrypt(data, RSA.getPublicKey(key));
            } catch (Exception var5) {
                var5.printStackTrace();
            }
        }

        return data;
    }

    public HttpServletRequest decryptRSA(HttpServletRequest request) {
        return this.decryptRSA(request, "__aeskey");
    }

    public String encryptAES(HttpServletRequest request, String data) {
        String key = request.getParameter("__aeskey");
        if(StringUtils.isNotBlank(key)) {
            try {
                return AES.encrypt(data, key);
            } catch (Exception var5) {
                var5.printStackTrace();
                return null;
            }
        } else {
            return data;
        }
    }

    public abstract String getRSAPublicKey();

    public abstract String getRSAPrivateKey();
}
