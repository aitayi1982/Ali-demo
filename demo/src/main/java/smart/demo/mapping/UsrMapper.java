package smart.demo.mapping;

import java.util.List;
import java.util.Map;

import smart.demo.pojo.Usr;

public interface UsrMapper {

	void insert(Usr usr);

	Usr selectById(Integer id);

	List<Usr> queryAll();
	
	int totalUsrs();

	//List<Usr> listUsrsByPage(int currPage,int pageSize);
	List<Usr> listUsrsByPage(Map<String,Object> data);
	
	void deleteUserById(int id);

}