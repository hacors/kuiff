package hacors.kuiff.repo.inter;

import hacors.kuiff.repo.model.Users;

import java.util.Optional;

/**
 * @author hakao
 */
public interface UserRepo {
    Optional<Users> getPerson(String id);
}
