package ${mainPackageName};

import java.util.List;

import com.ihomefnt.cms.http.PageModel;
import com.ihomefnt.cms.http.SearchRequestModel;
import ${mainPackageName}.dto.${entityName};
import ${mainPackageName}.http.Http${entityName};

/**
 * 
 * @author chong
 *
 */
public interface ${entityName}Service {
	
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
	int add${entityName}(${entityName} ${entityName?uncap_first});
	
	/**
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	int update${entityName}(${entityName} ${entityName?uncap_first});
	
	/**
	 * 检索方法
	 * @param searchRequestModel
	 * @return
	 */
	PageModel queryAll${entityName}(SearchRequestModel searchRequestModel);

	/**
	 * 根据id查询
	 * @param ${entityName?uncap_first}Id
	 * @return
	 */
	Http${entityName} query${entityName}(int ${entityName?uncap_first}Id);
}
