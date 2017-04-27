package jp.co.nttdocomo.mpi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.nttdocomo.mpi.entity.SampleEntity;

@Mapper
public interface SampleMapper {

    @Select("SELECT sample_id,sample_data FROM sample")
    List<SampleEntity> selectAll();

    SampleEntity selectById(Integer id);

    void regist(SampleEntity entity);
}
