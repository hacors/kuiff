package hacors.kuiff.repo.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author hakao
 */
@Entity
public class Users {
    @Id
    private String username;
    private String password;
    private long enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public long getEnabled() {
        return enabled;
    }

    public void setEnabled(long enabled) {
        this.enabled = enabled;
    }

}
