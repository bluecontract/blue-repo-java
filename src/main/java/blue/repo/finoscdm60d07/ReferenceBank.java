package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B59a9EXNi6rEMdxhP56HoAE9nh3a5H57cPxjMDiXDE6d")
public class ReferenceBank {
    public static String blueId() {
        return "B59a9EXNi6rEMdxhP56HoAE9nh3a5H57cPxjMDiXDE6d";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceBank";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceBank";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceBank.json";
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

    private FieldWithMetaString referenceBankId;

    private String referenceBankName;

    public String getNamespace() {
        return namespace;
    }

    public ReferenceBank namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getReferenceBankId() {
        return referenceBankId;
    }

    public ReferenceBank referenceBankId(FieldWithMetaString referenceBankId) {
        this.referenceBankId = referenceBankId;
        return this;
    }

    public String getReferenceBankName() {
        return referenceBankName;
    }

    public ReferenceBank referenceBankName(String referenceBankName) {
        this.referenceBankName = referenceBankName;
        return this;
    }

}
