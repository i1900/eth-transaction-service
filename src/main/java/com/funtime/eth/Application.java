package com.funtime.eth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthCoinbase;
import org.web3j.protocol.core.methods.response.EthGetTransactionCount;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.math.BigInteger;

@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
//    private final Web3j web3j;
//
//    public TransactionServiceApplication(Web3j web3j) {
//        this.web3j = web3j;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//   not support infura
//    @PostConstruct
//    public void listen() {
//        web3j.transactionObservable().subscribe(tx -> {
//            logger.info("New tx: id={}, block={}, from={}, to={}, value={}", tx.getHash(), tx.getBlockHash(), tx.getFrom(), tx.getTo(), tx.getValue().intValue());
//            try {
//                EthCoinbase coinbase = web3j.ethCoinbase().send();
//                EthGetTransactionCount transactionCount = web3j.ethGetTransactionCount(tx.getFrom(), DefaultBlockParameterName.LATEST).send();
//                logger.info("Tx count: {}", transactionCount.getTransactionCount().intValue());
//                if (transactionCount.getTransactionCount().intValue() % 10 == 0) {
//
//                    EthGetTransactionCount tc = web3j.ethGetTransactionCount(coinbase.getAddress(), DefaultBlockParameterName.LATEST).send();
//                    Transaction transaction = Transaction.createEtherTransaction(coinbase.getAddress(), tc.getTransactionCount(), tx.getValue(), BigInteger.valueOf(21_000), tx.getFrom(), tx.getValue());
//                    web3j.ethSendTransaction(transaction).send();
//                }
//
//            } catch (IOException e) {
//                logger.error("Error getting transactions", e);
//            }
//        });
//        logger.info("Subscribed");
//    }
}