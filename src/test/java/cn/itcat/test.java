package cn.itcat;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// 1.创建配置类Configuration
		Configuration config = new Configuration(Configuration.getVersion());

		// 2.设置模板所在的目录resource，注意是文件所在目录不是文件全路径
		config.setDirectoryForTemplateLoading(new File("D:\\java\\pinyougou\\freeMarker-demo\\src\\main\\resources"));
		// 3.设置字符集
		config.setDefaultEncoding("UTF-8");
		// 4.获取模板
		Template template = config.getTemplate("test.ftl");
		// 5.创建数据模型
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("name", "张三 ");
		map.put("message", "欢迎来到神奇的品优购世界！");
		map.put("success", true);

		@SuppressWarnings("rawtypes")
		List goodsList = new ArrayList();

		@SuppressWarnings("rawtypes")
		Map goods1 = new HashMap();
		goods1.put("name", "苹果");
		goods1.put("price", 5.8);

		@SuppressWarnings("rawtypes")
		Map goods2 = new HashMap();
		goods2.put("name", "香蕉");
		goods2.put("price", 2.5);

		@SuppressWarnings("rawtypes")
		Map goods3 = new HashMap();
		goods3.put("name", "橘子");
		goods3.put("price", 3.2);
		goodsList.add(goods1);
		goodsList.add(goods2);
		goodsList.add(goods3);

		map.put("goodsList", goodsList);

		map.put("today", new Date());
		// 6.创建Writer对象
		Writer out = new FileWriter("D:\\123_Tools\\pageModelHtml\\item\\test.html");
		// 7.输出
		template.process(map, out);
		// 8.关闭Writer对象
		out.close();
		System.out.println("ok");
	}
}
