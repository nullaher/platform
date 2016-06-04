package test;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.CfgInfo;
import test.CfgInfoExample;

public interface CfgInfoMapper {
    int countByExample(CfgInfoExample example);

    int deleteByExample(CfgInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CfgInfo record);

    int insertSelective(CfgInfo record);

    List<CfgInfo> selectByExample(CfgInfoExample example);

    CfgInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CfgInfo record, @Param("example") CfgInfoExample example);

    int updateByExample(@Param("record") CfgInfo record, @Param("example") CfgInfoExample example);

    int updateByPrimaryKeySelective(CfgInfo record);

    int updateByPrimaryKey(CfgInfo record);
}