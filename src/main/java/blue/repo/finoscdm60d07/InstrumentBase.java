package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8MCjc6n16rKBUEQ8sBEC5aiEqKobVQGgoGrCgFDv5MA2")
public class InstrumentBase {
    public static String blueId() {
        return "8MCjc6n16rKBUEQ8sBEC5aiEqKobVQGgoGrCgFDv5MA2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InstrumentBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InstrumentBase";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InstrumentBase.json";
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

    private LegalEntity exchange;

    private List<AssetIdentifier> identifier;

    private InstrumentTypeEnum instrumentType;

    private Boolean isExchangeListed;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    public String getNamespace() {
        return namespace;
    }

    public InstrumentBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public InstrumentBase exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public InstrumentBase identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public InstrumentTypeEnum getInstrumentType() {
        return instrumentType;
    }

    public InstrumentBase instrumentType(InstrumentTypeEnum instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public InstrumentBase isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public InstrumentBase relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public InstrumentBase taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

}
