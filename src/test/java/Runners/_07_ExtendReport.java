package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_04_CountryMultipleScenarios.feature",
                "src/test/java/FeatureFiles/_03_Citizenship.feature"
        },
        glue = {"StepDefiniton"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _07_ExtendReport extends AbstractTestNGCucumberTests {

        @AfterClass
        public static void  writeExtendReport(){
                ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
                ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
                ExtentService.getInstance().setSystemInfo("User Name", "Yasemin Yıldırır");
                ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
                ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
                ExtentService.getInstance().setSystemInfo("Department", "QA");
                ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
                ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
                ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
                ExtentService.getInstance().setSystemInfo("Ek Satır", "Açıklama");
        }

}
