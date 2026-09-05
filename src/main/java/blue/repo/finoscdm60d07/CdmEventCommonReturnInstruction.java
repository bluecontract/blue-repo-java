package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EHQeuyqU8JKmjJLiAD4pgv1qDU3CNSj1jCiarzae6Pcg")
public class CdmEventCommonReturnInstruction {
    public static String blueId() {
        return "EHQeuyqU8JKmjJLiAD4pgv1qDU3CNSj1jCiarzae6Pcg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ReturnInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ReturnInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonReturnInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseMathQuantity> quantity;

    public List<CdmBaseMathQuantity> getQuantity() {
        return quantity;
    }

    public CdmEventCommonReturnInstruction quantity(List<CdmBaseMathQuantity> quantity) {
        this.quantity = quantity;
        return this;
    }

}
