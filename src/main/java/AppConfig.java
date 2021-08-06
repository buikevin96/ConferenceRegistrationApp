import com.kevinbui.repository.HibernateSpeakerRepositoryImpl;
import com.kevinbui.repository.SpeakerRepository;
import com.kevinbui.service.SpeakerService;
import com.kevinbui.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository((getSpeakerRepository()));
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
