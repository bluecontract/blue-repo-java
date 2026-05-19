package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CKky4Tw8pjtpEW9vovD2ixC87ENtwQbgykNi1fkbvry5")
public class Instruction {
    public static String blueId() {
        return "CKky4Tw8pjtpEW9vovD2ixC87ENtwQbgykNi1fkbvry5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Instruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Instruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Instruction.json";
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

    private ReferenceWithMetaTradeState before;

    private PrimitiveInstruction primitiveInstruction;

    public String getNamespace() {
        return namespace;
    }

    public Instruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaTradeState getBefore() {
        return before;
    }

    public Instruction before(ReferenceWithMetaTradeState before) {
        this.before = before;
        return this;
    }

    public PrimitiveInstruction getPrimitiveInstruction() {
        return primitiveInstruction;
    }

    public Instruction primitiveInstruction(PrimitiveInstruction primitiveInstruction) {
        this.primitiveInstruction = primitiveInstruction;
        return this;
    }

}
