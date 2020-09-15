package com.solujan.springbatchcsvreader.processor;

import com.solujan.springbatchcsvreader.entities.Transaction;

import org.springframework.batch.item.ItemProcessor;

public class TransactionItemProcessor implements ItemProcessor<Transaction, Transaction> {
    @Override
    public Transaction process(Transaction transaction) throws Exception {
        return transaction;
    }
}
