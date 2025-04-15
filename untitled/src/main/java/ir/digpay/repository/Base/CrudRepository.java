package ir.digpay.repository.Base;

import ir.digpay.entity.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T extends BaseEntity, ID>{

    T create(T t);

    T update(T t);

    List<T> findAll();

    Optional<T> findById(ID id);

    int deleteById(ID id);

    int deleteAll();

    boolean existsById(ID id);

    long countAll();
}
