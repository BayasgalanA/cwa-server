

package app.coronawarn.server.common.federation.client;

import javax.net.ssl.HostnameVerifier;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("disable-ssl-client-federation-verify-hostname")
public class NoopHostnameVerifierProvider implements HostnameVerifierProvider {

  @Override
  public HostnameVerifier createHostnameVerifier() {
    return new NoopHostnameVerifier();
  }
}
