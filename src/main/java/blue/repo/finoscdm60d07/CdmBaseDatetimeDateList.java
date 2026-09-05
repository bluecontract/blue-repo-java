package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("31nxJ7wFGoWjPQ8Rni2sBcqTG4NRBHKa7kiFdXURomWF")
public class CdmBaseDatetimeDateList {
    public static String blueId() {
        return "31nxJ7wFGoWjPQ8Rni2sBcqTG4NRBHKa7kiFdXURomWF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/DateList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/DateList";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeDateList.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> date;

    public List<String> getDate() {
        return date;
    }

    public CdmBaseDatetimeDateList date(List<String> date) {
        this.date = date;
        return this;
    }

}
