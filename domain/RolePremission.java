

public class RolePremission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_premission.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_premission.group_id
     *
     * @mbggenerated
     */
    private Integer groupId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_premission.user_id
     *
     * @return the value of role_premission.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_premission.user_id
     *
     * @param userId the value for role_premission.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_premission.group_id
     *
     * @return the value of role_premission.group_id
     *
     * @mbggenerated
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_premission.group_id
     *
     * @param groupId the value for role_premission.group_id
     *
     * @mbggenerated
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "RolePremission{" +
                "userId=" + userId +
                ", groupId=" + groupId +
                '}';
    }
}