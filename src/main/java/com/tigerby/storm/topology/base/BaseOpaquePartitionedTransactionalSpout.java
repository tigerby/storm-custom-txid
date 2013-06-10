package com.tigerby.storm.topology.base;

import backtype.storm.topology.base.BaseComponent;
import com.tigerby.storm.transactional.partitioned.IOpaquePartitionedTransactionalSpout;


public abstract class BaseOpaquePartitionedTransactionalSpout<T> extends BaseComponent implements IOpaquePartitionedTransactionalSpout<T> {
    
}
