package com.slalom.menu.repositories;

import com.slalom.menu.models.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ItemRepository extends CrudRepository<Item, Long> {
}
