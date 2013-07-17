package com.tigerby.storm.transactional;

import com.tigerby.storm.transactional.state.TransactionalState;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 *
 * @author <a href="mailto:bongyeonkim@gmail.com">Bryan Kim</a>
 * @version 1.0
 */
public interface Transaction<T> {

    T getInitTxId();

    T nextTransactionId(T id);

    T previousTransactionId(T id);

    Transaction<T> newTransaction();

}
