package app.coronawarn.server.common.federation.client;

import static org.assertj.core.api.Assertions.assertThat;

import app.coronawarn.server.common.federation.client.config.FederationGatewayConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(properties = "spring.main.lazy-initialization=true", webEnvironment = WebEnvironment.RANDOM_PORT)
class DevelopmentFeignFederationHttpClientProviderSmokeTest {

  @Autowired
  private FederationGatewayConfig config;

  @Test
  void test() {
    DevelopmentFeignFederationHttpClientProvider cut = new DevelopmentFeignFederationHttpClientProvider(config);
    assertThat(cut.createFeignClient()).isNotNull();
  }

}