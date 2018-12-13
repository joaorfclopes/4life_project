package org.academiadecodigo.invictus.dao;

import org.academiadecodigo.invictus.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    public JpaUserDao() {
        super(User.class);
    }

}