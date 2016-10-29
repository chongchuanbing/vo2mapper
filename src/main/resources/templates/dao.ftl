package ${mainPackageName}.dao;

import java.util.List;
import java.util.Map;

import ${fullClassName};

/**
 * 
 * @author chong
 *
 */
public interface ${entityName}Dao {
	
	/**
	 * 
	 * @return
	 */
	List<${entityName}> queryAll${entityName}(Map<String, Object> paramMap);
	
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
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	Integer add${entityName}(${entityName} ${entityName?uncap_first});
	
	/**
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	Integer update${entityName}(${entityName} ${entityName?uncap_first});
	
}
