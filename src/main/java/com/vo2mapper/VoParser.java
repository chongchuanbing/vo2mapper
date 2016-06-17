package com.vo2mapper;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ihomefnt.cms.intf.aftersale.dto.AfterSaleOrderRelate;
import com.vo2mapper.util.FileUtils;
import com.vo2mapper.util.FreemarkerUtil;
import com.vo2mapper.vo.FieldVo;

/**
 * 
 * @author Administrator
 *
 */
public class VoParser {

	public static void main(String[] args) throws IOException {

		String classFullName = AfterSaleOrderRelate.class.getName();
		
		VoParser.beforeDeal(classFullName);
		
//		VoParser.copyFile(classFullName);
	}
	
	/**
	 * 预处理
	 * @param classFullName
	 * @throws IOException
	 */
	public static void beforeDeal(String classFullName) throws IOException {
		String className = classFullName.substring(classFullName.lastIndexOf(".")+1);
		
		String packageName = classFullName.substring(0, classFullName.lastIndexOf("."));
		String mainPackageName = classFullName.substring(0, classFullName.indexOf(".dto"));
		String moduleName = mainPackageName.substring(mainPackageName.lastIndexOf(".")+1);
		String tableName = "";
		if (className.startsWith("R")) {
			tableName = showName2DbName(className).substring(1);
		} else {
			tableName = "t" + showName2DbName(className);
		}
		String databaseIdName = "";
		if (className.startsWith("R")) {
			databaseIdName = "id" + showName2DbName(className).substring(1);
		} else {
			databaseIdName = "idt" + showName2DbName(className);
		}
		
		List<FieldVo> fieldVoList = VoParser.getAllAttrs(classFullName);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("fieldMapList", fieldVoList);
		map.put("tableName", tableName);
		map.put("entityName", className);
		map.put("databaseIdName", databaseIdName);
		map.put("packageName", packageName);
		map.put("mainPackageName", mainPackageName);
		map.put("fullClassName", classFullName);
		map.put("moduleName", moduleName);

		VoParser.processHttp(map, className);
		VoParser.processDao(map, className);
		VoParser.processDaoImpl(map, className);
		VoParser.processService(map, className);
		VoParser.processServiceImpl(map, className);
		VoParser.processMapper(map, className);
		
	}
	
	public static void copyFile(String classFullName) {
		String classPath = VoParser.getClassPath(classFullName);
		
	}

	/**
	 * 生成dao文件
	 * @param className
	 * @throws IOException 
	 */
	public static void processHttp(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------http process start--------------------------------");
		VoParser.process(map, "http.ftl", File.separator + "http" + File.separator + "Http" + className + ".java");
		System.out.println("--------------------------------------http process end--------------------------------");
	}

	/**
	 * 生成dao文件
	 * @param className
	 * @throws IOException 
	 */
	public static void processDao(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------dao process start--------------------------------");
		VoParser.process(map, "dao.ftl", File.separator + "dao" + File.separator + className + "Dao.java");
		System.out.println("--------------------------------------dao process end--------------------------------");
	}
	
	public static void processDaoImpl(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------dao implement process start--------------------------------");
		VoParser.process(map, "daoImpl.ftl", File.separator + className + "DaoImpl.java");
		System.out.println("--------------------------------------dao implement process end--------------------------------");
	}
	
	/**
	 * 生成service文件
	 * @param className
	 * @throws IOException 
	 */
	public static void processService(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------service process start--------------------------------");
		VoParser.process(map, "service.ftl", File.separator + "service" + File.separator + className + "Service.java");
		System.out.println("--------------------------------------service process process end--------------------------------");
	}
	
	public static void processServiceImpl(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------service implement process start--------------------------------");
		VoParser.process(map, "serviceImpl.ftl", File.separator + className + "ServiceImpl.java");
		System.out.println("--------------------------------------service implement process end--------------------------------");
	}
	
	/**
	 * 生成mapper文件
	 * @param map
	 * @param className
	 * @throws IOException
	 */
	public static void processMapper(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------mapper file process start--------------------------------");
		VoParser.process(map, "mapper.ftl", "mapper" + showName2DbName(className) + ".xml");
		System.out.println("--------------------------------------mapper file process end--------------------------------");
	}
	
	/**
	 * 
	 * @param map
	 * @param templateName
	 * @param outFileName
	 * @throws IOException
	 */
	public static void process(Map<String, Object> map, String templateName, String outFileName) throws IOException {
		String basePath = VoParser.class.getResource("/").getPath();
		basePath = basePath.replace("file:/", "");

		String pageStr = FreemarkerUtil.processTemplateContent(templateName,
				map);
		pageStr = pageStr.replaceAll("\\\\", "");
		
		VoParser.outFile(outFileName, pageStr);
	}

	public static void process(String className, String templateName, String outFileName) {
		
	}
	
	/**
	 * 输出文件
	 * @param fileName
	 * @param content
	 * @throws IOException
	 */
	public static void outFile(String fileName, String content) throws IOException {
		String basePath = VoParser.class.getResource("/").getPath();
		basePath = basePath.replace("file:/", "");
		String filePath = basePath + File.separator + "mapper_out";
		FileUtils.codegenerate(filePath, fileName, content);
	}
	
	public static String getClassPath(String classFullName) {
		Class clasz = null;
		try {
			clasz = Class.forName(classFullName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (null == clasz) {
			return null;
		}
		
		String path = clasz.getResource("").toString();
		path = path.replaceAll("file:/", "");
		return new File(path).getParent();
	}

	/**
	 * 制定类名，获取所有类属性 
	 * @param className
	 * @return
	 */
	public static List<FieldVo> getAllAttrs(String className) {
		Class clasz = null;
		try {
			clasz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (null == clasz) {
			return null;
		}
		
		List<FieldVo> fieldVoList = new ArrayList<FieldVo>();

		Set<Field> fieldSet = getClassFields(clasz, true);
		
		Field[] fieldArr = new Field[fieldSet.size()];
		fieldArr = fieldSet.toArray(fieldArr);
		for (Field item : fieldArr) {
			
//			PrimaryKey annoPrimaryKey = item.getAnnotation(PrimaryKey.class);
//			if (null != annoPrimaryKey) {
//				System.out.println(annoPrimaryKey.annotationType().getName());
//			} else {
//				System.out.println("get");
//			}

			String isPrimaryKey = "false";
			String isForeginKey = "false";
			String isSearch = "false";
			Annotation[] annos = item.getAnnotations();
			for (Annotation itemInner : annos) {
				String claszName = itemInner.annotationType().getName();
				if ("com.vo2mapper.annotation.PrimaryKey".equals(claszName)) {
					isPrimaryKey = "true";
				}
				if ("com.vo2mapper.annotation.ForeginKey".equals(claszName)) {
					isForeginKey = "true";
				}
				if ("com.vo2mapper.annotation.FieldSearch".equals(claszName)) {
					isSearch = "true";
				}
			}
			
			String typeName = item.getType().getName();

			String fieldName = item.getName();
			String dbName = "";
			if ("true".equals(isForeginKey)) {
				dbName = showName2DbNameForeginKey(fieldName);
			} else {
				dbName = showName2DbName(fieldName);
			}

			FieldVo fieldVo = new FieldVo();
			fieldVo.setSearch(isSearch);
			fieldVo.setPrimaryKey(isPrimaryKey);
			fieldVo.setForeginKey(isForeginKey);
			fieldVo.setShowName(fieldName);
			fieldVo.setDbName(dbName);

			fieldVoList.add(fieldVo);
		}

		return fieldVoList;
	}

	/**
	 * 获取当前类属性
	 * @param clazz
	 * @param includeParentClass
	 * @return
	 */
	public static Set<Field> getClassFields(Class clazz,
			boolean includeParentClass) {
		Set<Field> fieldSet = new HashSet<Field>();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			fieldSet.add(field);
		}
		if (includeParentClass) {
			getParentClassFields(fieldSet, clazz.getSuperclass());
		}
		return fieldSet;
	}

	/**
	 * 获取父类属性
	 * @param map
	 * @param clazz
	 * @return
	 */
	private static Set<Field> getParentClassFields(
			Set<Field> fieldSet, Class clazz) {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			fieldSet.add(field);
		}
		if (clazz.getSuperclass() == null) {
			return fieldSet;
		}
		getParentClassFields(fieldSet, clazz.getSuperclass());
		return fieldSet;
	}
	
	/**
	 * 
	 * @param showName
	 * @return
	 */
	private static String showName2DbNameForeginKey(String showName) {
		
		if (showName.endsWith("Id")) {
			showName = showName.substring(0, showName.lastIndexOf("Id"));
		}

		StringBuffer buffer = new StringBuffer();
		char[] charArr = showName.toCharArray();
		for (char item : charArr) {
			int charInt = (int) item;
			if (charInt >= 65 && charInt <= 90) {
				char lowerCase = Character.toLowerCase(item);
				buffer.append('_');
				buffer.append(lowerCase);
			} else {
				buffer.append(item);
			}
		}

		return "fid_"+buffer.toString();
	}

	/**
	 * 
	 * @param showName
	 * @return
	 */
	private static String showName2DbName(String showName) {

		StringBuffer buffer = new StringBuffer();
		char[] charArr = showName.toCharArray();
		for (char item : charArr) {
			int charInt = (int) item;
			if (charInt >= 65 && charInt <= 90) {
				char lowerCase = Character.toLowerCase(item);
				buffer.append('_');
				buffer.append(lowerCase);
			} else {
				buffer.append(item);
			}
		}

		return buffer.toString();
	}

}
