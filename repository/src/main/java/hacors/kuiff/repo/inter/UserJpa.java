package hacors.kuiff.repo.inter;


import hacors.kuiff.repo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hakao
 */
@Repository
public interface UserJpa extends JpaRepository<Users, String> {
}
