package org.andalit.userService.repository;

import org.andalit.userService.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<Users,Long> {
    List<Users> findByUserNameLike(String username);
}
