package com.tigerby.storm.topology.base;

import backtype.storm.topology.base.BaseComponent;
import com.tigerby.storm.transactional.ITransactionalSpout;

public abstract class BaseTransactionalSpout<T> extends BaseComponent implements ITransactionalSpout<T> {

}
