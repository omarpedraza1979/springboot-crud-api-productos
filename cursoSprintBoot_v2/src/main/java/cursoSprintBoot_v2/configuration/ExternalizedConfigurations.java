package cursoSprintBoot_v2.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class ExternalizedConfigurations {
    private String name;
    private String version;
    private String autor;
    private String languaje;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLanguaje() {
        return languaje;
    }

    public void setLanguaje(String languaje) {
        this.languaje = languaje;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ExternalizedConfigurations{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", autor='" + autor + '\'' +
                ", languaje='" + languaje + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
