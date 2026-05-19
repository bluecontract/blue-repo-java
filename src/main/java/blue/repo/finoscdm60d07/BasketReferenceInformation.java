package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("5yakKHouPPBWpvaoTmGaNrQ9dDFpa956Rt4ekRSLfbAB")
public class BasketReferenceInformation {
    public static String blueId() {
        return "5yakKHouPPBWpvaoTmGaNrQ9dDFpa956Rt4ekRSLfbAB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BasketReferenceInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BasketReferenceInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/BasketReferenceInformation.json";
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

    private List<FieldWithMetaString> basketId;

    private FieldWithMetaString basketName;

    private BigInteger mthToDefault;

    private BigInteger nthToDefault;

    private ReferencePool referencePool;

    private Tranche tranche;

    public String getNamespace() {
        return namespace;
    }

    public BasketReferenceInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getBasketId() {
        return basketId;
    }

    public BasketReferenceInformation basketId(List<FieldWithMetaString> basketId) {
        this.basketId = basketId;
        return this;
    }

    public FieldWithMetaString getBasketName() {
        return basketName;
    }

    public BasketReferenceInformation basketName(FieldWithMetaString basketName) {
        this.basketName = basketName;
        return this;
    }

    public BigInteger getMthToDefault() {
        return mthToDefault;
    }

    public BasketReferenceInformation mthToDefault(BigInteger mthToDefault) {
        this.mthToDefault = mthToDefault;
        return this;
    }

    public BigInteger getNthToDefault() {
        return nthToDefault;
    }

    public BasketReferenceInformation nthToDefault(BigInteger nthToDefault) {
        this.nthToDefault = nthToDefault;
        return this;
    }

    public ReferencePool getReferencePool() {
        return referencePool;
    }

    public BasketReferenceInformation referencePool(ReferencePool referencePool) {
        this.referencePool = referencePool;
        return this;
    }

    public Tranche getTranche() {
        return tranche;
    }

    public BasketReferenceInformation tranche(Tranche tranche) {
        this.tranche = tranche;
        return this;
    }

}
