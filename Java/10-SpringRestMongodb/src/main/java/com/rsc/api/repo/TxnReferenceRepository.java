package com.rsc.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.TxnReference;


@Repository
public interface TxnReferenceRepository extends MongoRepository<TxnReference, String>  {

}
	