

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePremissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_premission
     *
     * @mbggenerated
     */
    int countByExample(RolePremissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_premission
     *
     * @mbggenerated
     */
    int deleteByExample(RolePremissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_premission
     *
     * @mbggenerated
     */
    int insert(RolePremission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_premission
     *
     * @mbggenerated
     */
    int insertSelective(RolePremission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_premission
     *
     * @mbggenerated
     */
    List<RolePremission> selectByExample(RolePremissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_premission
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RolePremission record, @Param("example") RolePremissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_premission
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RolePremission record, @Param("example") RolePremissionExample example);
}