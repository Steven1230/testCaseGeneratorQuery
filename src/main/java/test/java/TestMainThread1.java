import com.cams.blaze.request.Application;
import com.cams.blaze.service.TestDataQueryService;
import com.fico.testCaseGenerator.XSTream.XSTreamHelper;
import com.fico.testCaseGenerator.repository.ApplicationDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainThread1 {

    public static void main(String[] args){
        TestDataQueryService testDataQueryService = new TestDataQueryService();

        Application application = testDataQueryService.findApplicationByID(67424);

        String applicationXMLStr = testDataQueryService.findApplicationXMLStringByID(67424);

        System.out.println(applicationXMLStr);
    }
}
