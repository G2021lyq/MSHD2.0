package com.qiu.pojo;

public class unified_code_Audio_Relation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unified_code_Audio_Relation.coding_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    private Integer codingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unified_code_Audio_Relation.audio_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    private Integer audioId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unified_code_Audio_Relation.coding_id
     *
     * @return the value of unified_code_Audio_Relation.coding_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public Integer getCodingId() {
        return codingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unified_code_Audio_Relation.coding_id
     *
     * @param codingId the value for unified_code_Audio_Relation.coding_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void setCodingId(Integer codingId) {
        this.codingId = codingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unified_code_Audio_Relation.audio_id
     *
     * @return the value of unified_code_Audio_Relation.audio_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public Integer getAudioId() {
        return audioId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unified_code_Audio_Relation.audio_id
     *
     * @param audioId the value for unified_code_Audio_Relation.audio_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void setAudioId(Integer audioId) {
        this.audioId = audioId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codingId=").append(codingId);
        sb.append(", audioId=").append(audioId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        unified_code_Audio_Relation other = (unified_code_Audio_Relation) that;
        return (this.getCodingId() == null ? other.getCodingId() == null : this.getCodingId().equals(other.getCodingId()))
            && (this.getAudioId() == null ? other.getAudioId() == null : this.getAudioId().equals(other.getAudioId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCodingId() == null) ? 0 : getCodingId().hashCode());
        result = prime * result + ((getAudioId() == null) ? 0 : getAudioId().hashCode());
        return result;
    }
}