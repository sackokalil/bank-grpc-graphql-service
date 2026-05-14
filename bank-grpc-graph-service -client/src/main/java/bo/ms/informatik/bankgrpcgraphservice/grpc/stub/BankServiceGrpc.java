package bo.ms.informatik.bankgrpcgraphservice.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAccount",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount> getCreateAccountMethod;
    if ((getCreateAccountMethod = BankServiceGrpc.getCreateAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCreateAccountMethod = BankServiceGrpc.getCreateAccountMethod) == null) {
          BankServiceGrpc.getCreateAccountMethod = getCreateAccountMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "createAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("createAccount"))
                  .build();
          }
        }
     }
     return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccount",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
          BankServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccounts",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountsMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountsMethod;
    if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
          BankServiceGrpc.getGetListAccountsMethod = getGetListAccountsMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccounts"))
                  .build();
          }
        }
     }
     return getGetListAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse> getAddCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCurrency",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse> getAddCurrencyMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse> getAddCurrencyMethod;
    if ((getAddCurrencyMethod = BankServiceGrpc.getAddCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getAddCurrencyMethod = BankServiceGrpc.getAddCurrencyMethod) == null) {
          BankServiceGrpc.getAddCurrencyMethod = getAddCurrencyMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "addCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("addCurrency"))
                  .build();
          }
        }
     }
     return getAddCurrencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse> getGetCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrency",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse> getGetCurrencyMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse> getGetCurrencyMethod;
    if ((getGetCurrencyMethod = BankServiceGrpc.getGetCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetCurrencyMethod = BankServiceGrpc.getGetCurrencyMethod) == null) {
          BankServiceGrpc.getGetCurrencyMethod = getGetCurrencyMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getCurrency"))
                  .build();
          }
        }
     }
     return getGetCurrencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse> getGetListCurrenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListCurrencies",
      requestType = com.google.protobuf.Empty.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse> getGetListCurrenciesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse> getGetListCurrenciesMethod;
    if ((getGetListCurrenciesMethod = BankServiceGrpc.getGetListCurrenciesMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListCurrenciesMethod = BankServiceGrpc.getGetListCurrenciesMethod) == null) {
          BankServiceGrpc.getGetListCurrenciesMethod = getGetListCurrenciesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListCurrencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListCurrencies"))
                  .build();
          }
        }
     }
     return getGetListCurrenciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertCurrency",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;
    if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
          BankServiceGrpc.getConvertCurrencyMethod = getConvertCurrencyMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertCurrency"))
                  .build();
          }
        }
     }
     return getConvertCurrencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfTransactions",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionsMethod;
    if ((getGetStreamOfTransactionsMethod = BankServiceGrpc.getGetStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamOfTransactionsMethod = BankServiceGrpc.getGetStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getGetStreamOfTransactionsMethod = getGetStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getGetStreamOfTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getPerformStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStreamOfTransactions",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getPerformStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getPerformStreamOfTransactionsMethod;
    if ((getPerformStreamOfTransactionsMethod = BankServiceGrpc.getPerformStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformStreamOfTransactionsMethod = BankServiceGrpc.getPerformStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getPerformStreamOfTransactionsMethod = getPerformStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "performStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("performStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getPerformStreamOfTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeStreamOfTransactions",
      requestType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.class,
      responseType = bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction,
      bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionsMethod;
    if ((getExecuteStreamOfTransactionsMethod = BankServiceGrpc.getExecuteStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionsMethod = BankServiceGrpc.getExecuteStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getExecuteStreamOfTransactionsMethod = getExecuteStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction, bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "executeStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("executeStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *========Unary model Services======================
     * </pre>
     */
    public void createAccount(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccounts(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountsMethod(), responseObserver);
    }

    /**
     */
    public void addCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCurrencyMethod(), responseObserver);
    }

    /**
     */
    public void getCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrencyMethod(), responseObserver);
    }

    /**
     */
    public void getListCurrencies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListCurrenciesMethod(), responseObserver);
    }

    /**
     */
    public void convertCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertCurrencyMethod(), responseObserver);
    }

    /**
     * <pre>
     *============Server streaming model  Service================
     * </pre>
     */
    public void getStreamOfTransactions(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *============= Client Streaming model Service=========
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> performStreamOfTransactions(
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamOfTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *==========Bidirectional(client-server) streaming model Service=======
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> executeStreamOfTransactions(
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount>(
                  this, METHODID_CREATE_ACCOUNT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetListAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse>(
                  this, METHODID_GET_LIST_ACCOUNTS)))
          .addMethod(
            getAddCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse>(
                  this, METHODID_ADD_CURRENCY)))
          .addMethod(
            getGetCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse>(
                  this, METHODID_GET_CURRENCY)))
          .addMethod(
            getGetListCurrenciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse>(
                  this, METHODID_GET_LIST_CURRENCIES)))
          .addMethod(
            getConvertCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_CURRENCY)))
          .addMethod(
            getGetStreamOfTransactionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction>(
                  this, METHODID_GET_STREAM_OF_TRANSACTIONS)))
          .addMethod(
            getPerformStreamOfTransactionsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse>(
                  this, METHODID_PERFORM_STREAM_OF_TRANSACTIONS)))
          .addMethod(
            getExecuteStreamOfTransactionsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction,
                bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTIONS)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *========Unary model Services======================
     * </pre>
     */
    public void createAccount(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccounts(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCurrencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListCurrencies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListCurrenciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convertCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *============Server streaming model  Service================
     * </pre>
     */
    public void getStreamOfTransactions(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest request,
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *============= Client Streaming model Service=========
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> performStreamOfTransactions(
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamOfTransactionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *==========Bidirectional(client-server) streaming model Service=======
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> executeStreamOfTransactions(
        io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *========Unary model Services======================
     * </pre>
     */
    public bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount createAccount(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse getAccount(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse getListAccounts(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse addCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddCurrencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse getCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrencyMethod(), getCallOptions(), request);
    }

    /**
     */
    public bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse getListCurrencies(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetListCurrenciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse convertCurrency(bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertCurrencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *============Server streaming model  Service================
     * </pre>
     */
    public java.util.Iterator<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction> getStreamOfTransactions(
        bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfTransactionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *========Unary model Services======================
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount> createAccount(
        bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse> getAccount(
        bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse> getListAccounts(
        bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse> addCurrency(
        bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCurrencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse> getCurrency(
        bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrencyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse> getListCurrencies(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListCurrenciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse> convertCurrency(
        bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_GET_LIST_ACCOUNTS = 2;
  private static final int METHODID_ADD_CURRENCY = 3;
  private static final int METHODID_GET_CURRENCY = 4;
  private static final int METHODID_GET_LIST_CURRENCIES = 5;
  private static final int METHODID_CONVERT_CURRENCY = 6;
  private static final int METHODID_GET_STREAM_OF_TRANSACTIONS = 7;
  private static final int METHODID_PERFORM_STREAM_OF_TRANSACTIONS = 8;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTIONS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.CreateAccountRequest) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.BankAccount>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNTS:
          serviceImpl.getListAccounts((bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountRequest) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListAccountResponse>) responseObserver);
          break;
        case METHODID_ADD_CURRENCY:
          serviceImpl.addCurrency((bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.AddCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENCY:
          serviceImpl.getCurrency((bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_CURRENCIES:
          serviceImpl.getListCurrencies((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetListCurrencyResponse>) responseObserver);
          break;
        case METHODID_CONVERT_CURRENCY:
          serviceImpl.convertCurrency((bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_TRANSACTIONS:
          serviceImpl.getStreamOfTransactions((bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.GetStreamOfTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_STREAM_OF_TRANSACTIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStreamOfTransactions(
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransactions(
              (io.grpc.stub.StreamObserver<bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.Transaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getCreateAccountMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetListAccountsMethod())
              .addMethod(getAddCurrencyMethod())
              .addMethod(getGetCurrencyMethod())
              .addMethod(getGetListCurrenciesMethod())
              .addMethod(getConvertCurrencyMethod())
              .addMethod(getGetStreamOfTransactionsMethod())
              .addMethod(getPerformStreamOfTransactionsMethod())
              .addMethod(getExecuteStreamOfTransactionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
