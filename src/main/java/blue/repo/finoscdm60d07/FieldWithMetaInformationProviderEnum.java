package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HtcwNQFtRPdXtpWxPrnxLjDPGpFssuLYQvPmqzg5wd9X")
public class FieldWithMetaInformationProviderEnum {
    public static String blueId() {
        return "HtcwNQFtRPdXtpWxPrnxLjDPGpFssuLYQvPmqzg5wd9X";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaInformationProviderEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaInformationProviderEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaInformationProviderEnum.json";
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

    private MetaFields meta;

    private InformationProviderEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaInformationProviderEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaInformationProviderEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public InformationProviderEnum getVal() {
        return val;
    }

    public FieldWithMetaInformationProviderEnum val(InformationProviderEnum val) {
        this.val = val;
        return this;
    }

}
