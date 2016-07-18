package com.ihomefnt.cms.impl.${moduleName};

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ${mainPackageName}.dao.${entityName}Dao;
import ${mainPackageName}.dto.${entityName};

/**
 * 
 * @author chong
 *
 */
@Repository
public class ${entityName}DaoImpl implements ${entityName}Dao {
	
	@Autowired
    SqlSessionTemplate sqlSession;

    private static final String NAME_SPACE = "com.ihomefnt.cms.${entityName?lower_case}.";

	@Override
	public List<${entityName}> queryAll${entityName}(Map<String, Object> paramMap) {
		return sqlSession.selectList(NAME_SPACE + "queryAll${entityName}", paramMap);
	}
	
	@Override
	public int queryAll${entityName}Count(Map<String, Object> paramMap) {
		return sqlSession.selectOne(NAME_SPACE + "queryAll${entityName}Count", paramMap);
	}
	
	@Override
	public List<${entityName}> queryAll${entityName}() {
		return sqlSession.selectList(NAME_SPACE + "queryAll${entityName}");
	}

	@Override
	public int add${entityName}(${entityName} ${entityName?uncap_first}) {
		sqlSession.insert(NAME_SPACE + "add${entityName}", ${entityName?uncap_first});
		return ${entityName?uncap_first}.getId();
	}

	@Override
	public int update${entityName}(${entityName} ${entityName?uncap_first}) {
		sqlSession.update(NAME_SPACE + "update${entityName}", ${entityName?uncap_first});
		return ${entityName?uncap_first}.getId();
	}
}
