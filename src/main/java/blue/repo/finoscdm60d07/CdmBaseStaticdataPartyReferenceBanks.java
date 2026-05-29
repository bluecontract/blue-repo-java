package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2NcfvAKBjmr59p4hGfzqHPSBDq3VSGW78Wh1wxp3omCc")
public class CdmBaseStaticdataPartyReferenceBanks {
    public static String blueId() {
        return "2NcfvAKBjmr59p4hGfzqHPSBDq3VSGW78Wh1wxp3omCc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/ReferenceBanks";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/ReferenceBanks";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyReferenceBanks.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyReferenceBank> referenceBank;

    public List<CdmBaseStaticdataPartyReferenceBank> getReferenceBank() {
        return referenceBank;
    }

    public CdmBaseStaticdataPartyReferenceBanks referenceBank(List<CdmBaseStaticdataPartyReferenceBank> referenceBank) {
        this.referenceBank = referenceBank;
        return this;
    }

}
