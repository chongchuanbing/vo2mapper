package com.ihomefnt.cms.impl.${moduleName};

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihomefnt.cms.utils.ModelMapperUtil;
import ${mainPackageName}.${entityName}Service;
import ${mainPackageName}.dao.I${entityName}Dao;
import ${fullClassName};
import ${dtoFullName};

/**
 * 
 * @author chong
 *
 */
@Service
public class ${entityName}Service implements I${entityName}Service {
	
	@Autowired
	private I${entityName}Dao ${entityName?uncap_first}Dao;

	@Override
	public List<${dtoName}> queryAll${dtoName}() {
		List<${entityName}> ${entityName?uncap_first}List = ${entityName?uncap_first}Dao.queryAll${entityName}();
		if (null == ${entityName?uncap_first}List) {
			${entityName?uncap_first}List = new ArrayList<>();
		}
		return ModelMapperUtil.strictMapList(${entityName?uncap_first}List, ${dtoName}.class);
	}

	@Override
	public Integer add${dtoName}(${dtoName} ${dtoName?uncap_first}) {
		if (null == ${dtoName?uncap_first}) {
			return -1;
		}
		${entityName} ${entityName?uncap_first} = ModelMapperUtil.strictMap(${dtoName?uncap_first}, ${entityName}.class);
		return ${entityName?uncap_first}Dao.add${entityName}(${entityName?uncap_first});
	}

	@Override
	public Integer update${dtoName}(${dtoName} ${dtoName?uncap_first}) {
		if (null == ${dtoName?uncap_first}) {
			return -1;
		}
		${entityName} ${entityName?uncap_first} = ModelMapperUtil.strictMap(${dtoName?uncap_first}, ${entityName}.class);
		return ${entityName?uncap_first}Dao.update${entityName}(${entityName?uncap_first});
	}

	/**
	 * 根据id查询
	 * @param ${entityName?uncap_first}Id
	 * @return
	 */
	public ${dtoName} query${dtoName}(Integer ${entityName?uncap_first}Id) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("${entityName?uncap_first}Id", ${entityName?uncap_first}Id);
		List<${entityName}> list = ${entityName?uncap_first}Dao.queryAll${entityName}(paramMap);
		if (null != list && 0 < list.size()) {
			${entityName} ${entityName?uncap_first} = list.get(0);
			return ModelMapperUtil.strictMap(${entityName?uncap_first}, ${dtoName}.class);
		}
		return null;
 	}
}
