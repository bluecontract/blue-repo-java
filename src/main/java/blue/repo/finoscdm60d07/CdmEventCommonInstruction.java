package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GEHuJ1Fk1jSrDMfbynCACW1dsPVuMhSkjFbkitJU37Qp")
public class CdmEventCommonInstruction {
    public static String blueId() {
        return "GEHuJ1Fk1jSrDMfbynCACW1dsPVuMhSkjFbkitJU37Qp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/Instruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/Instruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonMetafieldsReferenceWithMetaTradeState before;

    private CdmEventCommonPrimitiveInstruction primitiveInstruction;

    public CdmEventCommonMetafieldsReferenceWithMetaTradeState getBefore() {
        return before;
    }

    public CdmEventCommonInstruction before(CdmEventCommonMetafieldsReferenceWithMetaTradeState before) {
        this.before = before;
        return this;
    }

    public CdmEventCommonPrimitiveInstruction getPrimitiveInstruction() {
        return primitiveInstruction;
    }

    public CdmEventCommonInstruction primitiveInstruction(CdmEventCommonPrimitiveInstruction primitiveInstruction) {
        this.primitiveInstruction = primitiveInstruction;
        return this;
    }

}
