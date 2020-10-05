package org.automation.api.models.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Models user json object.
 */
public class User {

    @SerializedName("id")
    private Integer id;
    @SerializedName("email")
    private String email;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("avatar")
    private String avatar;

    /**
     * Gets id value.
     *
     * @return id value.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id value.
     *
     * @param id id value to be set.
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * Gets email value.
     *
     * @return email value.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email value.
     *
     * @param email email value to be set.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Gets first name value.
     *
     * @return first name value.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name value.
     *
     * @param firstName first name value to be set.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name value.
     *
     * @return last name value.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name value.
     *
     * @param lastName last name value to be set.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets avatar value.
     *
     * @return avatar value.
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Sets avatar value.
     *
     * @param avatar avatar value to be set.
     */
    public void setAvatar(final String avatar) {
        this.avatar = avatar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(email, user.email)
                && Objects.equals(firstName, user.firstName)
                && Objects.equals(lastName, user.lastName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }
}
