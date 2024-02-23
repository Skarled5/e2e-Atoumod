package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={},
        features ="",
        glue = "",
        tags = "", //  Bu parametre, hangi senaryoların veya senaryo adımlarının çalıştırılacağını belirtmek için etiketlerin (tags) kullanılmasını sağlar. Örneğin, tags = "@smokeTest"
        dryRun = false

)
//@RunWith(Cucumber.class): Bu ifade, JUnit veya TestNG gibi test çerçevelerini kullanan Java test sınıflarında bulunur. Cucumber ile tüm senaryoları çalıştırmak için kullanılır. Cucumber.class, Cucumber'ın test senaryolarını çalıştırmak için bir test sınıfı olarak kullanılmasını belirtir.
//
//@CucumberOptions: Bu ifade, Cucumber testlerini yapılandırmak için kullanılır. @CucumberOptions içine çeşitli parametreler eklenerek testlerin nasıl çalıştırılacağı, hangi senaryoların dahil edileceği, raporların nereye kaydedileceği vb. gibi ayarlar yapılabiliyor. Örnek kullanımı şu şekildedir:

public class TestRunner {
}
