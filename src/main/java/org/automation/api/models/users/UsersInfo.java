package org.automation.api.models.users;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Models All Users list json object.
 */
public class UsersInfo {

    @SerializedName("page")
    private Integer page;
    @SerializedName("per_page")
    private Integer perPage;
    @SerializedName("total")
    private Integer total;
    @SerializedName("total_pages")
    private Integer totalPages;
    @SerializedName("ad")
    private Advertising advertising;
    @SerializedName("data")
    private List<User> users;

    /**
     * Gets page value.
     *
     * @return page value.
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page value.
     *
     * @param page page value to be set..
     */
    public void setPage(final Integer page) {
        this.page = page;
    }

    /**
     * Gets per page value.
     *
     * @return per page value.
     */
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Sets per page value.
     *
     * @param perPage per page value to be set.
     */
    public void setPerPage(final Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Gets total value.
     *
     * @return total value.
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets total value.
     *
     * @param total total value to be set.
     */
    public void setTotal(final Integer total) {
        this.total = total;
    }

    /**
     * Gets total pages value.
     *
     * @return total pages value.
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets total pages value.
     *
     * @param totalPages total pages value to be set.
     */
    public void setTotalPages(final Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Gets advertising model.
     *
     * @return advertising model.
     */
    public Advertising getAdvertising() {
        return advertising;
    }

    /**
     * Sets advertising model.
     *
     * @param advertising advertising model to be set.
     */
    public void setAdvertising(final Advertising advertising) {
        this.advertising = advertising;
    }

    /**
     * Gets users list.
     *
     * @return users list.
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Sets users list.
     *
     * @param users users list to be set.
     */
    public void setUsers(final List<User> users) {
        this.users = users;
    }
}
