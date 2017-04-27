package jp.co.nttdocomo.mpi.dto.response;

import java.util.List;

import jp.co.nttdocomo.mpi.entity.SampleEntity;

public class SampleGetAll {

    List<SampleEntity> result;

    /**
     * @return result
     */
    public List<SampleEntity> getResult() {
        return result;
    }

    /**
     * @param result セットする result
     */
    public void setResult(List<SampleEntity> result) {
        this.result = result;
    }


}
