package io.flowing.retail.zeebe.payment.flow;

public class PaymentInput {

  private Object order;
  private String traceId;
  private String refId;
  private long amount;
  
  public String getTraceId() {
    return traceId;
  }
  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }
  public String getRefId() {
    return refId;
  }
  public void setRefId(String refId) {
    this.refId = refId;
  }
  public long getAmount() {
    return amount;
  }
  public void setAmount(long amount) {
    this.amount = amount;
  }

  public Object getOrder() {
    return order;
  }

  public void setOrder(Object order) {
    this.order = order;
  }
}
