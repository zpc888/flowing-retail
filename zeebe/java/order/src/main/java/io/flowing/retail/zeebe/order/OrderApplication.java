package io.flowing.retail.zeebe.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.zeebe.client.ZeebeClient;

@SpringBootApplication
public class OrderApplication {

  @Bean
  public ZeebeClient zeebe() {
    // Cannot yet use Spring Zeebe in current alpha
    ZeebeClient zeebeClient = ZeebeClient
            .newClientBuilder()
            .brokerContactPoint("127.0.0.1:26500")
            .build();
    
    // Trigger deployment
    zeebeClient.newDeployCommand() //
      .addResourceFromClasspath("order-zeebe.bpmn") //
      .send().join();
    
    return zeebeClient;
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(OrderApplication.class, args);
  }

}
