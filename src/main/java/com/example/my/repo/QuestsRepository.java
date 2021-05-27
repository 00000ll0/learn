package com.example.my.repo;

import com.example.my.models.Quests;
import org.springframework.data.repository.CrudRepository;

public interface QuestsRepository extends CrudRepository <Quests,Long> {
}
