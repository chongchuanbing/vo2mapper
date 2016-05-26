package com.ihomefnt.cms.intf.${entityName?lower_case};

import java.util.List;

import com.ihomefnt.cms.http.PageModel;
import com.ihomefnt.cms.http.SearchRequestModel;
import com.ihomefnt.cms.intf.${entityName?lower_case}.dto.${entityName};
import com.ihomefnt.cms.intf.${entityName?lower_case}.http.Http${entityName};

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
	Long add${entityName}(${entityName} ${entityName?uncap_first});
	
	/**
	 * 
	 * @param ${entityName?uncap_first}
	 * @return
	 */
	Long update${entityName}(${entityName} ${entityName?uncap_first});
	
	/**
	 * 检索方法
	 * @param searchRequestModel
	 * @return
	 */
	PageModel queryAll${entityName}(SearchRequestModel searchRequestModel);

	/**
	 * 根据id查询
	 * @param familyOrderId
	 * @return
	 */
	Http${entityName} query${entityName}(Long ${entityName?lower_case}Id);
}
