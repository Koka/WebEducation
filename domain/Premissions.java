

public class Premissions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column premissions.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column premissions.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column premissions.id
     *
     * @return the value of premissions.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column premissions.id
     *
     * @param id the value for premissions.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column premissions.name
     *
     * @return the value of premissions.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column premissions.name
     *
     * @param name the value for premissions.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Premissions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}