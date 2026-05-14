package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Eswj6CdGqkuScnc6DBZYTs1ZdfjwbdCXe2b71T7JXMLm")
public class PeriodExtendedEnum {
    public static String blueId() {
        return "Eswj6CdGqkuScnc6DBZYTs1ZdfjwbdCXe2b71T7JXMLm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PeriodExtendedEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PeriodExtendedEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PeriodExtendedEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public PeriodExtendedEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
