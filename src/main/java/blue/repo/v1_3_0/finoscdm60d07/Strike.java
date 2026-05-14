package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CaocCHVjYu1fKtRwseiNp3Lrjxkb7J2MefybzYchQmyW")
public class Strike {
    public static String blueId() {
        return "CaocCHVjYu1fKtRwseiNp3Lrjxkb7J2MefybzYchQmyW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Strike";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Strike";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Strike.json";
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

    private PayerReceiverEnum buyer;

    private PayerReceiverEnum seller;

    private Double strikeRate;

    public String getNamespace() {
        return namespace;
    }

    public Strike namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PayerReceiverEnum getBuyer() {
        return buyer;
    }

    public Strike buyer(PayerReceiverEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public PayerReceiverEnum getSeller() {
        return seller;
    }

    public Strike seller(PayerReceiverEnum seller) {
        this.seller = seller;
        return this;
    }

    public Double getStrikeRate() {
        return strikeRate;
    }

    public Strike strikeRate(Double strikeRate) {
        this.strikeRate = strikeRate;
        return this;
    }

}
