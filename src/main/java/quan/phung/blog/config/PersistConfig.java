package quan.phung.blog.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class PersistConfig
{
  @Bean
  public AuditorAware<String> auditorProvider()
  {
    return new AuditorAwareImpl();
  }

  static class AuditorAwareImpl implements AuditorAware<String>
  {

    @Override
    public Optional<String> getCurrentAuditor()
    {
     String currentUser = "Quan Phung";
     return Optional.of(currentUser);
    }

  }

}
