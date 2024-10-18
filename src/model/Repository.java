package model;

import java.util.List;

public interface Repository <T, V>{

    public void create(T model);

    public T find(V id);

    public void update(T model);

    public void delete(T model);

    public List<T> getAll(V id);
}
