package hacors.kuiff;

import hacors.kuiff.repo.inter.UserRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hakao
 */
@Service
public class Core {
    @Resource
    private UserRepo userRepo;

    public String process() {
        return userRepo.getPerson("1").get().getUsername();
    }
}
