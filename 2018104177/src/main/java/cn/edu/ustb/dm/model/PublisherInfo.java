package cn.edu.ustb.dm.model;

public class PublisherInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column publisher_info.PUBLISHER_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer PUBLISHER_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column publisher_info.PUBLISHER_NAME
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private String PUBLISHER_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column publisher_info.PUBLISHER_ID
     *
     * @return the value of publisher_info.PUBLISHER_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getPUBLISHER_ID() {
        return PUBLISHER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column publisher_info.PUBLISHER_ID
     *
     * @param PUBLISHER_ID the value for publisher_info.PUBLISHER_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setPUBLISHER_ID(Integer PUBLISHER_ID) {
        this.PUBLISHER_ID = PUBLISHER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column publisher_info.PUBLISHER_NAME
     *
     * @return the value of publisher_info.PUBLISHER_NAME
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public String getPUBLISHER_NAME() {
        return PUBLISHER_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column publisher_info.PUBLISHER_NAME
     *
     * @param PUBLISHER_NAME the value for publisher_info.PUBLISHER_NAME
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setPUBLISHER_NAME(String PUBLISHER_NAME) {
        this.PUBLISHER_NAME = PUBLISHER_NAME == null ? null : PUBLISHER_NAME.trim();
    }
}