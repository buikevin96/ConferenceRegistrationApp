import com.kevinbui.service.SpeakerService;
import com.kevinbui.service.SpeakerServiceImpl;

public class Application {

    public static void main(String args[]) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
