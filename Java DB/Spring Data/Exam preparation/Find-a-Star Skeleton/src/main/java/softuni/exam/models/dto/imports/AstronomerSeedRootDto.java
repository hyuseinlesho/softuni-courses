package softuni.exam.models.dto.imports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "astronomers")
@XmlAccessorType(XmlAccessType.FIELD)
public class AstronomerSeedRootDto {
    @XmlElement(name = "astronomer")
    private List<AstronomerSeedDto> astronomers;

    public List<AstronomerSeedDto> getAstronomers() {
        return astronomers;
    }

    public void setAstronomers(List<AstronomerSeedDto> astronomers) {
        this.astronomers = astronomers;
    }
}
