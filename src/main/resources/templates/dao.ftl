package ${mainPackageName}.dao;

import java.util.List;
import java.util.Map;

import ${fullClassName};

/**
 * 
 * @author chong
 *
 */
public interface I${entityName}Dao {
	
	/**
	 * 
	 * @return
	 */
	List<${entityName}> queryAll${entityName}(Map<String, Object> paramMap);

	/**
	 * 根据主键查询
	 * 
	 * @return
	 */
	List<${entityName}> query${entityName}ById(Integer ${entityName?uncap_first}Id);
	
	/**
	 * 
	 * @return
	 */
	Integer queryAll${entityName}Count(Map<String, Object> paramMap);

	/**
	 * 
	 * @return
	 */
	List<${entityName}> queryAll${entityName}();

	/**
	 * 新增
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	Integer add${entityName}(${entityName} ${entityName?uncap_first});

	/**
	 * 批量新增
	 *
	 * @param ${entityName?uncap_first}List
	 * @return
	 */
	Integer add${entityName}List(List<${entityName}> ${entityName?uncap_first}List);
	
	/**
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	Integer update${entityName}(${entityName} ${entityName?uncap_first});
	
}
