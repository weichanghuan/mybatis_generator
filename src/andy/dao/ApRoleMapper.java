package andy.dao;

import andy.model.ApRole;

public interface ApRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApRole record);

    int insertSelective(ApRole record);

    ApRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApRole record);

    int updateByPrimaryKey(ApRole record);
}