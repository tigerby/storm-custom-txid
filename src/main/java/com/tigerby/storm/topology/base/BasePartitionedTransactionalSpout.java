package com.tigerby.storm.topology.base;

import backtype.storm.topology.base.BaseComponent;
import com.tigerby.storm.transactional.partitioned.IPartitionedTransactionalSpout;

public abstract class BasePartitionedTransactionalSpout<T> extends BaseComponent implements IPartitionedTransactionalSpout<T> {

}
