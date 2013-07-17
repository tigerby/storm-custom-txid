package com.tigerby.storm.transactional;

import com.tigerby.storm.transactional.state.TransactionalState;

import java.io.Serializable;
import java.math.BigInteger;

public class TransactionAttempt implements Transaction<BigInteger>, Serializable {
    public static BigInteger INIT_TXID = BigInteger.ONE;
    BigInteger _txid;
    long _attemptId;
    
    
    // for kryo compatibility
    public TransactionAttempt() {
        
    }
    
    public TransactionAttempt(BigInteger txid, long attemptId) {
        _txid = txid;
        _attemptId = attemptId;
    }
    
    public BigInteger getTransactionId() {
        return _txid;
    }
    
    public long getAttemptId() {
        return _attemptId;
    }

    @Override
    public int hashCode() {
        return _txid.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof TransactionAttempt)) return false;
        TransactionAttempt other = (TransactionAttempt) o;
        return _txid.equals(other._txid) && _attemptId == other._attemptId;
    }

    @Override
    public String toString() {
        return "" + _txid + ":" + _attemptId;
    }

    @Override
    public BigInteger getInitTxId() {
        return INIT_TXID;
    }

    @Override
    public BigInteger nextTransactionId(BigInteger id) {
        return id.add(BigInteger.ONE);
    }

    @Override
    public BigInteger previousTransactionId(BigInteger id) {
        if(id.equals(INIT_TXID)) {
            return null;
        } else {
            return id.subtract(BigInteger.ONE);
        }
    }

    @Override
    public Transaction<BigInteger> newTransaction() {
        return new TransactionAttempt();
    }

}
