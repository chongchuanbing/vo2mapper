package ${mainPackageName};

import java.util.List;

import ${dtoFullName};

/**
 * 
 * @author chong
 *
 */
public interface I${entityName}Service {
	
	/**
	 * 
	 * @return
	 */
	List<${dtoName}> queryAll${dtoName}();

	/**
	 * 
	 * @param ${dtoName?uncap_first}
	 * @return
	 */
	Integer add${dtoName}(${dtoName} ${dtoName?uncap_first});
	
	/**
	 * 
	 * @param ${dtoName?uncap_first}
	 * @return
	 */
	Integer update${dtoName}(${dtoName} ${dtoName?uncap_first});

	/**
	 * 根据id查询
	 * @param ${dtoName?uncap_first}Id
	 * @return
	 */
	${dtoName} query${dtoName}(Integer ${entityName?uncap_first}Id);
}
