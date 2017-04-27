package jp.co.nttdocomo.mpi.dto.response;

import jp.co.nttdocomo.mpi.entity.SampleEntity;

public class SampleGet {

    SampleEntity result;

    /**
     * @return result
     */
    public SampleEntity getResult() {
        return result;
    }

    /**
     * @param result セットする result
     */
    public void setResult(SampleEntity result) {
        this.result = result;
    }

}
