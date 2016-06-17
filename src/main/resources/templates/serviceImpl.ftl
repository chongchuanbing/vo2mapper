package com.ihomefnt.cms.impl.${moduleName};

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihomefnt.cms.http.PageModel;
import com.ihomefnt.cms.http.SearchRequestModel;
import ${mainPackageName}.${entityName}Service;
import ${mainPackageName}.dao.${entityName}Dao;
import ${mainPackageName}.dto.${entityName};
import ${mainPackageName}.http.Http${entityName};

/**
 * 
 * @author chong
 *
 */
@Service
public class ${entityName}ServiceImpl implements ${entityName}Service {
	
	@Autowired
	private ${entityName}Dao ${entityName?uncap_first}Dao;

	@Override
	public List<Http${entityName}> queryAll${entityName}() {
		return ${entityName?uncap_first}Dao.queryAll${entityName}();
	}

	@Override
	public Long add${entityName}(${entityName} ${entityName?uncap_first}) {
		return ${entityName?uncap_first}Dao.add${entityName}(${entityName?uncap_first});
	}

	@Override
	public Long update${entityName}(${entityName} ${entityName?uncap_first}) {
		return ${entityName?uncap_first}Dao.update${entityName}(${entityName?uncap_first});
	}

	/**
	 * 检索方法
	 * @param searchRequestModel
	 * @return
	 */
	public PageModel queryAll${entityName}(SearchRequestModel searchRequestModel) {
		return null;
	}

	/**
	 * 根据id查询
	 * @param familyOrderId
	 * @return
	 */
	public Http${entityName} query${entityName}(Long ${entityName?lower_case}Id) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("${entityName?lower_case}Id", ${entityName?lower_case}Id);
		List<Http${entityName}> list = ${entityName?uncap_first}Dao.queryAll${entityName}(paramMap);
		if (null != list && 0 < list.size()) {
			return list.get(0);
		}
		return null;
 	}
}
