package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ao9tm3BNPBdjPWu1djmdXcVU9u7MakAdbDXzqF5qvm72")
public class CdmBaseDatetimeCustomisableOffset {
    public static String blueId() {
        return "Ao9tm3BNPBdjPWu1djmdXcVU9u7MakAdbDXzqF5qvm72";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/CustomisableOffset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/CustomisableOffset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeCustomisableOffset.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String customProvision;

    private CdmBaseDatetimeOffset offset;

    public String getCustomProvision() {
        return customProvision;
    }

    public CdmBaseDatetimeCustomisableOffset customProvision(String customProvision) {
        this.customProvision = customProvision;
        return this;
    }

    public CdmBaseDatetimeOffset getOffset() {
        return offset;
    }

    public CdmBaseDatetimeCustomisableOffset offset(CdmBaseDatetimeOffset offset) {
        this.offset = offset;
        return this;
    }

}
