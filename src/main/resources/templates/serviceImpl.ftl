package com.ihomefnt.cms.impl.${entityName?lower_case};

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihomefnt.cms.http.PageModel;
import com.ihomefnt.cms.http.SearchRequestModel;
import com.ihomefnt.cms.intf.${entityName?lower_case}.${entityName}Service;
import com.ihomefnt.cms.intf.${entityName?lower_case}.dao.${entityName}Dao;
import com.ihomefnt.cms.intf.${entityName?lower_case}.dto.${entityName};
import com.ihomefnt.cms.intf.${entityName?lower_case}.http.Http${entityName};

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
	PageModel queryAll${entityName}(SearchRequestModel searchRequestModel) {
		return null;
	}

	/**
	 * 根据id查询
	 * @param familyOrderId
	 * @return
	 */
	Http${entityName} query${entityName}(Long ${entityName?lower_case}Id) {
		return null;
	}
}
