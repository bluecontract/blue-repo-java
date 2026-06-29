package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("75qSo7DxMh9MksCdoEnKxduHVLunj1pn42TvPFdxTgN8")
public class CdmBaseDatetimeDateList {
    public static String blueId() {
        return "75qSo7DxMh9MksCdoEnKxduHVLunj1pn42TvPFdxTgN8";
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
