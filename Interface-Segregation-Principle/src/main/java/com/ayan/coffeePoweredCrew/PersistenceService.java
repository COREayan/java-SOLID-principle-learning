package com.ayan.coffeePoweredCrew;

import java.util.*;

public interface PersistenceService<T> {
    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);

    public List<T> findByName(String name);
}
