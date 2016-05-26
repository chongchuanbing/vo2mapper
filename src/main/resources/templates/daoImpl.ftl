package com.ihomefnt.cms.impl.${entityName?lower_case};

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ${mainPackageName}.dao.${entityName}Dao;
import ${mainPackageName}.dto.${entityName};
import ${mainPackageName}.http.Http${entityName};

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
	public List<Http${entityName}> queryAll${entityName}(Map<String, Object> paramMap) {
		return null;
	}
	
	@Override
	public List<Http${entityName}> queryAll${entityName}() {
		return sqlSession.selectList(NAME_SPACE + "queryAll${entityName}");
	}

	@Override
	public Long add${entityName}(${entityName} ${entityName?uncap_first}) {
		sqlSession.insert(NAME_SPACE + "add${entityName}", ${entityName?uncap_first});
		return ${entityName?uncap_first}.getId();
	}

	@Override
	public Long update${entityName}(${entityName} ${entityName?uncap_first}) {
		sqlSession.update(NAME_SPACE + "update${entityName}", ${entityName?uncap_first});
		return ${entityName?uncap_first}.getId();
	}
}
