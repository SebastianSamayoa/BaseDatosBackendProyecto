package com.backend.repositorios;

import com.backend.entidades.Ctrgestiones;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 *
 * @author jhoan
 */
public interface repoctrgestion extends PagingAndSortingRepository<Ctrgestiones, Integer>, QueryByExampleExecutor<Ctrgestiones> {
    
}
