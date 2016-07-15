package ${mainPackageName}.dao;

import java.util.List;
import java.util.Map;

import ${mainPackageName}.dto.${entityName};

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
	int queryAll${entityName}Count(Map<String, Object> paramMap);

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
	int add${entityName}(${entityName} ${entityName?uncap_first});
	
	/**
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	int update${entityName}(${entityName} ${entityName?uncap_first});
	
}
