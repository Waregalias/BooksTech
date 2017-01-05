package storage;

import java.util.List;

import javax.ejb.Local;

@Local
public interface Dao<T> {
	public void insert (T obj);
	public T select(int id);
	public List<T> selectAll();
	public void edit(T obj);
	public void delete(T obj);
}
