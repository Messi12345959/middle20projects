package cn.edu.ustb.dm.model;

public class AuthorInfoWithBLOBs extends AuthorInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author_info.AUTHOR_NAME
     *
     * @mbggenerated Sun May 12 15:15:24 CST 2013
     */
    private String AUTHOR_NAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column author_info.INTRODUCTION
     *
     * @mbggenerated Sun May 12 15:15:24 CST 2013
     */
    private String INTRODUCTION;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author_info.AUTHOR_NAME
     *
     * @return the value of author_info.AUTHOR_NAME
     *
     * @mbggenerated Sun May 12 15:15:24 CST 2013
     */
    public String getAUTHOR_NAME() {
        return AUTHOR_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author_info.AUTHOR_NAME
     *
     * @param AUTHOR_NAME the value for author_info.AUTHOR_NAME
     *
     * @mbggenerated Sun May 12 15:15:24 CST 2013
     */
    public void setAUTHOR_NAME(String AUTHOR_NAME) {
        this.AUTHOR_NAME = AUTHOR_NAME == null ? null : AUTHOR_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column author_info.INTRODUCTION
     *
     * @return the value of author_info.INTRODUCTION
     *
     * @mbggenerated Sun May 12 15:15:24 CST 2013
     */
    public String getINTRODUCTION() {
        return INTRODUCTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column author_info.INTRODUCTION
     *
     * @param INTRODUCTION the value for author_info.INTRODUCTION
     *
     * @mbggenerated Sun May 12 15:15:24 CST 2013
     */
    public void setINTRODUCTION(String INTRODUCTION) {
        this.INTRODUCTION = INTRODUCTION == null ? null : INTRODUCTION.trim();
    }
}