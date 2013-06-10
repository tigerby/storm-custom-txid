package com.tigerby.storm.topology.base;

import backtype.storm.topology.base.BaseBatchBolt;
import com.tigerby.storm.transactional.TransactionAttempt;

public abstract class BaseTransactionalBolt extends BaseBatchBolt<TransactionAttempt> {
    
}
