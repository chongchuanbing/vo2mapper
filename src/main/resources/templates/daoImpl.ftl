package com.ihomefnt.cms.impl.${entityName?lower_case};

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ${mainPackageName}.dao.I${entityName}Dao;
import ${fullClassName};

/**
 * 
 * @author chong
 *
 */
@Repository
public class ${entityName}Dao implements I${entityName}Dao {
	
	@Autowired
    SqlSessionTemplate sqlSession;

    private static final String NAME_SPACE = "${fullClassName}.";

	@Override
	public List<${entityName}> queryAll${entityName}(Map<String, Object> paramMap) {
		return sqlSession.selectList(NAME_SPACE + "queryAll${entityName}", paramMap);
	}

	@Override
	public List<${entityName}> query${entityName}ById(Integer ${entityName?uncap_first}Id) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("${entityName?uncap_first}Id", ${entityName?uncap_first}Id);
		return sqlSession.selectOne(NAME_SPACE + "query${entityName}ById", paramMap);
	}
	
	@Override
	public Integer queryAll${entityName}Count(Map<String, Object> paramMap) {
		return sqlSession.selectOne(NAME_SPACE + "queryAll${entityName}Count", paramMap);
	}
	
	@Override
	public List<${entityName}> queryAll${entityName}() {
		return sqlSession.selectList(NAME_SPACE + "queryAll${entityName}");
	}

	@Override
	public Integer add${entityName}(${entityName} ${entityName?uncap_first}) {
		sqlSession.insert(NAME_SPACE + "add${entityName}", ${entityName?uncap_first});
		return ${entityName?uncap_first}.getId();
	}

	@Override
	public Integer add${entityName}List(List<${entityName}> ${entityName?uncap_first}List) {
		return sqlSession.insert(NAME_SPACE + "add${entityName}List", ${entityName?uncap_first}List);
	}

	@Override
	public Integer update${entityName}(${entityName} ${entityName?uncap_first}) {
		sqlSession.update(NAME_SPACE + "update${entityName}", ${entityName?uncap_first});
		return ${entityName?uncap_first}.getId();
	}
}
