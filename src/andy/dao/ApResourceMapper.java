package andy.dao;

import andy.model.ApResource;

public interface ApResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApResource record);

    int insertSelective(ApResource record);

    ApResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApResource record);

    int updateByPrimaryKey(ApResource record);
}