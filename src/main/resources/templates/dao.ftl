package com.ihomefnt.cms.intf.${entityName?lower_case}.dao;

import java.util.List;
import java.util.Map;

import ${mainPackageName}.dto.${entityName};
import ${mainPackageName}.http.Http${entityName};

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
	List<Http${entityName}> queryAll${entityName}(Map<String, Object> paramMap);

	/**
	 * 
	 * @return
	 */
	List<Http${entityName}> queryAll${entityName}();

	/**
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	Long add${entityName}(${entityName} ${entityName?uncap_first});
	
	/**
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	Long update${entityName}(${entityName} ${entityName?uncap_first});
	
}
