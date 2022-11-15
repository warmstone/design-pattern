package com.warmstone.design.pattern.facade;

import java.io.IOException;
import java.io.Writer;

/**
 * @author pengshun
 * @date 2022-11-10 20:27
 * @description
 */
public class HTMLWriter {

    private Writer writer;

    public HTMLWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<!DOCTYPE html>\n");
        writer.write("<html lang=\"en\">\n");
        writer.write("<head>\n");
        writer.write("\t<meta charset=\"UTF-8\">\n");
        writer.write("\t<title>Title</title>\n");
        writer.write("</head>\n");
        writer.write("<body>\n");
        writer.write("\t<h1>" + title + "</h1>\n");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("\t<p>" + msg + "</p>\n");
    }

    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    public void close() throws IOException {
        writer.write("</body>\n");
        writer.write("</html>");
        writer.close();
    }
}
