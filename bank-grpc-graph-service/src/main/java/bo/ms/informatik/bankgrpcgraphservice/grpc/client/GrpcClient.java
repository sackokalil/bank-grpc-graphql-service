package bo.ms.informatik.bankgrpcgraphservice.grpc.client;

import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Timer;
import java.util.TimerTask;

public class GrpcClient {
    public static void main(String[] args) {
        //Communication channel
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
        //BankServiceGrpc.BankServiceBlockingStub blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        BankServiceGrpc.BankServiceStub asyncStub = BankServiceGrpc.newStub(managedChannel);

        StreamObserver<Bank.Transaction> transactionStreamObserver = asyncStub.performStreamOfTransactions(new StreamObserver<Bank.PerformStreamOfTransactionsResponse>() {

            @Override
            public void onNext(Bank.PerformStreamOfTransactionsResponse performStreamOfTransactionsResponse) {
                System.out.println("********************************");
                performStreamOfTransactionsResponse.getTotalCreditTransactionAmount();
                performStreamOfTransactionsResponse.getTotalDebitTransactionAmount();
                performStreamOfTransactionsResponse.getTotalTransactionAmount();
                performStreamOfTransactionsResponse.getTotalTransactionCount();
                System.out.println("********************************");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        //a timer to send stream of transaction
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int counter = 0;
            @Override
            public void run() {
                counter++;
                Bank.Transaction transaction = Bank.Transaction.newBuilder()
                        .setAmount(Math.random() * 9000)
                        .setStatus(Bank.TransactionStatus.PENDING)
                        .setType(Math.random()>0.5?Bank.TransactionType.DEBIT:Bank.TransactionType.CREDIT)
                        .setAccountId("6835da0c3742d40abc0410e6")
                        .build();
                transactionStreamObserver.onNext(transaction);
                if (counter > 4) {
                    transactionStreamObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }
}
