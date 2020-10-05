package org.automation.api.models.users;

import com.google.gson.annotations.SerializedName;

/**
 * Models advertising json object.
 */
public class Advertising {

    @SerializedName("company")
    private String company;
    @SerializedName("url")
    private String url;
    @SerializedName("text")
    private String text;

    /**
     * Gets company value.
     *
     * @return company value.
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets company value.
     *
     * @param company company value to be set.
     */
    public void setCompany(final String company) {
        this.company = company;
    }

    /**
     * Gets url value.
     *
     * @return url value.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url value.
     *
     * @param url url value to be set.
     */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
     * Gets text value.
     *
     * @return text value.
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text value.
     *
     * @param text text value to be set.
     */
    public void setText(final String text) {
        this.text = text;
    }
}
