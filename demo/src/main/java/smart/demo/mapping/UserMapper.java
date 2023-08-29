package smart.demo.mapping;

import smart.demo.pojo.User;

public interface UserMapper {

	void insert(User user);

	User selectById(Integer id);

}