package com.qiu.pojo;

public class audioTable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AudioTable.audio_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    private Integer audioId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AudioTable.audio_data
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    private byte[] audioData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AudioTable.audio_id
     *
     * @return the value of AudioTable.audio_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public Integer getAudioId() {
        return audioId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AudioTable.audio_id
     *
     * @param audioId the value for AudioTable.audio_id
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void setAudioId(Integer audioId) {
        this.audioId = audioId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AudioTable.audio_data
     *
     * @return the value of AudioTable.audio_data
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public byte[] getAudioData() {
        return audioData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AudioTable.audio_data
     *
     * @param audioData the value for AudioTable.audio_data
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    public void setAudioData(byte[] audioData) {
        this.audioData = audioData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AudioTable
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", audioId=").append(audioId);
        sb.append(", audioData=").append(audioData);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AudioTable
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
        audioTable other = (audioTable) that;
        return (this.getAudioId() == null ? other.getAudioId() == null : this.getAudioId().equals(other.getAudioId()))
            && (this.getAudioData() == null ? other.getAudioData() == null : this.getAudioData().equals(other.getAudioData()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AudioTable
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAudioId() == null) ? 0 : getAudioId().hashCode());
        result = prime * result + ((getAudioData() == null) ? 0 : getAudioData().hashCode());
        return result;
    }
}