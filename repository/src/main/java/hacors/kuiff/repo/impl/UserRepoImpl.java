package hacors.kuiff.repo.impl;

import hacors.kuiff.repo.inter.UserJpa;
import hacors.kuiff.repo.inter.UserRepo;
import hacors.kuiff.repo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author hakao
 */
@Repository
public class UserRepoImpl implements UserRepo {
    @Autowired
    private UserJpa jpa;

    @Override
    public Optional<Users> getPerson(String id) {
        Users item = new Users();
        item.setUsername("nacos");
        item.setEnabled(1);
        List<Users> temp=jpa.findAll();
        Example<Users> example = Example.of(item);
        Optional<Users> res = jpa.findOne(example);
        return res;
    }
}
