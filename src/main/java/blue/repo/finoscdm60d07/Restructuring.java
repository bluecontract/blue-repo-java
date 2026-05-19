package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9853BQrXXXTBMv2Ugk5VZGu6TkhRxTBWnkgCk3GP1XY6")
public class Restructuring {
    public static String blueId() {
        return "9853BQrXXXTBMv2Ugk5VZGu6TkhRxTBWnkgCk3GP1XY6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Restructuring";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Restructuring";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Restructuring.json";
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

    private Boolean applicable;

    private Boolean multipleCreditEventNotices;

    private Boolean multipleHolderObligation;

    private FieldWithMetaRestructuringEnum restructuringType;

    public String getNamespace() {
        return namespace;
    }

    public Restructuring namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public Restructuring applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Boolean getMultipleCreditEventNotices() {
        return multipleCreditEventNotices;
    }

    public Restructuring multipleCreditEventNotices(Boolean multipleCreditEventNotices) {
        this.multipleCreditEventNotices = multipleCreditEventNotices;
        return this;
    }

    public Boolean getMultipleHolderObligation() {
        return multipleHolderObligation;
    }

    public Restructuring multipleHolderObligation(Boolean multipleHolderObligation) {
        this.multipleHolderObligation = multipleHolderObligation;
        return this;
    }

    public FieldWithMetaRestructuringEnum getRestructuringType() {
        return restructuringType;
    }

    public Restructuring restructuringType(FieldWithMetaRestructuringEnum restructuringType) {
        this.restructuringType = restructuringType;
        return this;
    }

}
