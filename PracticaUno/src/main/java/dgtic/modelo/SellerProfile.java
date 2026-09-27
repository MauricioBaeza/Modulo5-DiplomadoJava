package dgtic.modelo;

import java.util.Date;

public class SellerProfile {
    private User userId;
    private String storeName;
    private Boolean verified;
    private Date createdAt;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "SellerProfile{" +
                "userId=" + userId +
                ", storeName='" + storeName + '\'' +
                ", verified=" + verified +
                ", createdAt=" + createdAt +
                '}';
    }
}
