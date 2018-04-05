package andy.dao;

import andy.model.ApRolResource;

public interface ApRolResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApRolResource record);

    int insertSelective(ApRolResource record);

    ApRolResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApRolResource record);

    int updateByPrimaryKey(ApRolResource record);
}