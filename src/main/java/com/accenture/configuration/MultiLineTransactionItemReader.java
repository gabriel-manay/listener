package com.accenture.configuration;

import com.accenture.entity.*;
import org.springframework.batch.item.*;
import org.springframework.batch.item.support.SingleItemPeekableItemReader;

public class MultiLineTransactionItemReader implements ItemReader<Transaction>{

    private SingleItemPeekableItemReader<TCR> delegate;
    private TCR nextLine;

    @Override
    public Transaction read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        Transaction transaction = new Transaction();
        this.delegate.open(new ExecutionContext());
        TCR line;
        if(nextLine != null){
            line = nextLine;
            nextLine = null;
        } else {
            line = this.delegate.read();
        }
        boolean finished = line == null;
        while(!finished){
            addCurrentTCR(transaction,line);
            line = this.delegate.read();
            if(line == null || isRecordStart(line)){
                nextLine = line;
                finished = true;
                return transaction;
            }
        }
        return null;
    }

    private boolean isRecordStart(TCR line) {
        return line.getTransactionComponentSequenceNumber().equals("0");
    }

    private void addCurrentTCR(Transaction transaction, TCR tcr){
        if(tcr instanceof TCR00){
            transaction.setTcr00((TCR00) tcr);
        }
        if(tcr instanceof TCR01){
            transaction.setTcr01((TCR01) tcr);
        }

        if(tcr instanceof TCR02){
            transaction.setTcr02((TCR02) tcr);
        }
    }

    public SingleItemPeekableItemReader<TCR> getDelegate() {
        return delegate;
    }

    public void setDelegate(SingleItemPeekableItemReader<TCR> delegate) {
        this.delegate = delegate;
    }
}
