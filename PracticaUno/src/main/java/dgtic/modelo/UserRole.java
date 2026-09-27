package dgtic.modelo;

import java.util.Date;

public class UserRole {
    private Role roleId;
    private User userId;
    private Date assignetAt;

    public Date getAssignetAt() {
        return assignetAt;
    }

    public void setAssignetAt(Date assignetAt) {
        this.assignetAt = assignetAt;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "roleId=" + roleId +
                ", userId=" + userId +
                ", assignetAt=" + assignetAt +
                '}';
    }
}
