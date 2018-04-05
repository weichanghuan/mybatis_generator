package andy.dao;

import andy.model.ApUserRole;

public interface ApUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApUserRole record);

    int insertSelective(ApUserRole record);

    ApUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApUserRole record);

    int updateByPrimaryKey(ApUserRole record);
}