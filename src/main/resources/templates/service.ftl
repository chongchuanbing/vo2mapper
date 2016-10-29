package ${mainPackageName};

import java.util.List;

import com.ihomefnt.cms.http.PageModel;
import com.ihomefnt.cms.http.SearchRequestModel;
import ${dtoFullName};

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
	 * 检索方法
	 * @param searchRequestModel
	 * @return
	 */
	PageModel queryAll${dtoName}(SearchRequestModel searchRequestModel);

	/**
	 * 根据id查询
	 * @param ${dtoName?uncap_first}Id
	 * @return
	 */
	${dtoName} query${dtoName}(Integer ${entityName?uncap_first}Id);
}
