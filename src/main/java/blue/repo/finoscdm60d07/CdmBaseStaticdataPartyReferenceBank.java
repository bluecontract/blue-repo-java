package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ECha7Z1Y7L1G56VqE9aNhmUNPp6V1VB7RAzRtVZYN6Ye")
public class CdmBaseStaticdataPartyReferenceBank {
    public static String blueId() {
        return "ECha7Z1Y7L1G56VqE9aNhmUNPp6V1VB7RAzRtVZYN6Ye";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/ReferenceBank";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/ReferenceBank";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyReferenceBank.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString referenceBankId;

    private String referenceBankName;

    public ComRosettaModelFieldWithMetaString getReferenceBankId() {
        return referenceBankId;
    }

    public CdmBaseStaticdataPartyReferenceBank referenceBankId(ComRosettaModelFieldWithMetaString referenceBankId) {
        this.referenceBankId = referenceBankId;
        return this;
    }

    public String getReferenceBankName() {
        return referenceBankName;
    }

    public CdmBaseStaticdataPartyReferenceBank referenceBankName(String referenceBankName) {
        this.referenceBankName = referenceBankName;
        return this;
    }

}
