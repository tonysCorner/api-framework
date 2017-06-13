//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godmn.framework.controller;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class HttpServletResponseCopier extends HttpServletResponseWrapper {
    private ServletOutputStream outputStream;
    private PrintWriter writer;
    private ServletOutputStreamCopier copier;

    public HttpServletResponseCopier(HttpServletResponse response) throws IOException {
        super(response);
    }

    public ServletOutputStream getOutputStream() throws IOException {
        if(this.writer != null) {
            throw new IllegalStateException("getWriter() has already been called on this response.");
        } else {
            if(this.outputStream == null) {
                this.outputStream = this.getResponse().getOutputStream();
                this.copier = new ServletOutputStreamCopier(this.outputStream);
            }

            return this.copier;
        }
    }

    public PrintWriter getWriter() throws IOException {
        if(this.outputStream != null) {
            throw new IllegalStateException("getOutputStream() has already been called on this response.");
        } else {
            if(this.writer == null) {
                this.copier = new ServletOutputStreamCopier(this.getResponse().getOutputStream());
                this.writer = new PrintWriter(new OutputStreamWriter(this.copier, this.getResponse().getCharacterEncoding()), true);
            }

            return this.writer;
        }
    }

    public void flushBuffer() throws IOException {
        if(this.writer != null) {
            this.writer.flush();
        } else if(this.outputStream != null) {
            this.copier.flush();
        }

    }

    public byte[] getCopy() {
        return this.copier != null?this.copier.getCopy():new byte[0];
    }
}
