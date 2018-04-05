package andy.dao;

import andy.model.ApUser;

public interface ApUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApUser record);

    int insertSelective(ApUser record);

    ApUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApUser record);

    int updateByPrimaryKey(ApUser record);
}