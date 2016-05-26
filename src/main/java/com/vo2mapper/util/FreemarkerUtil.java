package com.vo2mapper.util;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;


/**
 * 
 * @author Administrator
 *
 */
public class FreemarkerUtil {

    private static Configuration config = new Configuration();
    
    static{
        try {
        	String path = FreemarkerUtil.class.getResource("/") + File.separator + "templates";
        	path = path.replaceAll("file:/", "");
			initConfig(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * @param templateName
     *            模板名字
     * @param root
     *            模板根 用于在模板内输出结果集
     * @param out
     *            输出对象 具体输出到哪里
     */
    public static void processTemplate(String templateName, Map<?, ?> root, Writer out) {
        try {
            // 获得模板
            Template template = config.getTemplate(templateName, "utf-8");
            // 生成文件（这里是我们是生成html）
            template.process(root, out);
            out.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (TemplateException e) {
            e.printStackTrace();
        }
        finally {
            try {
                out.close();
                out = null;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 初始化模板配置
     * 
     * @param servletContext
     *            javax.servlet.ServletContext
     * @param templateDir
     *            模板位置
     * @throws IOException 
     */
    public static void initConfig(String templateDir) throws IOException {
        config.setLocale(Locale.CHINA);
        config.setDefaultEncoding("utf-8");
        config.setEncoding(Locale.CHINA, "utf-8");
//        config.setServletContextForTemplateLoading(templateDir);
        config.setDirectoryForTemplateLoading(new File(templateDir));
        config.setObjectWrapper(new DefaultObjectWrapper());
    }

    public static String processTemplateContent(String templateName, Map<?, ?> root) {
        StringWriter stringWriter = null;
        try {
            stringWriter = new StringWriter();
            BufferedWriter writer = new BufferedWriter(stringWriter);
            Template template = config.getTemplate(templateName);
            template.process(root, writer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (TemplateException e) {
            e.printStackTrace();
        }
        return stringWriter.getBuffer().toString();
    }

}
