//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godmn.framework.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletOutputStream;

public class ServletOutputStreamCopier extends ServletOutputStream {
    private OutputStream outputStream;
    private ByteArrayOutputStream copy;

    public ServletOutputStreamCopier(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.copy = new ByteArrayOutputStream(1024);
    }

    public void write(int b) throws IOException {
        this.outputStream.write(b);
        this.copy.write(b);
    }

    public byte[] getCopy() {
        return this.copy.toByteArray();
    }
}
